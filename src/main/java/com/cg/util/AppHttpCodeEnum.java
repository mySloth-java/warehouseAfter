package com.cg.util;

public enum AppHttpCodeEnum {
    // 成功
    SUCCESS(200,"操作成功"),

    //系统错误
    SYSTEM_ERROR(500,"客户端错误，请等待或联系管理员!");
    int code;
    String msg;


    AppHttpCodeEnum(int code, String errorMessage){
        this.code = code;
        this.msg = errorMessage;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}

