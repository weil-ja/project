package com.lw.gmall.user.service;

import com.lw.gmall.user.domain.User;

import java.util.List;

public interface UserService {
    String hello();

    List<User> findAll();
}
