package com.li.plans.plans_backend.mapper;

import com.li.plans.plans_backend.entity.PlansUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    PlansUser queryByName(String name);
}
