package com.xy.study.service.facade;

import com.xy.study.orm.pojo.UserInfo;

/**
 * Created by jhhuang on 17-1-12
 * QQ:781913268
 * Description：xxx
 */
public interface UserService
{
    void insertUser(UserInfo userInfo) throws Exception;

    UserInfo findUserById(int id) throws Exception;
}
