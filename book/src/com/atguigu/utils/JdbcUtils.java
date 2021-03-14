package com.atguigu.utils;/**
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

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @ProjectName: JavaWeb
 * @ClassName: JdbcUtils
 * @Description:
 * @Author: Administrator
 * @Date: 2021/3/12 8:02
 * @version v1.0
 * Copyright (c) All Rights Reserved,1913040720 杨江超,
 */
public class JdbcUtils {

    private static DruidDataSource dataSource;

    static {
        try {
            Properties properties = new Properties();
            //读取jdbc.properties配置文件
            InputStream inputStream = JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
            //从流中加载数据
            properties.load(inputStream);
            //创建数据库连接池
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /*获取数据库连接池的连接*/
    public static Connection getConnection(){
        Connection conn = null;

        try {
            conn = dataSource.getConnection();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return conn;
    }

    /*关闭连接*/
    public static void close(Connection conn){
        if (conn != null){
            try{
                conn.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }

    }
}
    