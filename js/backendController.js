/**
 * Created by mrfonedo on 2/9/15.
 */
app.controller("backendCtrl",["$translate","$scope","firebaseService","fbURL", "$mdToast", "$http", function($translate, $scope, firebaseService, fbURL, $mdToast, $http) {

    firebaseService.setDb(fbURL);
    getDomainCsrf();


    $scope.saveUser = function(callback){
        if($scope.user.$id){
            console.log($scope.user.$id);
            $scope.user.$save();
        }
        else {
            firebaseService.add("users", $scope.user).then(function (response) {
                    assignUserObject(response);
                    $scope.activity.userKey = response.key();
                    callback($scope.activity);
                    $mdToast.show($mdToast.simple().content('Activity Saved. Client page: <a href=\"/client.html#/?case='+$scope.activity.$id+'\">Click</a>'));
            });
        }

    }


    $scope.saveInstance = function(){
        var update = false;
        if($scope.user.$id){
            update = true;
            $scope.user.$save();
        }
        if($scope.activity.$id){
            update = true;
            $scope.activity.$save();
        }
        if(!update) {
            $scope.saveUser(saveActivityData);
        }
    }


    $scope.sendSms = function(){
        var message = {
            "phone": $scope.user.phone,
            "key": $scope.activity.$id
        }
        var token ="";
        getDomainCsrf().then(function(response){
            token = response.csrf_token;
            $http.post("http://api.touchngo.io",message)
                .success(function(data, status, headers, config) {
                    console.log(data);
                }).
                error(function(data, status, headers, config) {
                    console.log(data);
                });
        });
    };

    getDomainCsrf = function(){
        if($location.host() != 'touchngo.io'){
            return "";
        }
        else{
            $http.get("http://api.touchngo.io/getCsrf").then(function(response){
                $httpProvider.defaults.xsrfCookieName = 'csrftoken';
                $httpProvider.defaults.xsrfHeaderName = 'X-CSRFToken';
                console.log("csrf token set");
            });
        }
    }

    saveActivityData = function(activity){
        firebaseService.add("activities",activity).then(assignActivityObject);

    }

    assignActivityObject = function(activity){
        firebaseService.getByKey("activities", activity.key(),function(response){
            $scope.activity = response;
        });

    }

    assignUserObject = function(user){
        firebaseService.getByKey("users", user.key(),function(response){
                        $scope.user = response;
                        });
    }
}]);