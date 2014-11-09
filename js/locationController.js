app.controller("locationCtrl",['$scope', 'Restangular', 'locationsService', function($scope, Restangular,locationsService){
	
	locationsService.getLocations().then(function(locationList){
		$scope.locations = locationList;
		$scope.showLocation = $scope.locations[0];
		for(var i=0; i< $scope.locations.length; i++){
			$scope.locations[i].indexPos = i;
		}
		$scope.location = $scope.locations[0];
	});

	$scope.saveLocation = function(data){
		var location = _.clone(data);
		data.name = data.description = data.longitude = data.latitude = '';
		if(location.id > 0){
			Restangular.one('location').customPUT(location).then(function(data){
				//location.editing = false;
				console.log(data);
			});
		}
		else{
			Restangular.one('location').customPOST(location).then(function(data){
				location.editing = false;
				location.id = data.id;
				location.code = data.code;
				var listLength = $scope.locations.length;
				insertingNewLocation = false;
				$scope.locations[listLength] = location;
			});
		}
		//$scope.toggleEditing();
		editing = false;
	};
	
	$scope.delete = function(location){
		Restangular.one("location").customDELETE(location.id).then(function(){
			var index = $scope.locations.indexOf(location);
			$scope.locations.splice(index, 1);
		});
	};


	insertingNewLocation = false;
	formTitle = "New Location";


	$scope.getFormTitle = function(){
		return formTitle;
	}

	$scope.createLocation = function(){
		$scope.currentLocation=null;
		editing = true;
		currentItemIndex = -1;
		formTitle = "Edit Location";
		console.log($scope.currentLocation);
	}

	
	editing = false;
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
		*/
		console.log("test");
		editing = true;
		$scope.currentLocation = $scope.location;
		formTitle = "Edit Location";
	}

	$scope.insertLocationText = function(){
		return (insertingNewLocation ? "Hide" : "Create new");
	}
	
	$scope.isEditing = function(){
		return editing;
	}

	currentItemIndex = 0;

	$scope.showCurrent = function(locationIndex){
		$scope.location = $scope.locations[locationIndex];
		currentItemIndex = locationIndex;
		editing = false;

	};

	$scope.getCurrentIndex = function(){
		return currentItemIndex;
	}

}]);
