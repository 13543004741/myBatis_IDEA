package org.ch08.test;

import org.ch08.dao.ClassDao;
import org.ch08.dao.impl.ClassDaoImpl;
import org.ch08.entity.ClassInfo;
import org.ch08.entity.Course;
import org.ch08.entity.Students;
import org.junit.Test;

/**
 * Created by Hql on 2017/3/27.
 */
public class ClassInfoTest {

    @Test
    public void findClassById(){
        ClassDao dao = new ClassDaoImpl();
        ClassInfo cla = dao.findClassById(1);
        System.out.println(cla.getClassName());
        for (Students s : cla.getStudents()){
            System.out.println(s.getStuName());

        }
    }

    @Test
    public void findClassById2(){
        ClassDao dao = new ClassDaoImpl();
        ClassInfo classInfo = dao.findClassById2(1);
        System.out.println(classInfo.getClassName());
        for (Students s : classInfo.getStudents()){
            System.out.println(s.getStuName());
            for (Course c : s.getCourse()) {
                System.out.println(c.getCourseName());
            }
            System.out.println();
        }
    }
}
