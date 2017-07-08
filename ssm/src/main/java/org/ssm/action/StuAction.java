package org.ssm.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.ssm.entity.Students;
import org.ssm.service.StuService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by langye on 2017/3/28.
 */
@Controller("stuAction")
@Scope("prototype")
public class StuAction {


    private Students students;
    @Resource(name = "stuService")
    private StuService service;
    private List<Students> list = null;

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public StuService getService() {
        return service;
    }

    public void setService(StuService service) {
        this.service = service;
    }

    public List<Students> getList() {
        return list;
    }

    public void setList(List<Students> list) {
        this.list = list;
    }

    public String findStudent(){
        System.out.println("findStu...");
        students = service.findStuById(students.getStuId());
        System.out.println(students.getStuName());
        System.out.println(students.getAge());
        return "success";
    }

    public String findStuByIdOrName(){
        System.out.println("findStuByIdOrName...");
        list = service.findStuByIdOrName(students);
        return "success";
    }
}
