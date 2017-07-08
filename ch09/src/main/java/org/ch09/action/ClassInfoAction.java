package org.ch09.action;

import org.ch09.entity.ClassInfo;
import org.ch09.service.ClassInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Created by wangl on 2017/3/27.
 */
@Controller("classAction")
@Scope("prototype")
public class ClassInfoAction {

    @Autowired
    private ClassInfoService service;

    private ClassInfo classInfo;

    public ClassInfo getClassInfo() {
        return classInfo;
    }

    public void setClassInfo(ClassInfo classInfo) {
        this.classInfo = classInfo;
    }

    public String findClass(){
        classInfo = service.findClassInfoById(classInfo.getClassId());
        return "success";
    }
}
