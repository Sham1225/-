package com.atguigu.servlet;/**
 * 项目名称: JavaWeb <br>
 * 文件名称:  <br>
 * 文件描述:                     <br>
 * 文件创建：1913040720 杨江超 <br>
 * 创建时间: 2021/3/13 <br>
 * 19130407  Copyright (c) All Rights Reserved. <br>
 *
 * @version v1.0 <br>
 * @update [序号][日期YYYY-MM-DD][杨江超 1913040720][变更描述]<br>
 */

import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import com.atguigu.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ProjectName: JavaWeb
 * @ClassName: LoginServlet
 * @Description:
 * @Author: Administrator
 * @Date: 2021/3/13 19:57
 * @version v1.0
 * Copyright (c) All Rights Reserved,1913040720 杨江超,
 */
public class LoginServlet extends HttpServlet {

    private UserService userService = new UserServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //获取参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //调用user Service.login登录处理业务
        User loginUser = userService.login(new User(null,username,password,null));
        //如果等于null 登陆失败
        if (loginUser == null){
            //跳回登陆界面
            System.out.println("用户名或者密码错误，登录失败");
            req.getRequestDispatcher("/pages/user/login.html").forward(req,resp);

        }else{
            //登陆成功
            req.getRequestDispatcher("/pages/user/login_success.html").forward(req,resp);

        }


    }
}
    