package com.example.docker;

import com.example.docker.bean.User;
import com.example.docker.service.UserService;
import net.bytebuddy.utility.RandomString;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
class DockerApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void queryUser() {
        User user = userService.queryUser(1L);
        System.out.println(user);
    }

    @Test
    void insertUser() {
        for (int i = 0; i < 100000; i++) {
            User user = new User();
            user.setName(RandomString.make(3));
            user.setAge((int) (Math.random() * 100));
            user.setAdd_time(new Date());
            userService.insertUser(user);
            System.out.println(user);
        }
    }

    @Test
    void insertUsers() {
        for (int j = 0; j < 10000; j++) {
            List<User> users = new ArrayList<>();
            for (int i = 0; i < 1000; i++) {
                User user = new User();
                user.setName(RandomString.make(3));
                user.setAge((int) (Math.random() * 100));
                user.setAdd_time(new Date());
                users.add(user);
            }
            Integer integer = userService.insertUsers(users);
            System.out.println(integer);
        }
    }
}
