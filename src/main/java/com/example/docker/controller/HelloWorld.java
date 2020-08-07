package com.example.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloWorld
 * @Description hello world  接口测试类
 * @Author Rex
 * @Date 2020-08-07 17:54
 * @Version 1.0
 **/
@RestController
public class HelloWorld {

    @RequestMapping("/hello")
    public String hello() {
        return "hello world!!";
    }
}
