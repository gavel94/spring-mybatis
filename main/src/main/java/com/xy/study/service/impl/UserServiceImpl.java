package com.xy.study.service.impl;

import com.xy.study.orm.facade.UserInfoMapper;
import com.xy.study.orm.pojo.UserInfo;
import com.xy.study.service.facade.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jhhuang on 17-1-11
 * QQ:781913268
 * Description：xxx
 */
@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserInfoMapper userInfoMapper;

    public void insertUser(UserInfo userInfo) throws Exception
    {
        userInfoMapper.insertUser(userInfo);
    }

    public UserInfo findUserById(int id) throws Exception
    {
        return userInfoMapper.findUserById(id);
    }
}
