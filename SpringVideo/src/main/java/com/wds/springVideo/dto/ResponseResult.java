package com.wds.springVideo.dto;

public class ResponseResult<T> {

    /**
     * 声明此次传输的类型
     * 1    email合法
     * 0    email不合法
     * -1
     * */
    private int code;

    //用来存放传输的信息
    private String message;


    private T Date;

    public ResponseResult() {
    }

    public ResponseResult(int code, String message, T date) {
        this.code = code;
        this.message = message;
        Date = date;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getDate() {
        return Date;
    }

    public void setDate(T date) {
        Date = date;
    }
}
