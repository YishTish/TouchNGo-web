/**
 * Created by mrfonedo on 1/19/15.
 */
app.controller("mainCtrl",function($translate, $scope, $mdSidenav){
    $scope.openLeftMenu = function(){
        $mdSidenav('left').toggle();
    };

    $scope.getLang = function(){
        return $translate.preferredLanguage();
    };

    $translate.preferredLanguage('en');
    $translate.use($translate.preferredLanguage());


    $scope.longitude="";
    $scope.latitude="";

     var startPos;
     var geoSuccess = function(position) {
     $scope.longitude = position.coords.latitude;
     $scope.latitude = position.coords.longitude;
     };

    navigator.geolocation.getCurrentPosition(geoSuccess);

});

