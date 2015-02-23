/**
 * Created by mrfonedo on 2/5/15.
 */
var app = angular.module('tng-webapp',['firebase',  'pascalprecht.translate', 'ngMaterial', 'ngMessages']);
app.value('fbURL' , 'https://browser-location.firebaseio.com');


app.config(['$httpProvider', function($httpProvider) {
    $httpProvider.defaults.xsrfCookieName = 'csrftoken';
    $httpProvider.defaults.xsrfHeaderName = 'X-CSRFToken';
}]);
