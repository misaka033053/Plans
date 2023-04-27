package com.li.plans.plans_backend.controller;

import com.li.plans.plans_backend.entity.PlansUser;
import com.li.plans.plans_backend.entity.ResponseResult;
import com.li.plans.plans_backend.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    public ResponseResult login(@RequestBody PlansUser user){
        return loginService.login(user);
    }

}
