package com.lw.demo.controller;

import com.lw.demo.domain.User;
import com.lw.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<User> getAll() {
        return userService.getAll();
    }

    @RequestMapping("/findAll")
    public String findAll(ModelMap map) {
//        new User().setName("").setAge(90);
        map.put("list",userService.findAll());
        return "index";
    }

}