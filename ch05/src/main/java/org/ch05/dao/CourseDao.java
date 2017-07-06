package org.ch05.dao;

import org.ch05.entity.Course;

import java.util.List;

/**
 * Created by langye on 2017/3/23.
 */
public interface CourseDao {

    public List<Course> findCourses();
}
