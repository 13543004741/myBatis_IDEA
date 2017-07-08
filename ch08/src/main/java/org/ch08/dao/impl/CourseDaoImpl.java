package org.ch08.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.ch08.dao.CourseDao;
import org.ch08.entity.Course;
import org.ch08.utils.MybatisUtil;

import java.util.List;

/**
 * Created by HQL on 2017/3/23.
 */
public class CourseDaoImpl implements CourseDao{

    @Override
    public List<Course> findCourse() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        List<Course> list = null;
        try {
            list = sqlSession.getMapper(CourseDao.class).findCourse();
        }finally {
            sqlSession.close();
        }
        return list;

    }
}
