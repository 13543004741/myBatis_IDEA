package org.ch09.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangl on 2017/3/23.
 */
public class Students {

    private int sid;
    private String stuName;
    private int stuAge;
    //一对一关联身份证
    private StuCard stuCard;
    //多对一关联班级
    private ClassInfo classInfo;
    //多对多关联课程
    private List<Course> courses = new ArrayList<>();

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public StuCard getStuCard() {
        return stuCard;
    }

    public void setStuCard(StuCard stuCard) {
        this.stuCard = stuCard;
    }

    public ClassInfo getClassInfo() {
        return classInfo;
    }

    public void setClassInfo(ClassInfo classInfo) {
        this.classInfo = classInfo;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
