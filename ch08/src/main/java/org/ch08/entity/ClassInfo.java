package org.ch08.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HQL on 2017/3/23.
 */
@Data
public class ClassInfo {
    private int classId;
    private String className;
    //一对多关联学生
    private List<Students> students = new ArrayList<>();
}
