package com.arya.commsult.controller;

import com.arya.commsult.common.APIResponse;
import com.arya.commsult.model.User;
import com.arya.commsult.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
@CrossOrigin
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping
    public APIResponse login(@RequestBody User user) {
        return loginService.login(user);
    }
}
