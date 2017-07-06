package org.ch02.test;


import org.apache.ibatis.session.RowBounds;
import org.ch02.dao.StuDao;
import org.ch02.dao.impl.StuDaoImpl;
import org.ch02.entity.Students;
import org.junit.Test;

import java.util.List;

/**
 * Created by langye on 2017/3/21.
 */
public class StuTest {

    @Test
    public void test(){
        StuDao dao = new StuDaoImpl();
        /*List<Students> list = org.ch07.dao.findStuEntityForList();
        for (Students students : list){
            System.out.println(students.getStuName());
        }*/

       /* List<Map<String, Object>> list = org.ch07.dao.findStuForMapList();
        for(Map<String,Object> map:list){
            for (String key:map.keySet()){
                *//*列名作为key，列的值作为值*//*
                System.out.println(key + ": " +map.get(key));
            }
            System.out.println();
        }
        */

        /*分页查询*/
        RowBounds rowBounds = new RowBounds(0,2);
        List<Students> list = dao.findStuEntityForList(rowBounds);
        for(Students students : list){
            System.out.println(students.getStuName());
        }


        int count = dao.count();
        System.out.println(count);
    }
}
