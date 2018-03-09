package com.janita.cloud.common.exception;

/**
 * Created by Janita on 2018-03-09 13:46
 */
public class CustomException extends RuntimeException {

    private int code;

    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CustomException(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.message = resultEnum.getMessage();
    }
}
