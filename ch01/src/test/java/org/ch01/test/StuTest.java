package org.ch01.test;

import org.ch01.dao.impl.*;
import org.ch01.dao.StuDao;
import org.ch01.entity.Students;
import org.junit.Test;

/**
 * Created by Administrator on 2017/3/20.
 */
public class StuTest {

    @Test
    public void save(){
        StuDao dao = new StuDaoImpl();

        Students students = new Students();
        students.setStuAge(14);
        students.setStuName("GOOD STUDENT");
        int row = dao.save(students);
        System.out.println(row);


        /*int row = org.ch07.dao.delete(3);
        System.out.println(row);*/


        /*students.setSid(4);
        students.setStuAge(12);
        students.setStuName("langYe");
        int count = org.ch07.dao.update(students);
        System.out.println(count);*/
    }
}
