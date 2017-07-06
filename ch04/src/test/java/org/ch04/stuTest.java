package org.ch04;

import org.ch04.dao.StuDao;
import org.ch04.dao.impl.StuDaoImpl;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by langye on 2017/3/22.
 */
public class stuTest {

    @Test
    public void test(){
        StuDao dao = new StuDaoImpl();
        Map<String,Object> map = new HashMap();
        /*map.put("stuAge",21);
        List<Students> list = org.ch07.dao.findStuByCondition(map);
        for (Students students : list){
            System.out.println(students.getStuName());
        }*/

      /* map.put("age",21);
       map.put("name","狼野");
       List<Students> list = org.ch07.dao.findStuByCondition2(map);
       for (Students students : list){
            System.out.println(students.getSid());
       }*/

       /* List<Integer> ageList = new ArrayList<>();
        ageList.add(12);
        ageList.add(21);
        map.put("ageList",ageList);
        List<Students> list = org.ch07.dao.findStuByCondition3(map);
        for (Students students : list){
            System.out.println(students.getStuName());
        }*/

       /* List<Integer> ageList = new ArrayList<>();
        ageList.add(21);
        ageList.add(12);
        ageList.add(23);
        map.put("ageList",ageList);
        List<Students> list = org.ch07.dao.findStuByCondition4(map);
        for (Students students : list){
            System.out.println(students.getStuName());
        }*/

       /* map.put("name","夏天");
        map.put("sid",7);
        int i = org.ch07.dao.update(map);
        System.out.println(i);*/
    }
}
