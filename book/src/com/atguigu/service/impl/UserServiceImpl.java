package com.atguigu.service.impl;/**
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

import com.atguigu.dao.UserDao;
import com.atguigu.dao.impl.UserDaoImpl;
import com.atguigu.pojo.User;
import com.atguigu.service.UserService;

/**
 * @ProjectName: JavaWeb
 * @ClassName: UserServiceImpl
 * @Description:
 * @Author: Administrator
 * @Date: 2021/3/12 10:40
 * @version v1.0
 * Copyright (c) All Rights Reserved,1913040720 杨江超,
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    @Override
    public void regisUser(User user) {
        userDao.saveUser(user);

    }

    @Override
    public User login(User user) {
        return userDao.queryUserByUsernameAndpassword(user.getUsername(), user.getPassword());
    }

    @Override
    public boolean existsUsername(String username) {
        if (userDao.queryUserByUsername(username) == null) {
            // 等于null,说明没查到，没查到表示可用
            return false;
        }

        return true;
    }
}
    