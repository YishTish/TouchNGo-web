app.controller("userCtrl", [ "$scope","$firebase", "fbURL",function($scope, $firebase, fbURL){

	var ref = new Firebase(fbURL+'/users');
	var sync = $firebase(ref);



	$scope.users = sync.$asArray();
	$scope.user = { fname: "", lname: "", email:""};
	
	for(user in $scope.users){
		user.editing = false;
	}

	insertingNewUser = false;

	$scope.editUser = function(user){
		user.$update();
	};

	$scope.insertUser = function(user,index){
		console.log(user);
		if(user.$id && user.$id!=""){
			delete user['editing'];
			$scope.users.$save(index);
		}
		else{
			user.type = "0";
			$scope.users.$add(user);
		}
		//console.log(user);
		//$scope.users.$add($scope.user).then(function(response){
		//	console.log(response);
		//});
	};


	$scope.deleteUser = function(userIndex){
		$scope.users.$remove(userIndex);
	};

	$scope.showUser= function(userId){
		return userId > 0;
	};

	$scope.enableEditUser = function(user){
		user.editing = !user.editing;
	};
	
	$scope.showEditUser=function (user){
		return user.editing;
	};
	$scope.editUserText = function(user){
		if(user.editing == true)
			return "Hide";
		else
			return "Edit";
	}

	$scope.enableInsertUser = function(user){
		insertingNewUser = !insertingNewUser;
	};

	$scope.showInsertUser=function (user){
		return insertingNewUser;
	};
	$scope.insertUserText = function(user){
		if(insertingNewUser)
			return "Hide";
		else
			return "Insert new";
	}

	$scope.selectItem = function(index){
		$scope.selectedItem = index;
		$scope.user = $scope.users[index];
	}


}]);