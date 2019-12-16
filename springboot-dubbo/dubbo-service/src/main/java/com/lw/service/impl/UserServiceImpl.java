package com.lw.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lw.domain.User;
import com.lw.mapper.UserMapper;
import com.lw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public String hello(){
        return "hello dubbo";
    }

    @Override
    public List<User> findAll() {
        return userMapper.selectAll();
    }
}
