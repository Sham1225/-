package com.atguigu.dao.impl;/**
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
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @ProjectName: JavaWeb
 * @ClassName: BaseDao
 * @Description:    Ctrl+shift+T 快速调用Junit，jar包编写测试类
 *                  Ctrl+alt+T  快速调用try catch 方法
 * @Author: Administrator
 * @Date: 2021/3/12 9:48
 * @version v1.0
 * Copyright (c) All Rights Reserved,1913040720 杨江超,
 */
public abstract class BaseDao {

     private QueryRunner queryRunner = new QueryRunner();

     public int update(String sql,Object...args){
         Connection connection = JdbcUtils.getConnection();
         try{
             return queryRunner.update(connection,sql,args);
         }catch (SQLException e){
             e.printStackTrace();
         }finally {
             JdbcUtils.close(connection);
         }
         return -1;//执行失败
     }



     public <T> T queryForOne(Class<T> type,String sql,Object...args){
         Connection con = JdbcUtils.getConnection();
         try {
             return queryRunner.query(con,sql,new BeanHandler<T>(type),args);
         } catch (SQLException e) {
             e.printStackTrace();
         }finally {
             JdbcUtils.close(con);
         }
         return null;
     }

     //查询返回多个JavaBean的查询
    public <T>List<T> queryForList(Class<T> type,String sql,Object...args){
        Connection con = JdbcUtils.getConnection();
        try {
            return queryRunner.query(con,sql,new BeanListHandler<>(type),args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtils.close(con);
        }
        return null;
    }
    //执行返回一行一列的sql语句
    public Object queryForSingleValue(String sql,Object...args){

         Connection conn = JdbcUtils.getConnection();

        try {
            return queryRunner.query(conn,sql,new ScalarHandler(),args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtils.close(conn);
        }
        return null;
    }
}
    