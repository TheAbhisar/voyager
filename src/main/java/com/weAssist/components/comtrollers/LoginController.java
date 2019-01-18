package com.weAssist.components.comtrollers;

import com.weAssist.model.UserDetails;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restWeAssist/Login")
//validateLogin
/**
 *  This controller is used to validate the Login
 */
public class LoginController {

    @RequestMapping(method = RequestMethod.GET, value = "/validateLogin")
    public UserDetails validate(@RequestParam(value = "userName", required = true) String userName,
                                @RequestParam(value = "password", required = true) String password) {
        if(!StringUtils.isEmpty(userName) && !StringUtils.isEmpty(password) && matchUserNamePassowrd(userName, password)) {
            UserDetails userDetails =  new UserDetails();
            userDetails.setFirst_name("Abhijeet");
            userDetails.setLast_name("Mohanty");
            userDetails.setUserId(123456);
            return userDetails;
        }
        return new UserDetails();
    }

    private boolean matchUserNamePassowrd(String customerId, String password) {
        return true;
    }
}
