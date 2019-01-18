app.service("loginService", function($http) {

  this.validateLogin = function(userName, password,  callback) {
        $http.get(
            "restWeAssist/Login/validateLogin?userName=" + userName + "&password="
                + password ).success(callback);
    }
   this.registerNewUser = function(newUserRegistrationBean, callback){
        $http.post("restWeAssist/Register/registerNewUser?" +
        		    "newUserRegistrationBean="+newUserRegistrationBean).success(callback);
        }
     this.seekAssistance = function(myAssistance, callback){
             $http.post("restWeAssist/Assist/seekAssistance?" +
             		    "myAssistance="+myAssistance).success(callback);
     }

});