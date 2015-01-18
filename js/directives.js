/**
 * A generic confirmation for risky actions.
 * Usage: Add attributes: ng-really-message="Are you sure"? ng-really-click="takeAction()" function
 */
app.directive('ngReallyClick', [function() {
    return {
        restrict: 'A',
        link: function(scope, element, attrs) {
            element.bind('click', function() {
                var message = attrs.ngReallyMessage;
                if (message && confirm(message)) {
                    scope.$apply(attrs.ngReallyClick);
                }
            });
        }
    }
}]);

app.directive('btdtHeader', function(){
    return{
        templateUrl: "tpl/header.html",
        restrict: "AEC",
        replace: 'true',
        controller: function($scope, $location){
            $scope.isActive = function(viewLocation){
                return viewLocation == $location.path();
            }
        }
    }
});

app.directive('editLocation', ['firebaseService', function(firebaseService){
    return{
        restrict: "AEC",
        templateUrl: "tpl/locationForm.html",
        replace: 'true',
        scope: {
            divToDisplay: '='
        },
        link: function(scope, element, attr){
            if(!scope.loc || scope.loc==undefined || scope.loc=="")
            {
               scope.loc = {name: "", description: "", longitude:"", latitude: ""};
           }
           else
                console.log(scope.loc);
        },
        controller: ['$scope' , function($scope){
              $scope.saveLocation = function (data) {
              console.log(data);
              firebaseService.add("locations",data);
              $scope.divToDisplay = "list";
          }
        }]
        }}]
);

app.directive('locationDetails',function(){
    return{
        restrict: "AEC",
        templateUrl: "tpl/locationDetails.html",
        replace: 'true'
    }
});

app.directive('locationList', function(){
    return{
        restrict: 'AEC',
        replace: 'true',
        templateUrl: 'tpl/locationList.html'
}
});


app.directive('saveLocation', function(){
    return{
        restrict: 'A',
        link: function(scope, elem, attr){
            elem.bind('click',function(){
                scope.divToDisplay = "list";
                console.log(elem);
            })
        }
    }
});