package org.ch05.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.ch05.dao.CourseDao;
import org.ch05.entity.Course;
import org.ch05.utils.MyBatisUtil;

import java.util.List;

/**
 * Created by langye on 2017/3/23.
 */
public class CourseDaoImpl implements CourseDao {
    @Override
    public List<Course> findCourses() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        List<Course> list = null;

        try {
            list = sqlSession.getMapper(CourseDao.class).findCourses();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            sqlSession.close();
        }
        return list;
    }
}
