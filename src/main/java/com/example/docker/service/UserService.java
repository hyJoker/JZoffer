package com.example.docker.service;

import com.example.docker.bean.User;

public interface UserService {

    User queryUser(Long id);
}
