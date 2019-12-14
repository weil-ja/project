package com.lw.demo.service.impl;

import com.lw.demo.domain.User;
import com.lw.demo.mapper.UserMapper;
import com.lw.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public List<User> findAll() {
        return userMapper.selectAll();
    }
}