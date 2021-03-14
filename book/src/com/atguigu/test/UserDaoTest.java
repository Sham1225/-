package com.atguigu.test;

import com.atguigu.dao.UserDao;
import com.atguigu.dao.impl.UserDaoImpl;
import com.atguigu.pojo.User;
import org.junit.Test;

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
public class UserDaoTest {
    UserDao userDao = new UserDaoImpl();
    @Test
    public void queryUserByUsername() {

        if (userDao.queryUserByUsername("admin")==null){
            System.out.println("可用");
        }else{
            System.out.println("不可用");
        }
    }

    @Test
    public void queryUserByUsernameAndpassword() {
        if ( userDao.queryUserByUsernameAndpassword("admin","admin1234") == null) {
            System.out.println("用户名或密码错误，登录失败");
        } else {
            System.out.println("查询成功");
        }
    }

    @Test
    public void saveUser() {
        System.out.println( userDao.saveUser(new User(12346,"123456", "123456", "12345@qq.com")) );
    }
}