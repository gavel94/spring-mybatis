package com.xy.study.orm.facade;

import com.xy.study.orm.pojo.UserInfo;

/**
 * Created by jhhuang on 17-1-11
 * QQ:781913268
 * Description：xxx
 */
public interface UserDao
{
    void insertUser(UserInfo userInfo) throws Exception;

    UserInfo findUserById(int id) throws Exception;
}
