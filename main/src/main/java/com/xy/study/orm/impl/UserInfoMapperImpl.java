package com.xy.study.orm.impl;

import com.xy.study.orm.facade.UserInfoMapper;
import com.xy.study.orm.pojo.UserInfo;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by jhhuang on 17-1-12
 * QQ:781913268
 * Description：UserInfoMapperImpl
 */
@Repository
public class UserInfoMapperImpl extends SqlSessionDaoSupport implements UserInfoMapper
{
    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory)
    {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    public void insertUser(UserInfo userInfo) throws Exception
    {
        this.getSqlSession().getMapper(UserInfoMapper.class).insertUser(userInfo);
    }

    public UserInfo findUserById(int id) throws Exception
    {
        return  this.getSqlSession().getMapper(UserInfoMapper.class).findUserById(id);
    }
}
