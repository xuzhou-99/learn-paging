package com.example.demo.common;

import lombok.Getter;
import lombok.ToString;

/**
 * 后台返回给前端
 *
 * @author xuzhou
 * @version 1.0.0
 * @title ApiDataResponse
 * @date 2020/12/2 18:24
 */
@Getter
@ToString
public final class ApiDataResponse<T> extends ApiResponse {

    private final T data;

    private ApiDataResponse(final Boolean succsess,final Integer code,final String message,T data){
        super(succsess, code, message);
        this.data = data;
    }

    public static <T> ApiDataResponse<T> of(final boolean succsee, final Integer code, final String message, final T data){
        return new ApiDataResponse<>(succsee, code, message, data);
    }

    public static <T> ApiDataResponse<T> ofSuccess(final T data){
        return of(true, Status.SUCCSEE.getCode(),Status.SUCCSEE.getMessage(),data);
    }

    public static <T> ApiDataResponse<T> ofError(){
        return of(true, Status.FAIL.getCode(), Status.FAIL.getMessage(), null);
    }

    public static <T> ApiDataResponse<T> ofError(final Integer code, final String message){
        return of(true, code, message, null);
    }

    public static <T> ApiDataResponse<T> ofError(final String message){
        return of(true, Status.FAIL.getCode(), message, null);
    }

}
