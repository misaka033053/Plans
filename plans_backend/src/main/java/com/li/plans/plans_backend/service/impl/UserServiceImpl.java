package com.li.plans.plans_backend.service.impl;

import com.li.plans.plans_backend.entity.PlansUser;
import com.li.plans.plans_backend.entity.ResponseResult;
import com.li.plans.plans_backend.service.UserService;
import com.li.plans.plans_backend.utils.RedisCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private RedisCache redisCache;

    @Override
    public ResponseResult login(PlansUser user) {




        return null;
    }

    @Override
    public ResponseResult singUp(PlansUser user) {
        return null;
    }


}
