package com.example.demo.web.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.common.ApiResponse;
import com.example.demo.service.StaffManageMentService;
import com.example.demo.service.UserService;

/**
 * @author xuzhou
 * @version 1.0.0
 * @title indexController
 * @date 2020/12/18 17:07
 */
@Controller
public class LoginController {
    @Resource
    private UserService userService;

    @Resource
    private StaffManageMentService staffManageMentService;

    @PostMapping(value = "/login")
    @ResponseBody
    public String login(@RequestParam("username") String username,
                             @RequestParam("password") String password,
                             HttpServletResponse response){

        return userService.login(username, password, response);
    }


}
