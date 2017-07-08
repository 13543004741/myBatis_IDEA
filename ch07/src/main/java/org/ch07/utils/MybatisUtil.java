package org.ch07.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by HQL on 2017/3/20.
 */
public class MybatisUtil {

    //线程安全的 所以给一个就可以
    private static SqlSessionFactory sqlSessionFactory;

    static{
        //先通过解析核心配置文件，并得到一个输入流
        try {
            InputStream is = Resources.getResourceAsStream("mybatis.xml");
            //根据这个输入流传递给SqlSessionFactoryBuilder对象去解析配置文件，
            //并构建一个SqlSessionFactory对象
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //根据SqlSessionFactory构建Session对象
    public static SqlSession getSqlSession(){
        //通过sqlSessionFactory打开一个sqlSession对象
        //这个自动提交事务
        //return sqlSessionFactory.openSession(true);

        //这种方式获取的SqlSession需要手动提交事务
        return sqlSessionFactory.openSession();

    }
}
