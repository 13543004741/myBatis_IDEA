package org.ssm.dao;

import org.springframework.stereotype.Repository;
import org.ssm.entity.Course;

import java.util.List;

/**
 * Created by langye on 2017/3/28.
 */
@Repository("courseDao")
public interface CourseDao {

    public Course findCourseById(int courseId);

    public List<Course> findCourses();
}
