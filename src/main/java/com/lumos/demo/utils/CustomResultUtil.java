package com.lumos.demo.utils;

public class CustomResultUtil {

    public static CustomResult set(Integer code,String msg, Object object) {
        CustomResult result = new CustomResult();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(object);
        return result;
    }

    public static CustomResult success() {
        return CustomResultUtil.set(1,"成功",null);
    }

    public static CustomResult success(Object object) {
        return CustomResultUtil.set(1,"成功",object);
    }

    public static CustomResult fail(Object object) {
        return CustomResultUtil.set(2,"失败",object);
    }

    public static CustomResult exception() {
        return CustomResultUtil.set(3,"异常",null);
    }

    public static CustomResult exception(Object object) {
        return CustomResultUtil.set(3,"异常",object);
    }
}
