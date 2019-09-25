package com.mapper;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import com.pojo.User;

import java.util.List;

@Repository
public interface UserMapper {
    @Select("select * from user")
    @Results({
            @Result(property = "userName",column = "user_name")
    })
    List<User> findAll();
}
