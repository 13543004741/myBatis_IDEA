package org.ch05.test;

import org.ch05.dao.CourseDao;
import org.ch05.dao.impl.CourseDaoImpl;
import org.ch05.entity.Course;
import org.junit.Test;

import java.util.List;

/**
 * Created by langye on 2017/3/23.
 */
public class courseTest {

    @Test
    public void test(){
        CourseDao dao = new CourseDaoImpl();
        List<Course> list = dao.findCourses();
        for (Course course : list){
            System.out.println(course.getCourseName());
        }
    }
}
