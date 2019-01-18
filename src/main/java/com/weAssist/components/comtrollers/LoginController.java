package com.weAssist.components.comtrollers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weAssist/Login")

/**
 *  This controller is used to validate the Login
 */
public class LoginController {
    @RequestMapping(method = RequestMethod.GET, value = "/validateLogin")
    public boolean validate(@RequestParam(value = "customerId", required = true) String customerId,
                            @RequestParam(value = "password", required = true) String password) {

        return true;
    }
}
