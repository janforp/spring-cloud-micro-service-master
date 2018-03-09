package com.janita.cloud.common.exception;

/**
 * Created by Janita on 2018-03-09 13:49
 */
public enum  ResultEnum {
    UNKNOWN_ERROR(-1,"未知错误"),
    USER_NOT_EXISTS(1, "用户不存在");

    private int code;
    private String message;

    ResultEnum(int code, String message){
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
