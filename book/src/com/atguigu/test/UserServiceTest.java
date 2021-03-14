package com.atguigu.test;

import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import com.atguigu.service.impl.UserServiceImpl;
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
public class UserServiceTest {

    UserService userService = new UserServiceImpl();

    @Test
    public void regisUser() {
        userService.regisUser(new User(null, "bbj168", "666666", "bbj168@qq.com"));
        userService.regisUser(new User(null, "abc168", "666666", "abc168@qq.com"));
    }

    @Test
    public void login() {
        System.out.println( userService.login(new User(null, "wzg168", "123456", null)) );
    }

    @Test
    public void existsUsername() {
        if (userService.existsUsername("wzg16888")) {
            System.out.println("用户名已存在！");
        } else {
            System.out.println("用户名可用！");
        }
    }
}