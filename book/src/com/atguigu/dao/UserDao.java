package com.atguigu.dao;

import com.atguigu.pojo.User;

/**
 * 项目名称: JavaWeb <br>
 * 文件名称:  <br>
 * 文件描述:                     <br>
 * 文件创建：1913040720 杨江超 <br>
 * 创建时间: 2021/3/12 <br>
 * 19130407  Copyright (c) All Rights Reserved. <br>
 *
 * @version v1.0 <br>
 * @update [序号][日期YYYY-MM-DD][杨江超 1913040720][变更描述]<br>
 */
public interface UserDao {


    //查询用户信息
    public User queryUserByUsername(String username);
    //通过账号密码查询用户信息
    public User queryUserByUsernameAndpassword(String username,String password);

    public int saveUser(User user);
}
