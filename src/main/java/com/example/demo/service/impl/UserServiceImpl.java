package com.example.demo.service.impl;

import java.util.Objects;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;
import org.apache.commons.lang3.StringUtils;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.Staff;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import tk.mybatis.mapper.entity.Example;

/**
 * @author xuzhou
 * @version 1.0.0
 * @title UserServiceImpl
 * @date 2020/12/18 17:32
 */
@Service
public class UserServiceImpl implements UserService {

    public static final String COOKIE_NAME_TOKEN = "token";

    public static final int TOKEN_EXPIRE = 3600 * 24 * 2;

    @Resource
    private UserMapper userMapper;

    @Override
    public String login(String username, String password, HttpServletResponse response) {

        Example selectCondition = Example.builder(User.class).build();
        selectCondition.createCriteria().andEqualTo("username",username);
        User user = userMapper.selectOneByExample(selectCondition);
        if (Objects.isNull(user)){
            return "fail";
        }
        return StringUtils.equals(user.getPassword(), password) ? "success" : "fail";
    }



}
