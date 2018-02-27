package com.liqw.maven.archetypes.common;

/**
 * Created by Administrator on 2018/1/17.
 */
public enum ErrEnum {
    SYS_ERR("-1", "系统异常"),
    SUCCESS("0", "成功"),
    PARAM_ERR("1", "参数错误"),
    IDENTITY_ERR("2", "身份失效");

    private String code;
    private String message;

    ErrEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }


    public String getMessage() {
        return message;
    }

}
