package com.atguigu.test;/**
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
import com.atguigu.utils.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;

/**
 * @ProjectName: JavaWeb
 * @ClassName: JdbcUtilsTest
 * @Description:
 * @Author: Administrator
 * @Date: 2021/3/12 9:37
 * @version v1.0
 * Copyright (c) All Rights Reserved,1913040720 杨江超,
 */
public class JdbcUtilsTest {


    @Test
    public void testJdbcUyils(){
        for (int i = 0;i<100;i++){
            Connection connection = JdbcUtils.getConnection();
            System.out.println(connection);
            JdbcUtils.close(connection);
        }
    }

}
    