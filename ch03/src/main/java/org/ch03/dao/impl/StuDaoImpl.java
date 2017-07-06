package org.ch03.dao.impl;

import org.ch03.dao.StuDao;
import org.ch03.entity.Students;
import org.ch03.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by langye on 2017/3/21.
 */
public class StuDaoImpl implements StuDao {

    @Override
    public Students findStuById(int sid) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        Students students = null;

        try {
            students = sqlSession.getMapper(StuDao.class).findStuById(sid);
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            sqlSession.close();
        }
        return students;
    }

    @Override
    public Students findStuByName(String stuName) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        Students students = null;

        try{
            students = sqlSession.getMapper(StuDao.class).findStuByName(stuName);
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            sqlSession.close();
        }
        return students;
    }

    @Override
    public Students findStuByIdAndByName(int sid,String stuName) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        Students students = null;

        try {
            students = sqlSession.getMapper(StuDao.class).findStuByIdAndByName(sid,stuName);
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            sqlSession.close();
        }

        return students;
    }

    @Override
    public Students findStudent(Students students) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        Students newStudents = null;
        try {
            newStudents = sqlSession.getMapper(StuDao.class).findStudent(students);
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            sqlSession.close();
        }
        return newStudents;
    }

    @Override
    public List<Students> likeStudents(String stuName) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        List<Students> list = null;

        try {
            list = sqlSession.getMapper(StuDao.class).likeStudents(stuName);
        }catch(Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            sqlSession.close();
        }
        return list;
    }
}
