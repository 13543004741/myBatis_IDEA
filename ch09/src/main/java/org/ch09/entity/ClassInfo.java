package org.ch09.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangl on 2017/3/23.
 */
public class ClassInfo {

    private int classId;
    private String className;
    //一对多关联学生
    private List<Students> students = new ArrayList<>();

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Students> getStudents() {
        return students;
    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }
}
