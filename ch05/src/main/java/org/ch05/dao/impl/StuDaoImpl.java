package org.ch05.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.ch05.dao.StuDao;
import org.ch05.entity.Students;
import org.ch05.utils.MyBatisUtil;

/**
 * Created by langye on 2017/3/23.
 */
public class StuDaoImpl implements StuDao {
    @Override
    public Students findStuById(int stuId) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        Students students = null;

        try {
            students = sqlSession.getMapper(StuDao.class).findStuById(stuId);
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
            System.out.println("抛异常啦...");
        }finally {
            sqlSession.close();
        }
        return students;
    }

    @Override
    public Students findStuById2(int stuId) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        Students students = null;

        try{
            students = sqlSession.getMapper(StuDao.class).findStuById2(stuId);
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            sqlSession.close();
        }
        return students;
    }

    @Override
    public Students findStuById3(int stuId) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        Students students = null;

        try {
            students = sqlSession.getMapper(StuDao.class).findStuById3(stuId);
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            sqlSession.close();
        }
        return students;
    }
}
