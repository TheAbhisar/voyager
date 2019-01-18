package com.weAssist.components.comtrollers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weAssist/Register")
public class RegisterUser {

    @RequestMapping(method = RequestMethod.GET, value = "/registerUser")
    public boolean RegisterUser(@RequestParam(value = "RegisterUserDetails", required = true) Object RegisterUserDetails) {

        return true;
    }
}
