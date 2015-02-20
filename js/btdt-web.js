//var app = angular.module('tngweb',['ngRoute', 'firebase',  'ui.bootstrap', 'pascalprecht.translate']).
//	value('fbURL' , 'https://resplendent-fire-842.firebaseio.com');
var app = angular.module('tngweb',['ngRoute', 'firebase',  'pascalprecht.translate', 'ngMaterial', 'ngMessages']);
app.value('fbURL' , 'https://resplendent-fire-842.firebaseio.com');


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
   templateUrl: 'tpl/locations.html'
 }).when('/timeline',{
 templateUrl: 'tpl/timeline.html'
 }).otherwise({
  templateUrl: 'tpl/main.html'
 })
 }
 ]);

/*
if (navigator.geolocation) {
 console.log('Geolocation is supported!');
}
else {
 console.log('Geolocation is not supported for this Browser/OS version yet.');
}
*/

/*
window.onload = function() {
 var startPos;
 var geoSuccess = function(position) {
  startPos = position;
  document.getElementById('startLat').innerHTML = startPos.coords.latitude;
  document.getElementById('startLon').innerHTML = startPos.coords.longitude;
 };
 navigator.geolocation.getCurrentPosition(geoSuccess);
};
*/