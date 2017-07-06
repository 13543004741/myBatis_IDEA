package org.ch05.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.ch05.dao.ClassDao;
import org.ch05.entity.ClassInfo;
import org.ch05.utils.MyBatisUtil;

/**
 * Created by langye on 2017/3/23.
 */
public class ClassDaoImpl implements ClassDao {
    @Override
    public ClassInfo findClassById(int classId) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        ClassInfo classInfo = null;

        try {
            classInfo = sqlSession.getMapper(ClassDao.class).findClassById(classId);
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }
        finally {
            sqlSession.close();
        }
        return classInfo;
    }

    @Override
    public ClassInfo findClassById2(int classId) {

        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        ClassInfo classInfo = null;
        try {
            classInfo = sqlSession.getMapper(ClassDao.class).findClassById2(classId);
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            sqlSession.close();
        }
        return classInfo;
    }
}
