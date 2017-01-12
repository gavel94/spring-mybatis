package com.xy.study.core;

/**
 * Created by jhhuang on 17-1-12
 * QQ:781913268
 * Description：xxx
 */
public class CommonResponse<T> extends JsonResponse
{
    private Integer code;
    private String msg;
    private T data;

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

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
