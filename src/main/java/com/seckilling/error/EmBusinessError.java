package com.seckilling.error;

import lombok.Getter;

@Getter
public enum EmBusinessError implements CommonError{
    //general error 通用错误类型10001
    PARAMETER_VALIDATION_ERROR(10001, "参数不合法"),
    UNKNOWN_ERROR(10002, "未知错误信息"),

    //2开头: user related error info, 用户相关的错误信息
    USER_NOT_EXIST(20001, "相关用户不存在"),
    USER_LOGIN_FAIL(20002, "用户名或者密码错误"),
    USER_NOT_LOGIN(20003, "用户未登陆"),

    //3开头: 交易信息错误 transaction errors
    STOCK_NOT_ENOUGH(30001, "库存不足");

    EmBusinessError(Integer errorCode, String errorMsg){
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }
    private Integer errorCode;
    private String errorMsg;

    @Override
    public CommonError setErrMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
}
