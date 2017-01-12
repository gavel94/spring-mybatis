package com.xy.study.orm.impl;

import com.xy.study.orm.facade.UserDao;
import com.xy.study.orm.pojo.UserInfo;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * Created by jhhuang on 17-1-11
 * QQ:781913268
 * Description：xxx
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao
{

    public void insertUser(UserInfo userInfo)
    {
        SqlSession sqlSession = this.getSqlSession();
//        sqlSession.insert("")
    }

    public UserInfo findUserById(int id)
    {
        SqlSession sqlSession = this.getSqlSession();
        UserInfo userInfo = sqlSession.selectOne("com.xy.study.orm.pojo.UserInfo.findUserById", 1);
        return userInfo;
    }
}
