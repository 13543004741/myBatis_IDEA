package org.ch08.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.ch08.dao.ClassDao;
import org.ch08.entity.ClassInfo;
import org.ch08.utils.MybatisUtil;

/**
 * Created by HQL on 2017/3/23.
 */
public class ClassDaoImpl implements ClassDao {

    @Override
    public ClassInfo findClassById(int id) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        ClassInfo classInfo = null;
        try {
            classInfo = sqlSession.getMapper(ClassDao.class).findClassById(id);
        }finally {
            sqlSession.close();
        }
        return classInfo;
    }

    @Override
    public ClassInfo findClassById2(int id) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        ClassInfo classInfo = null;
        try {
            classInfo = sqlSession.getMapper(ClassDao.class).findClassById2(id);
        }finally {
            sqlSession.close();
        }
        return classInfo;
    }
}
