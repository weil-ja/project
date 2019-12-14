package com.lw.demo.service;

import com.lw.demo.domain.User;

import java.util.List;

public interface UserService {
    // 查询所有学生信息
    List<User> getAll();

    List<User> findAll();
}