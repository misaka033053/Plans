package com.li.plans.plans_backend.service;

import com.li.plans.plans_backend.entity.PlansUser;
import com.li.plans.plans_backend.entity.ResponseResult;

public interface LoginService {
    ResponseResult login(PlansUser user);
}
