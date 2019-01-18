app.service("loginService", function($http) {

  this.validateLogin = function(userName, password,  callback) {
        $http.get(
            "restWeAssist/Login/validateLogin?userName=" + userName + "&password="
                + password ).success(callback);
    }
   this.registerNewUser = function(newUserRegistrationBean, callback){
        $http.post("rest/weAssist/registerNewUser?" +
        		    "newUserRegistrationBean="+newUserRegistrationBean).success(callback);
        }
});