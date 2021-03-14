package com.atguigu.pojo;/**
 * 项目名称: JavaWeb <br>
 * 文件名称:  <br>
 * 文件描述:                     <br>
 * 文件创建：1913040720 杨江超 <br>
 * 创建时间: 2021/3/11 <br>
 * 19130407  Copyright (c) All Rights Reserved. <br>
 *
 * @version v1.0 <br>
 * @update [序号][日期YYYY-MM-DD][杨江超 1913040720][变更描述]<br>
 */

/**
 * @ProjectName: JavaWeb
 * @ClassName: User
 * @Description:
 * @Author: Administrator
 * @Date: 2021/3/11 22:10
 * @version v1.0
 * Copyright (c) All Rights Reserved,1913040720 杨江超,
 */
public class User {
    private Integer id;
    private String username;
    private String password;
    private String email ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public User() {
    }

    public User(Integer id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }
}
    