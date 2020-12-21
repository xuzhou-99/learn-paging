package com.example.demo.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 状态
 *
 * @author xuzhou
 * @version 1.0.0
 * @title Status
 * @date 2020/12/2 17:58
 */
@Getter
@AllArgsConstructor
public enum Status {
    /**
     * success
     */
    SUCCSEE(true,200,"操作成功！"),
    /**
     * fail
     */
    FAIL(false,500,"操作失败！"),
    /**
     * unknown_error
     */
    UNKNOWN_ERROR(false,500,"服务端未知错误：%s"),
    ;

    /**
     * 是否成功
     */
    private final Boolean success;
    /**
     * 状态码
     */
    private final Integer code;
    /**
     * 消息
     */
    private final String message;


}
