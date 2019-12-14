package com.lw.demo.mapper;

import com.lw.demo.domain.User;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<User> {
    // 查询所有学生信息
    List<User> getAll();
}