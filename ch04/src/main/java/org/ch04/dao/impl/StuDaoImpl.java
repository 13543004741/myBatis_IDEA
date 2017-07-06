package org.ch04.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.ch04.dao.StuDao;
import org.ch04.entity.Students;
import org.ch04.utils.MyBatisUtil;

import java.util.List;
import java.util.Map;

/**
 * Created by langye on 2017/3/22.
 */
public class StuDaoImpl implements StuDao {
    @Override
    public List<Students> findStuByCondition(Map<String, Object> map) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        List<Students> list = null;

        try {
            list = sqlSession.getMapper(StuDao.class).findStuByCondition(map);
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            sqlSession.close();
        }
        return list;
    }



    @Override
    public List<Students> findStuByCondition2(Map<String, Object> map) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        List<Students> list = null;

        try {
            list = sqlSession.getMapper(StuDao.class).findStuByCondition2(map);
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            sqlSession.close();

        }
        return list;
    }

    @Override
    public List<Students> findStuByCondition3(Map<String, Object> map) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        List<Students> list = null;

        try {
            list = sqlSession.getMapper(StuDao.class).findStuByCondition3(map);
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            sqlSession.close();
        }
        return list;
    }



    @Override
    public List<Students> findStuByCondition4(Map<String, Object> map) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        List<Students> list = null;

        try {
            list = sqlSession.getMapper(StuDao.class).findStuByCondition4(map);
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            sqlSession.close();

        }
        return list;
    }
    @Override
    public int update(Map<String, Object> map) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        int i = 0;

        try{
            i = sqlSession.getMapper(StuDao.class).update(map);
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            sqlSession.close();
        }
        return i;
    }
}
