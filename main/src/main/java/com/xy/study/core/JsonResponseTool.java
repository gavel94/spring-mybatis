package com.xy.study.core;

/**
 * Created by jhhuang on 17-1-12
 * QQ:781913268
 * Description：xxx
 */
public class JsonResponseTool
{
    public static CommonResponse success(Object data) {
        CommonResponse commonResponse = new CommonResponse();
        commonResponse.setCode(200);
        commonResponse.setMsg("成功");
        commonResponse.setData(data);

        return commonResponse;
    }
}
