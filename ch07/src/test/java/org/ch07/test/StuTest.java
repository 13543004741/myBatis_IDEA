package org.ch07.test;

import org.ch07.dao.StuDao;
import org.ch07.dao.impl.StuDaoImpl;
import org.ch07.entity.Students;
import org.junit.Test;

import java.util.List;

/**
 * Created by Hql on 2017/3/24.
 */
public class StuTest {

    @Test
    public void findStuById(){
        StuDao dao = new StuDaoImpl();
        Students stu = dao.findStuById(1);
        System.out.println(stu);
    }

    @Test
    public void findStuByCondition(){
        StuDao dao = new StuDaoImpl();
        Students stu = dao.findStuByCondition("笑不凡",20);
        System.out.println(stu);
    }

   @Test
    public void findStuByCondition2(){
        StuDao dao = new StuDaoImpl();
        Students stu =new Students();
        //stu.setStuName("笑不凡");
        List<Students> list = dao.findStuByCondition2(stu);
        for (Students s : list){
            System.out.println(s.getStuName());
            System.out.println(s.getStuAge());
            System.out.println(s.getStuSex());
            System.out.println("-------------");
        }
       System.out.println();
    }

     @Test
    public void save(){
         StuDao dao = new StuDaoImpl();
         Students stu = new Students();

         stu.setStuName("黄庆良");
         stu.setStuAge(21);
         stu.setStuSex("男");

         int row =dao.save(stu);
         System.out.println(row);
    }

    @Test
    public void update(){
        StuDao dao = new StuDaoImpl();
        Students stu = new Students();

        stu.setStuId(6);
        stu.setStuName("杨冰阳");
        stu.setStuSex("女");
        stu.setStuAge(25);

        int row = dao.update(stu);
        System.out.println(row);
    }

    @Test
    public void delete(){
        StuDao dao = new StuDaoImpl();
        int row = dao.delete(8);
        System.out.println(row);
    }
}
