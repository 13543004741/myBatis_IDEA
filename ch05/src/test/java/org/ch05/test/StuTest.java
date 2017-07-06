package org.ch05.test;

import org.ch05.dao.StuDao;
import org.ch05.dao.impl.StuDaoImpl;
import org.ch05.entity.Course;
import org.ch05.entity.Students;
import org.junit.Test;

/**
 * Created by langye on 2017/3/23.
 */
public class StuTest {

    @Test
    public void test(){
        StuDao dao = new StuDaoImpl();
        /*Students students = dao.findStuById(2);
        System.out.println(students.getCard().getCardNum());*/

        /*Students students = dao.findStuById2(2);
        System.out.println(students.getClassInfo().getClassName());
        System.out.println(students.getCard().getCardNum());*/

        Students students = dao.findStuById3(1);
        System.out.println(students.getStuName());
        for (Course course : students.getCourse()){
            System.out.println(course.getCourseName());
        }
    }
}
