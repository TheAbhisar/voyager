package com.weAssist.components.comtrollers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restWeAssist/Register")
public class RegisterUser {

    @RequestMapping(method = RequestMethod.POST, value = "/registerNewUser")
    public boolean RegisterUser(@RequestParam(value = "newUserRegistrationBean", required = true) Object RegisterUserDetails) {

        return true;
    }
}
