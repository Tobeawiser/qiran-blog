package com.qiran.base;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.qiran.constant.BaseStatusEnum;

public class BaseResponse {

    private IPage iPage;

    private String code;

    private String message;

    public BaseResponse(IPage iPage, String code, String message) {
        this.iPage = iPage;
        this.code = code;
        this.message = message;
    }

    public static BaseResponse success(IPage iPage) {
        return new BaseResponse(iPage, BaseStatusEnum.SUCCESS.getCode(), BaseStatusEnum.SUCCESS.getMsg());
    }

    public static BaseResponse fail(IPage iPage) {
        return new BaseResponse(iPage, BaseStatusEnum.FAIL.getCode(), BaseStatusEnum.FAIL.getMsg());
    }

    public IPage getiPage() {
        return iPage;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
