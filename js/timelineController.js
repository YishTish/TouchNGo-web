app.controller("timelineCtrl",['$scope', "firebaseService", function($scope, firebaseService){


	$scope.divToDisplay = "list";



	//$scope.locations = sync.$asArray();
	//var fbService = new firebaseService();
	$scope.locations = firebaseService.getList("locations");
	$scope.activities = firebaseService.getList("activities");
	$scope.users = firebaseService.getList("users");


}]);
