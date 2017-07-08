package org.ch09.dao;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.ch09.entity.Course;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wangl on 2017/3/23.
 */
@Repository
public interface CourseDao {

    //查询所有课程信息
    @Select("SELECT * FROM COURSE")
    @ResultMap("org.ch09.dao.CourseDao.courseMap")
    public List<Course> findCourses();
}
