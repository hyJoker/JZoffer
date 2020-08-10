package com.example.docker.service;

import com.example.docker.bean.User;

import java.util.List;

public interface UserService {

    User queryUser(Long id);

    Integer insertUser(User user);

    Integer insertUsers(List<User> users);
}
