package org.ch05.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by langye on 2017/3/23.
 */
public class ClassInfo {

    private int classId;
    private String className;
    /*一对多关联学生,集合可以用Set也可以用List*/
    private Set<Students> students = new HashSet<>();

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

    public Set<Students> getStudents() {
        return students;
    }

    public void setStudents(Set<Students> students) {
        this.students = students;
    }
}
