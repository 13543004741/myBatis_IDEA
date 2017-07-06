package org.ch01.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2017/3/20.
 */
public class MyBatisUtil {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            /*先通过解析mybatis核心配置文件，并得到一个输入流*/
            InputStream is = Resources.getResourceAsStream("mybatis.xml");
            /*将输入流传递给sqlSessionFactoryBuilder对象去解析配置文件，
            * 并构建一个SQLSessionFactory对象
            */
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*根据SQLSessionFactory构建session对象*/
    public static SqlSession getSqlSession(){
        /*这个方式是自动提交事务的
        * return sqlSessionFactory.openSession(true);
        */

        /*这种方式获取的session需要手动提交事务*/
        return sqlSessionFactory.openSession();
    }

    public static void main(String[] args) {
        System.out.println(getSqlSession());
    }
}
