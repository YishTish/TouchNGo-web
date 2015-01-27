app.controller("locationCtrl",['$scope', "firebaseService", "$mdDialog", function($scope, firebaseService, $mdDialog){

	var template;


	$scope.divToDisplay = "list";

	formTitle = "New Location";

	var resetTemplate = function(){
		return {
			name: "",
			description: "",
			longitude: "",
			latitude: "",
			code: ""
		}
	};

	//$scope.locations = sync.$asArray();
	//var fbService = new firebaseService();
	$scope.locations = firebaseService.getList("locations");

	$scope.locations.$loaded().then(function(){
		$scope.showLocation = $scope.locations[0];
		for(var i=0; i< $scope.locations.length; i++){
			$scope.locations[i].indexPos = i;
		}
		$scope.selectItem(0);

	})

	$scope.activities = firebaseService.getList("activities");
	$scope.users = firebaseService.getList("users");

	$scope.editLocation = function(index, loc){
		firebaseService.update("locations", index, loc).then(
			function(response){
				console.log("location updated successfully");
			}
		)
	};

	$scope.saveLocation = function(location){
		//$scope.location.$save();
		if(location.$id)
			$scope.locations.$save(location);
		else
			$scope.locations.$add(location);
		$scope.editing = false;
		//firebaseService.update('locations',location);
	}

	$scope.delete = function(index){
		$scope.locations.$remove(index);
		//firebaseService.remove("locations",$scope.locations[index]);
		/*$scope.locations.$remove(index).then(function(){
			console.log("Element deleted");
		});*/
	};

	$scope.showLocationForm = function(ev) {
		$mdDialog.show({
			templateUrl: 'tpl/material/locationForm.html',
			targetEvent: ev,
			controller: ['$scope','$mdDialog', "firebaseService", function($scope, $mdDialog, firebaseService){
				$scope.answer = function(newLoc){
					firebaseService.add('locations',newLoc);
					$mdDialog.hide("New Location saved");
				}
			}]
			}
		)
			.then(function(answer){
				console.log(answer);
			}
			,function(){
				console.log("canceled form");
			});
	};

	$scope.answer = function(str){
		console.log(str);
	}


	$scope.getFormTitle = function(){
		return formTitle;
	}

	$scope.getShortDescription = function(description){
		var suffix = (description.length > 29) ? "..." : "";
		return description.substr(0,30)+suffix;
	}
	/*
	$scope.createLocation = function(){
		$scope.currentLocation=null;
		editing = true;
		currentItemIndex = -1;
		formTitle = "Edit Location";
		console.log($scope.currentLocation);
	}

	

	$scope.editLocation = function(){
		/*
		$scope.location  = $scope.locations[index];
		if(index < 0){
			indexPos = -1;
			locationPos= -1;
			$scope.location = {id:"",name:"",description:"",longitude:"",latitude:"",code:""}
		}
		console.log($scope.location);
		showForm = true;
		console.log("test");
	editing = true;
	$scope.currentLocation = $scope.location;
	formTitle = "Edit Location";
}
	 */

	$scope.insertLocationText = function(){
		return (insertingNewLocation ? "Hide" : "Create new");
	}
	
	$scope.showCurrent = function(locationIndex){
		$scope.location = $scope.locations[locationIndex];
		currentItemIndex = locationIndex;
		editing = false;

	};

	$scope.getCurrentIndex = function(){
		return currentItemIndex;
	}


	$scope.selectItem = function(index){
		$scope.selectedItem = index;
		$scope.location = $scope.locations[index];
		//$scope.editing = false;
	}

	$scope.editing = false;

	$scope.startEditing = function(){
		$scope.editing = true;
	};


}]);
