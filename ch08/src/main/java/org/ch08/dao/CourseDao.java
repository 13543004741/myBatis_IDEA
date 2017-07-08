package org.ch08.dao;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.ch08.entity.Course;

import java.util.List;

/**
 * Created by HQL on 2017/3/23.
 */
public interface CourseDao {

    //查询所有课程信息
    @Select("SELECT * FROM COURSE_INFO")
    @ResultMap("org.ch08.dao.CourseDao.courseMap")
    public List<Course> findCourse();
}
