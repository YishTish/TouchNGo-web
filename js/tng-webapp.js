/**
 * Created by mrfonedo on 2/5/15.
 */
var app = angular.module('tng-webapp',['firebase',  'pascalprecht.translate', 'ngMaterial', 'ngMessages']);
app.value('fbURL' , 'https://browser-location.firebaseio.com');

/*app.run(function($http, $cookies) {
    console.log($cookies);
    $http.defaults.headers.post['X-CSRFToken'] = $cookies.csrftoken;
});
*/
/*app.config(['$httpProvider', function($httpProvider, $cookies) {
    $httpProvider.defaults.xsrfCookieName = 'csrftoken';
    $httpProvider.defaults.xsrfHeaderName = 'X-CSRFToken';
    //$httpProvider.defaults.headers.post['X-CSRFToken'] = $('input[name=csrfmiddlewaretoken]').val();
}]);
*/
