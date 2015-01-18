var app = angular.module('tngweb',['ngRoute', 'firebase',  'ui.bootstrap']).
	value('fbURL' , 'https://resplendent-fire-842.firebaseio.com');


app.controller("navCtrl", function($scope){
	$scope.location_nav = "";
	$scope.user_nav = ""

	$scope.updateNavClass = function(currentNav){
		eval('$scope.'+currentNav) = "active";
	};
});

 app.config([
 '$routeProvider', function($routeProvider){
 $routeProvider.when('/users',{
 templateUrl: 'tpl/users.html',
 controller: 'userCtrl'
 }).when('/locations',{
   templateUrl: 'tpl/locations.html',
   //controller: 'locationCtrl'
 }).when('/locations1',{
 templateUrl: 'tpl/locations1.html',
     //controller: 'locationCtrl'
 })
 }
 ]);
/*
 app.config(function (RestangularProvider){
 RestangularProvider.setBaseUrl('http://localhost:9000')
 });


 app.factory("btdtResource", function($resource){
 var btdtResource = $resource("http://localhost:9000/members/:id", {id:"@id"},
 {'update' :{method : 'PUT', url : "http://localhost:9000/member"},
 'save'  :{method : 'POST', url : "http://localhost:9000/member" }
 });
 return btdtResource;
 });

 */


