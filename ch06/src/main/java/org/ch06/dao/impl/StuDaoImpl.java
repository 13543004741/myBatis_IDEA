package org.ch06.dao.impl;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.ch06.dao.StuDao;
import org.ch06.entity.Students;
import org.ch06.utils.MybatisUtil;

import java.util.List;
import java.util.Map;

/**
 * Created by HQL on 2017/3/24.
 * 使用注解映射Dao接口
 */
public class StuDaoImpl implements StuDao {

    @Override
    public int save(Students stu) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        int row = 0;
        try {
            row =sqlSession.getMapper(StuDao.class).save(stu);
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
            row =sqlSession.getMapper(StuDao.class).delete(sid);
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
            row =sqlSession.getMapper(StuDao.class).update(stu);
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
    public List<Students> findStudentsForEntity() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        List<Students> list = null;
        try {
            list = sqlSession.getMapper(StuDao.class).findStudentsForEntity();
        }finally {
            sqlSession.close();
        }
        return list;
    }

    @Override
    public List<Map<String, Object>> findStudentsForMap() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        List<Map<String, Object>> list = null;
        try {
            list = sqlSession.getMapper(StuDao.class).findStudentsForMap();
        }finally {
            sqlSession.close();
        }
        return list;
    }

    @Override
    public Students findStuById(int sid) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        Students stu = null;
        try {
            stu = sqlSession.getMapper(StuDao.class).findStuById(sid);
        }finally {
            sqlSession.close();
        }
        return stu;
    }

    @Override
    public Students findStuByCondition(@Param("name") String stuName, @Param("age") int age) {
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
    public Students findStuByCondition2(Students stu) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        try {
           // stu = sqlSession.getMapper(StuDao.class).findStuByCondition(stu);
        }finally {
            sqlSession.close();
        }
        return stu;
    }
}
