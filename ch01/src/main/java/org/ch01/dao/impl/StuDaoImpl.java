package org.ch01.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.ch01.dao.StuDao;
import org.ch01.entity.Students;
import org.ch01.utils.MyBatisUtil;

/**
 * Created by Administrator on 2017/3/20.
 */
public class StuDaoImpl implements StuDao {

    @Override
    public int save(Students students) {
        /*获取一个SQLSession对象*/
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        int row = 0;

        try{
            //通过sqlSession的getMapper方法制定映射的接口，然后调用接口相应的方法即可
            row = sqlSession.getMapper(StuDao.class).save(students);
            //事务提交
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            //事务回滚
            sqlSession.rollback();
        }finally {
            sqlSession.close();
        }
        return row;
    }

    @Override
    public int delete(int sid) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        int row = 0;

        try{
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

    @Override
    public int update(Students students) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        int row = 0;

        try{
            row = sqlSession.getMapper(StuDao.class).update(students);
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
