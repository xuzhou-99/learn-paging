package com.example.demo.service;

import javax.servlet.http.HttpServletResponse;

/**
 * @author xuzhou
 * @version 1.0.0
 * @title UserService
 * @date 2020/12/18 17:10
 */
public interface UserService {
    String login(String username, String password, HttpServletResponse response);

}
