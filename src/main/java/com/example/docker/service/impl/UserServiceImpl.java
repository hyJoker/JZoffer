package com.example.docker.service.impl;

import com.example.docker.bean.User;
import com.example.docker.mapper.UserMapper;
import com.example.docker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description
 * @Author Rex
 * @Date 2020-08-10 15:52
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUser(Long id) {
        return userMapper.queryUser(id);
    }

    @Override
    public Integer insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public Integer insertUsers(List<User> users) {
        return userMapper.insertUsers(users);
    }
}
