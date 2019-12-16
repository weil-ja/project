package com.lw.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lw.gmall.user.domain.User;
import com.lw.gmall.user.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DemoController {

    @Reference
    UserService userService;

    @RequestMapping("/index")
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
