/**
 * Created by mrfonedo on 1/19/15.
 */
app.controller("mainCtrl",function($scope, $mdSidenav){
    $scope.openLeftMenu = function(){
        $mdSidenav('left').toggle();
    };
});

