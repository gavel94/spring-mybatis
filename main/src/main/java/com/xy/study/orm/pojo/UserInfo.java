package com.xy.study.orm.pojo;

/**
 * Created by jhhuang on 17-1-11
 * QQ:781913268
 * Description：UserInfo
 */
public class UserInfo
{
    private int id;
    private String userName;
    private int age;
    private int sex;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getSex()
    {
        return sex;
    }

    public void setSex(int sex)
    {
        this.sex = sex;
    }
}
