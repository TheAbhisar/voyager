var app = angular.module("weAssist", ['ui.router','ui.bootstrap', 'loginModule','newUserModel']);

app.config(function($urlRouterProvider, $stateProvider){
    $urlRouterProvider.otherwise('/login');
    $stateProvider
    .state('login', {
       url: '/login',
       templateUrl: 'uiComponents/loginPage.html'
   })
});