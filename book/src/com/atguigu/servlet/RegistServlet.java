package com.atguigu.servlet;
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
 * @ClassName: RegistServlet
 * @Description:
 * @Author: Administrator
 * @Date: 2021/3/12 10:55
 * @version v1.0
 * Copyright (c) All Rights Reserved,1913040720 杨江超,
 */

public class RegistServlet extends HttpServlet {

   UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*super.doPost(req, resp);*/
        //请求参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String code = req.getParameter("code");
    //验证码写死
        if ("bnbnp".equalsIgnoreCase(code)){
            System.out.println("11111");
            //检查用户名是否可用
            if (userService.existsUsername(username)){
                System.out.println("用户名[" + username + "]存在");
                //跳回注册界面
                req.getRequestDispatcher("/pages/user/regist.html").forward(req,resp);
            }else {

                //可用 调用service保存到数据库
                    System.out.println("注册成功");
                    userService.regisUser(new User(null,username,password,email));


                req.getRequestDispatcher("/pages/user/regist_success.html").forward(req,resp);

            }

        }else{
            System.out.println("验证码[" + code + "]错误");
            req.getRequestDispatcher("/pages/user/regist.html").forward(req,resp);
        }
    }
}
    