package com.atguigu.service;

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
public interface UserService {
    //注册用户
    public void regisUser(User user);
    //登录、
    public User login(User user);
    //检查用户名是否可用
    public boolean existsUsername(String username);

}
