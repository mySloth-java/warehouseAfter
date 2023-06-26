package com.cg.warehouseafter.util;

/**
 * @author cgJavaAfter
 * @date 2023-04-23 16:53
 */
public enum AppHttpCodeEnum {
    // 成功
    SUCCESS(200,"操作成功"),

    //文件错误
    NEED_LOGIN(401,"文件不能为空!"),
    NO_OPERATOR_AUTH(403,"文件大小不符"),

    //登录错误
    LOGIN_NAME_NULL(410,"用户名不能为空!"),
    PASSWORD_ERROR(411,"登录密码错误"),
    USER_NOT(412,"用户不存在"),

    //数据库错误
    SQL_UPDATE_ERROR(420,"数据库更新错误"),
    SQL_INSERT_ERROR(421,"数据库添加错误"),
    SQL_DELETE_ERROR(422,"数据库删除错误"),
    SQL_SELECT_ERROR(423,"数据库查询错误"),



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

