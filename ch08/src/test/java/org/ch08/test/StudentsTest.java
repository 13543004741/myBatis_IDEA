package org.ch08.test;

import org.ch08.dao.StuDao;
import org.ch08.dao.impl.StuDaoImpl;
import org.ch08.entity.Course;
import org.ch08.entity.Students;
import org.junit.Test;

/**
 * Created by Hql on 2017/3/27.
 */
public class StudentsTest {

    @Test
    public void findStuById(){
        StuDao stuDao = new StuDaoImpl();
        Students s = stuDao.findStuById(1);
        System.out.println(s.getStuName());
        System.out.println(s.getStuAge());
        System.out.println(s.getStuSex());
        System.out.println(s.getStuCard().getCardNum());
    }

    @Test
    public void findStuById2(){
        StuDao stuDao = new StuDaoImpl();
        Students s = stuDao.findStuById2(2);
        System.out.println(s.getStuName());
        System.out.println(s.getStuAge());
        System.out.println(s.getStuSex());
        System.out.println(s.getClassInfo().getClassName());
        System.out.println(s.getStuCard().getCardNum());

    }

    @Test
    public void findStuById3(){
        StuDao stuDao = new StuDaoImpl();
        Students s = stuDao.findStuById3(1);
        System.out.println(s.getStuName());
        System.out.println(s.getStuAge());
        System.out.println(s.getStuSex());
        for (Course c : s.getCourse()) {
            System.out.println(c.getCourseName());
        }
    }
}
