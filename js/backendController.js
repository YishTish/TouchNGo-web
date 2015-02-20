/**
 * Created by mrfonedo on 2/9/15.
 */
app.controller("backendCtrl",["$translate","$scope","firebaseService","fbURL", "$mdToast", "$http", function($translate, $scope, firebaseService, fbURL, $mdToast, $http) {

    firebaseService.setDb(fbURL);


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
        $http.get("https://rest.nexmo.com/sms/json?api_key=835ff543&api_secret=68d3f00d&from=Yishai&to="+$scope.user.phone+"&text=Hello.+Please+follow+this+link:+https://resplendent-fire-842.firebaseapp.com/client.html#/?case="+$scope.activity.$id)
            .success(function(data, status, headers, config) {
            console.log(data);
        }).
            error(function(data, status, headers, config) {
               console.log(data);
            });
    };

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