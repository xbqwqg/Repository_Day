package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mapper.UserMapper;
import com.pojo.User;

import java.util.List;

@Service
public class ImUserService implements UserService {
    @Autowired
    private UserMapper mapper;
    public List<User> findAll() {
        return mapper.findAll();
    }
}

