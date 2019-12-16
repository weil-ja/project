package com.lw.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lw.domain.User;
import com.lw.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DemoController {

    @Reference(version = "1.0.0")
    UserService userService;

    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        return userService.hello();
    }
    @RequestMapping("/findAll")
    @ResponseBody
    public List<User> user(){
        return userService.findAll();
    }
}
