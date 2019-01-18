app.controller("myAssistController", function
		($rootScope, $scope, $http, $uibModal, $state, $location,loginService) {
                $scope.displayGrid = false;
		        $scope.assistantaneTypeList=[
		                            "Travel",
		                            "HouseKeeping",
		                            "Reading",
		                            "Writting",
		                            "Baby Sitting"];
		        $scope.myAssistanceDuration=[
                		                            "1",
                		                            "2",
                		                            "3",
                		                            "4",
                		                            ">5"];
                $scope.myAssistance={
                        assistentWorkType :"",
                        duration: "",
                }

                $scope.gridOptions = {
                                data : 'myAssistanceDetails',
                                columnDefs : [
                                    { field : 'userId', displayName : 'ID'  },
                                    { field : 'assistentName', displayName : 'Assistance Name' },
                                    { field : 'latestAvailableTime', displayName : 'Latest Available Time'},
                                    { field : 'assistentRating', displayName : 'Ratings' },
                                    { field : 'assistentWorkType', displayName : 'Wprk Type' },
                                ],
                                enableColumnResize : true,
                                enableColumnReordering : true,
                                enableRowSelection : true,
                                rowHeight : 40
                                };

                 $scope.locateAssist =  function (){
                        loginService.seekAssistance(JSON.stringify($scope.myAssistance), function(response) {
                              if (response) {
                                $scope.displayGrid = true;
                                $scope.myAssistanceDetails = response;
                              }
                       });
                 }
                $scope.submitAssistanceDetails = function(){
                    alert("your Request has been Approve");
                }
		});