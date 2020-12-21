package com.example.demo.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import static com.example.demo.common.Status.FAIL;
import static com.example.demo.common.Status.SUCCSEE;

/**
 * 返回结果
 *
 * @author xuzhou
 * @version 1.0.0
 * @title ApiResopnse
 * @date 2020/12/2 17:40
 */
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse {
    /**
     * 是否成功
     */
    private boolean success;
    /**
     * 状态码
     */
    private int code;
    /**
     * 消息
     */
    private String message;

    /**
     * 自定义相应实体
     * 静态
     *
     * @param success 是否成功
     * @param code 状态码
     * @param message 消息
     * @return ApiResopnse
     */
    public static ApiResponse of(final Boolean success, final Integer code, final String message){
        return new ApiResponse(success,code,message);
    }

    /**
     * 无参构造 成功
     *
     * @return ApiResponse
     */
    public static ApiResponse ofSuccess(){
        return of(SUCCSEE.getSuccess(),SUCCSEE.getCode(),SUCCSEE.getMessage());
    }

    /**
     * 有参构造 成功
     *
     * @param message 自定义消息
     * @return ApiResponse
     */
    public static ApiResponse ofSuccess(final String message){
        return of(SUCCSEE.getSuccess(),SUCCSEE.getCode(),message);
    }


    /**
     * 无参构造 失败
     *
     * @return ApiResponse
     */
    public static ApiResponse ofFail(){
        return of(FAIL.getSuccess(),FAIL.getCode(),FAIL.getMessage());
    }

    /**
     * 有参构造，失败
     *
     * @param message 自定义消息
     * @return ApiResponse
     */
    public static ApiResponse ofFail(final String message){
        return of(FAIL.getSuccess(),FAIL.getCode(),message);
    }

    /**
     * 有参构造，失败
     *
     * @param code 自定义失败状态码
     * @param message 自定义失败消息
     * @return ApiResponse
     */
    public static ApiResponse ofFail(final Integer code,final String message){
        return of(FAIL.getSuccess(),code,message);
    }

}
