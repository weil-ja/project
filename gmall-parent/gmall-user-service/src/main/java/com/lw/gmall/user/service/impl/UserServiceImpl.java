package com.lw.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lw.gmall.user.domain.User;
import com.lw.gmall.user.mapper.UserMapper;
import com.lw.gmall.user.service.UserService;
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
