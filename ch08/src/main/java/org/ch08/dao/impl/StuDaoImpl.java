package org.ch08.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.ch08.dao.StuDao;
import org.ch08.entity.Students;
import org.ch08.utils.MybatisUtil;

/**
 * Created by HQL on 2017/3/23.
 */
public class StuDaoImpl implements StuDao{


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
    public Students findStuById2(int sid) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        Students stu = null;
        try {
            stu = sqlSession.getMapper(StuDao.class).findStuById2(sid);
        }finally {
            sqlSession.close();
        }
        return stu;
    }

    @Override
    public Students findStuById3(int sid) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        Students stu = null;
        try {
            stu = sqlSession.getMapper(StuDao.class).findStuById3(sid);
        }finally {
            sqlSession.close();
        }
        return stu;
    }

}
