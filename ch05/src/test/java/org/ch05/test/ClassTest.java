package org.ch05.test;

import org.ch05.dao.ClassDao;
import org.ch05.dao.impl.ClassDaoImpl;
import org.ch05.entity.ClassInfo;
import org.ch05.entity.Students;
import org.junit.Test;

/**
 * Created by langye on 2017/3/23.
 */
public class ClassTest {

    @Test
    public void test(){
        ClassDao dao = new ClassDaoImpl();
        ClassInfo classInfo = dao.findClassById(1);
        System.out.println(classInfo.getClassName());
        for (Students students : classInfo.getStudents()){
            System.out.println(students.getStuName());
        }

        /*ClassInfo classInfo = dao.findClassById2(4);
        System.out.println(classInfo.getClassName());
        for (Students students : classInfo.getStudents()){
            System.out.println(students.getStuName());
            System.out.println(students.getCard().getCardNum());
            for (Course course :students.getCourse()){
                System.out.println(course.getCourseName());
            }
        }*/
    }
}
