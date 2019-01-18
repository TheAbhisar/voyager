var app = angular.module("loginModule", []);
app.controller("loginController", function
		($rootScope, $scope, $http, $uibModal, $state, $location,loginService) {
                 $scope.inValidCredentials= "";
                  $rootScope.userDetails = "";
                 $scope.popUpRegistrationPage = function(){
                 			var modelClass = "simple-Modal";
                 			$scope.openPopup = {
                 				windowClass : modelClass,
                 				backdrop:'static',
                 				keyboard :true,
                 				templateUrl: 'uiComponents/registration.html',
                 				dialogFade :true,
                 				resolve :{},
                 			};
                 			var modalInstance = $uibModal.open($scope.openPopup);
                 		}

                 		$scope.reset = function() {
                                    alert("reset all fields");
                                    $scope.userName = '';
                                    $scope.password = '';
                                    $scope.loginSuccess= false;
                                };
                        $scope.login = function() {
                                if ($scope.userName === "" || $scope.password === "") {
                                    alert(" Please fill in all values");
                                 return;
                                 }
                                 loginService.validateLogin($scope.userName, $scope.password,
                                    function(response) {
                                        if (response) {
                                        $rootScope.userDetails = response;
                                        var url = "weAssist";
                                            $location.path(url);
                                         } else {
                                         $scope.inValidCredentials = "Please enter valid user Name or password";
                                         $scope.reset();
                                         return;
                                         }
                                 });
                         }
		});