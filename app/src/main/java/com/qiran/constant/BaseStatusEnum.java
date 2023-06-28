package com.qiran.constant;

public enum BaseStatusEnum {
    SUCCESS("0000", "成功"),
    FAIL("0004", "失败");

    private String code;
    private String msg;

    BaseStatusEnum(String code, String msg) {
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
