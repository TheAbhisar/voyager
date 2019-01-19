var app = angular.module("weAssistMainModule", []);
app.controller("weAssistMainController", function
		($rootScope, $scope, $http, $uibModal, $state, $location,loginService) {
            $scope.userName=$rootScope.userDetails.first_name

		});