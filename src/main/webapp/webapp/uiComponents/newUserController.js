var app = angular.module("newUserModel", []);

app.controller("newUserController",    function($rootScope,
                    $scope, $http, $state, loginService,) {

            $scope.genderList = [ 'Male', 'Female' ];
            $scope.disabilityList = ['Not Disabled',
                        'Visually Challenged',
                        'Pregnant Women',
                        'Senior Citizen',
                        'Deaf','Dump']
             $scope.bankIdList=["State Bank Of India",
                                                "HDFC Bank",
                                                "ICICI Bank",
                                                "Kotak Mahindra Bank",
                                                "Others"]
             $scope.newUserRegistrationBean = {
                                    userName : "",
                                    email : "",
                                    gender : "" ,
                                    date : "",
                                    cellNo :"",
                                    panCard : "",
                                    aadhar : "",
                                    password : "",
                                    bankDetails :"",
                                    accountNo :"",
                                    confirmPassword : "",
                                    disability:"",
                   };
                $scope.submitUser = function(){
                        alert("Hello"+$scope.newUserRegistrationBean.userName);

                        loginService.registerNewUser(JSON.stringify($scope.newUserRegistrationBean), function(response) {
                            if (response) {
                                alert("ok");
                            }
                        }
                        );
                    };
});