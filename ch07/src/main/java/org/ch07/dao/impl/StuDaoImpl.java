package org.ch07.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.ch07.dao.StuDao;
import org.ch07.entity.Students;
import org.ch07.utils.MybatisUtil;

import java.util.List;

/**
 * Created by Hql on 2017/3/24.
 */
public class StuDaoImpl implements StuDao {
    @Override
    public Students findStuById(int sid) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        Students stu = null;
        try{
            stu = sqlSession.getMapper(StuDao.class).findStuById(sid);
        }finally{
            sqlSession.close();
        }
        return stu;
    }

    @Override
    public Students findStuByCondition(String stuName, int age) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        Students stu = null;
        try {
            stu = sqlSession.getMapper(StuDao.class).findStuByCondition(stuName, age);
        }finally {
            sqlSession.close();
        }
        return stu;
    }

    @Override
    public List<Students> findStuByCondition2(Students stu) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        List list = null;
        try {
            list = sqlSession.getMapper(StuDao.class).findStuByCondition2(stu);
        }finally {
            sqlSession.close();
        }
        return list;
    }

    @Override
    public int save(Students stu) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        int row = 0;
        try {
            row = sqlSession.getMapper(StuDao.class).save(stu);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            sqlSession.close();
        }
        return row;
    }

    @Override
    public int update(Students stu) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        int row = 0;
        try {
            row = sqlSession.getMapper(StuDao.class).update(stu);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            sqlSession.close();
        }
        return row;
    }

    @Override
    public int delete(int sid) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        int row = 0;
        try {
            row = sqlSession.getMapper(StuDao.class).delete(sid);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            sqlSession.close();
        }
        return row;
    }
}
