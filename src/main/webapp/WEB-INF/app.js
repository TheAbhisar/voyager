var app = angular.module('mainApp', 
		['inputDirective','treeGrid','ui.router','ui.bootstrap','ngGrid','loginmodule','personalInformationModule',
			'stockInformationModule','upDateInformationModule','treeGridControllerModule' ]);

app.controller('myCtrl' , function ($rootScope, $scope, loginService){
	$rootScope.isLoginSuccessfull = false;  
});
		
app.config(function($urlRouterProvider, $stateProvider){
	 $urlRouterProvider.otherwise('/login');
	 $stateProvider
	 .state('login', {
        url: '/login',
        templateUrl: 'uiComponents/loginPage.html'
    })
});
