package org.ch06.test;

import org.ch06.dao.StuDao;
import org.ch06.dao.impl.StuDaoImpl;
import org.ch06.entity.Students;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * Created by Hql on 2017/3/24.
 */
public class StuDaoTest {


    @Test
    public void save(){
        StuDao dao = new StuDaoImpl();
        Students stu = new Students();

        stu.setStuName("黄庆良");
        stu.setStuSex("男");
        stu.setStuAge(23);

        int row =dao.save(stu);
        System.out.println(row);
    }

    @Test
    public void delete(){
        StuDao dao = new StuDaoImpl();
        int row = dao.delete(9);
        System.out.println(row);

    }

    @Test
    public void update(){
        StuDao dao = new StuDaoImpl();

        Students stu = new Students();
        stu.setStuId(10);
        stu.setStuName("笑不凡");
        stu.setStuSex("男");
        stu.setStuAge(123);

        int row = dao.update(stu);
        System.out.println(row);
    }


    @Test
    public void findStudentsForEntity(){
        StuDao dao = new StuDaoImpl();
        List<Students> list = dao.findStudentsForEntity();
        for (Students s : list){
            System.out.println(s.getStuName());
        }
    }


    @Test
    public void findStudentsForMap(){
        StuDao dao = new StuDaoImpl();
        List<Map<String, Object>> list = dao.findStudentsForMap();
        for (Map<String, Object> map : list){
            for (String key : map.keySet())
            System.out.println(map.get(key));
        }
        System.out.println();
    }

    @Test
    public void finStuById(){
        StuDao dao = new StuDaoImpl();
        Students stu = dao.findStuById(5);
        System.out.println(stu);

    }


    @Test
    public void findStuByCondition(){
        StuDao dao = new StuDaoImpl();
        Students stu = dao.findStuByCondition("笑不凡", 20);
        System.out.println(stu);
    }

    @Test
    public void findStuByCondition2(){
        StuDao dao = new StuDaoImpl();
        Students stu = new Students();
        stu.setStuName("笑不凡");
        stu.setStuAge(20);
        stu = dao.findStuByCondition2(stu);
        System.out.println(stu);
    }

}