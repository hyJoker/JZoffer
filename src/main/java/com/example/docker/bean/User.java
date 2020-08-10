package com.example.docker.bean;

import java.util.Date;

/**
 * @ClassName UserMapper
 * @Description t_user 对应实体类
 * @Author Rex
 * @Date 2020-08-08 12:49
 * @Version 1.0
 **/
public class User {
    private Long id;
    private String name;
    private Integer age;
    private Date add_time;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getAdd_time() {
        return add_time;
    }

    public void setAdd_time(Date add_time) {
        this.add_time = add_time;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", add_time=" + add_time +
                '}';
    }
}
