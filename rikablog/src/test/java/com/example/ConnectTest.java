package com.example;

import com.example.entity.MUser;
import com.example.service.MUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConnectTest {
    @Autowired
    MUserService mUserService;

    @Test
    public void contextLoads() {
        MUser user = mUserService.getById(1);
        System.out.println(user.toString());
    }
}
