package com.example.docker.mapper;


import com.example.docker.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description
 * @Author Rex
 * @Date 2020-08-08 12:25
 * @Version 1.0
 **/
public interface UserMapper {

    @Select("select * from t_user t where t.id=#{id}")
    User queryUser(Long id);

    @Insert("insert into t_user(name,age,add_time) values(#{name},#{age},#{add_time})")
    int insertUser(User user);

    @Insert("<script>" +
            "insert into t_user(name, age, add_time) values" +
            "<foreach collection='list' item='item'  index='index' separator=','>" +
            "(#{item.name}, #{item.age}, #{item.add_time})" +
            "</foreach>" +
            "</script>")
    int insertUsers(List<User> users);
}
