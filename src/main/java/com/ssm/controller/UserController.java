package com.ssm.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.entity.User;
import com.ssm.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 获取用户
     * @return 
     * @throws java.io.IOException
     */
    @RequestMapping(value = "/toAddUser")
    public String addUser() throws IOException {
        User user = new User();
        user.setUsername("test");
        user.setPassword("password");
        userService.insert(user);
        return "success";
    }
}
