package com.li.plans.plans_backend.controller;

import com.li.plans.plans_backend.entity.PlansUser;
import com.li.plans.plans_backend.entity.ResponseResult;
import com.li.plans.plans_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public ResponseResult login(@RequestBody PlansUser user){
        return userService.login(user);
    }

    @RequestMapping("/siginup")
    public ResponseResult singnUp(@RequestBody PlansUser user){
        return userService.singUp(user);
    }



}
