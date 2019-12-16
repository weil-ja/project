package com.lw.service;

import com.lw.domain.User;

import java.util.List;

public interface UserService {
    String hello();

    List<User> findAll();
}
