/**
 * Created by mrfonedo on 1/19/15.
 */
app.controller("clientCtrl",["$translate","$scope","$location","firebaseService", "fbURL", "$mdToast", function($translate, $scope, $location, firebaseService, fbURL, $mdToast){

    firebaseService.setDb(fbURL);



    setActivityAndUserObjects = function(activity){
        $scope.activity = activity;
        if(activity.userKey){
            firebaseService.getByKey("users",activity.userKey,function(user){$scope.user = user;
                                            console.log($scope.user);
                                            console.log($scope.activity)});
        }
    }

    firebaseService.getByKey("activities",$location.search().case,setActivityAndUserObjects);

    $scope.getLang = function(){
        return $translate.preferredLanguage();
    };

    $translate.preferredLanguage('en');
    $translate.use($translate.preferredLanguage());


    $scope.longitude="";
    $scope.latitude="";
    $scope.address ="";

    var startPos;
    var geoSuccess = function(position) {
        $scope.longitude = position.coords.longitude;
        $scope.latitude = position.coords.latitude;
        $scope.$apply();
        $scope.getAddress($scope.latitude,$scope.longitude);
    };

    navigator.geolocation.getCurrentPosition(geoSuccess);

    $scope.getAddress = function(lat,lng) {
        console.log("Getting address info for:"+lat+","+lng);
        geocoder = new google.maps.Geocoder();
        var latlng = new google.maps.LatLng(lat, lng);
        geocoder.geocode({'latLng': latlng, 'language': 'he'}, function (results, status) {
            if (status == google.maps.GeocoderStatus.OK) {
                if (results[1]) {
                    $scope.address = results[0].formatted_address;
                    $scope.$apply();
                }
            } else {
                alert("Geocoder failed due to: " + status);
            }
        });
    };

    $scope.saveLocation = function(){
        $scope.activity.longitude = $scope.longitude;
        $scope.activity.latitude = $scope.latitude;
        $scope.activity.address = $scope.address;
        $scope.activity.$save();
        $mdToast.show($mdToast.simple().content('Your location was sent to the service provider. You can close the browser'));
    }

}]);
