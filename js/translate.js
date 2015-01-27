/**
 * Created by mrfonedo on 1/18/15.
 */
app.config(['$translateProvider', function ($translateProvider) {

    $translateProvider.translations('en', {
        'USERS': 'Users',
        'LOCATIONS': 'Locations',
        'TIMELINE': 'Timeline',
        'SETTINGS': 'Settings'
    });

    $translateProvider.translations('he', {
        'USERS': 'משתמשים',
        'LOCATIONS': 'מקומות',
        'TIMELINE': 'זמנים',
        'SETTINGS': 'הגדרות'
    });
    $translateProvider.translations('de', {
        'TITLE': 'Hallo',
        'FOO': 'Dies ist ein Paragraph'
    });

    $translateProvider.preferredLanguage('en');
}]);