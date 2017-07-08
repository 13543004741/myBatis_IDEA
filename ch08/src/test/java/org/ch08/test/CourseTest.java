package org.ch08.test;

import org.ch08.dao.CourseDao;
import org.ch08.dao.impl.CourseDaoImpl;
import org.ch08.entity.Course;
import org.junit.Test;

import java.util.List;

/**
 * Created by Hql on 2017/3/27.
 */
public class CourseTest {

    @Test
    public void findCourse(){
        CourseDao dao = new CourseDaoImpl();
        List<Course> list =  dao.findCourse();
        for (Course c : list){
            System.out.println(c.getCourseName());
            System.out.println("---------------");
        }
    }
}
