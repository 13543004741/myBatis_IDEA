package org.ch08.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HQL on 2017/3/23.
 */
@Data
public class Students {

    private int stuId;
    private String stuName;
    private int stuAge;
    private String stuSex;
    //一对一关联身份证
    private Card stuCard;
    //多对一关联班级
    private ClassInfo classInfo;
    //多对多关联课程
    private List<Course> course = new ArrayList<>();
}
