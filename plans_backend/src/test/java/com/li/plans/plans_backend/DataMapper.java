package com.li.plans.plans_backend;

import com.li.plans.plans_backend.entity.PlansUser;
import com.li.plans.plans_backend.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = PlansBackendApplication.class)
public class DataMapper {
    @Autowired
    private UserMapper userMapper;
    @Test
    @Rollback
    public void findByName() throws Exception {
        PlansUser userLogins = userMapper.queryByName("aa");
    }
}

