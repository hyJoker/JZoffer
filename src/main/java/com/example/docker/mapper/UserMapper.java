package com.example.docker.mapper;


import com.example.docker.bean.User;

/**
 * @ClassName UserMapper
 * @Description
 * @Author Rex
 * @Date 2020-08-08 12:25
 * @Version 1.0
 **/
public interface UserMapper {

    User queryUser(Long id);
}
