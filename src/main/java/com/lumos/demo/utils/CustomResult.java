package com.lumos.demo.utils;

import com.fasterxml.jackson.annotation.JsonInclude;

public class CustomResult<T>  {
    private Integer code;
    private String msg;

    //设置当NULL时不返回
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
