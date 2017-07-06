package org.ch03.test;

import org.ch03.dao.StuDao;
import org.ch03.dao.impl.StuDaoImpl;
import org.ch03.entity.Students;
import org.junit.Test;

import java.util.List;

/**
 * Created by langye on 2017/3/21.
 */
public class StuTest {

    @Test
    public void test(){
        StuDao dao = new StuDaoImpl();
        /*Students students = org.ch07.dao.findStuById(7);
        System.out.println(students.getStuName());*/

       /* Students students = org.ch07.dao.findStuByName("langye");
        System.out.println(students.getStuAge());*/

       /* Students students = org.ch07.dao.findStuByIdAndByName(7,"langye");
        System.out.println(students.getStuAge());*/

       /* Students students = new Students();
        students.setSid(7);
        students.setStuName("langye");
        students=org.ch07.dao.findStudent(students);
        System.out.println(students.getStuAge());*/

        List<Students> list =  dao.likeStudents("ye");
        for (Students students :list){
            System.out.println(students.getStuName());
        }
    }
}
