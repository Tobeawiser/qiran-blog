package com.qiran.constant;

public enum ArticleTypeEnum {

    COMPUTE("1", "技术之路"),
    LIFE("2", "文章生活");

    private String code;
    private String comment;

    ArticleTypeEnum(String code, String comment) {
    }

    public String getCode() {
        return code;
    }

    public String getComment() {
        return comment;
    }
}
