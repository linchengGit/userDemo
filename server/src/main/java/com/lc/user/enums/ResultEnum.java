package com.lc.user.enums;

import lombok.Getter;

/**
 * @author lc
 * @date 2019/3/18
 */
@Getter
public enum ResultEnum {
    LOGIN_FAIL(1,"登录失败"),
    ROLE_ERROR(2,"权限有误"),
        ;

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
