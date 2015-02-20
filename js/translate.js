/**
 * Created by mrfonedo on 1/18/15.
 */
app.config(['$translateProvider', function ($translateProvider) {

    $translateProvider.translations('en', {
        'USERS': 'Users',
        'LOCATIONS': 'Locations',
        'TIMELINE': 'Timeline',
        'SETTINGS': 'Settings',
        'EMAIL': 'Email',
        'MEMBER SINCE': 'Member Since',
        'WHEN': 'When',
        'WHERE': 'Where',
        'WHO': 'Who',
        'ACTIVITY': 'Activity',
        'COMMENTS': 'Comments',
        'ADD NEW': 'Add New'
    });

    $translateProvider.translations('he', {
        'USERS': 'משתמשים',
        'LOCATIONS': 'מקומות',
        'TIMELINE': 'זמנים',
        'SETTINGS': 'הגדרות',
        'EMAIL': 'דוא״ל',
        'MEMBER SINCE': 'תאריך הרשמה',
        'WHEN': 'מתי',
        'WHERE': 'איפה',
        'WHO': 'מי',
        'ACTIVITY': 'פעילות',
        'COMMENTS': 'הערות',
        'ADD NEW':'הוסף חדש'
    });


    $translateProvider.preferredLanguage('en');
}]);