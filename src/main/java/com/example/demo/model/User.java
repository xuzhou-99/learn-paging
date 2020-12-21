package com.example.demo.model;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 登录账号
 *
 * @author xuzhou
 * @version 1.0.0
 * @title Account
 * @date 2020/12/18 15:13
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "db_wam_sys.t_accounts")
public class User {
    /**
     * 员工编号
     */
    private Integer id;
    /**
     * 登录用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
}
