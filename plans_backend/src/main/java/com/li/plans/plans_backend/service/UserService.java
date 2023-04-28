package com.li.plans.plans_backend.service;

import com.li.plans.plans_backend.entity.PlansUser;
import com.li.plans.plans_backend.entity.ResponseResult;

public interface UserService {
    ResponseResult login(PlansUser user);

    ResponseResult singUp(PlansUser user);
}
