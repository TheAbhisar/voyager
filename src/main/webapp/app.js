var app = angular.module("weAssist", ['ui.router','ui.bootstrap', 'ngGrid','loginModule','newUserModel','weAssistMainModule']);

app.config(function($urlRouterProvider, $stateProvider){
    $urlRouterProvider.otherwise('/login');
    $stateProvider
    .state('login', {
       url: '/login',
       templateUrl: 'uiComponents/loginPage.html'
   }).state('weAssist', {
             url: '/weAssist',
             templateUrl: 'uiComponents/weAssist.html'
         })

});