package com.zhou;

import com.zhou.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ZzhWorkApplicationTests {

    @Autowired
    UserServiceImpl userService;

    @Test
    void contextLoads() {
        userService.addUser("123","123");
    }

}
