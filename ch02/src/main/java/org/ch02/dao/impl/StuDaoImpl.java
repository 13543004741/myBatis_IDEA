package org.ch02.dao.impl;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.ch02.dao.StuDao;
import org.ch02.entity.Students;
import org.ch02.utils.MyBatisUtil;

import java.util.List;
import java.util.Map;

/**
 * Created by langye on 2017/3/21.
 */
public class StuDaoImpl implements StuDao {
    @Override
    public List<Students> findStuEntityForList() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        List<Students> list = null;

        try {
            list = sqlSession.getMapper(StuDao.class).findStuEntityForList();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            sqlSession.close();
        }
        return list;
    }

    @Override
    public List<Map<String, Object>> findStuForMapList() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        List<Map<String,Object>> list = null;

        try {
            list = sqlSession.getMapper(StuDao.class).findStuForMapList();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            sqlSession.close();
        }
        return list;
    }

    @Override
    public List<Students> findStuEntityForList(RowBounds rowBounds) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        List<Students> list = null;

        try{
            list = sqlSession.getMapper(StuDao.class).findStuEntityForList(rowBounds);
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            sqlSession.close();
        }
        return list;
    }

    @Override
    public int count() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        int count = 0;

        try {
            count = sqlSession.getMapper(StuDao.class).count();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            sqlSession.close();
        }
        return count;
    }
}
