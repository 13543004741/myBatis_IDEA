package org.ch08.dao;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.ch08.entity.ClassInfo;

/**
 * Created by HQL on 2017/3/23.
 */
public interface ClassDao {

    //关联查询某个班级下的学生信息
    @Select("SELECT * FROM CLASS_INFO C \n" +
            "LEFT JOIN STU_INFO S ON C.CLASS_ID = S.CLASS_ID \n" +
            "WHERE C.CLASS_ID = #{cid}")
    //引用mapper配置文件的resultMap，属性值是namespace+resultMap的id
    @ResultMap("org.ch08.dao.ClassDao.classMap")

    //全注解版
    /*@Select("SELECT * FROM CLASS_INFO C WHERE C.CLASS_ID = #{classId}")
    @Results({
            @Result(property = "classId", column = "CLASS_ID"),
            @Result(property = "className", column = "CLASS_NAME")
    })*/
    public ClassInfo findClassById(int id);

    //关联查询某个班级下的所有学生所选择的课程
    @Select("SELECT C.CLASS_ID, C.CLASS_NAME, S.STU_NAME, CO.COURSE_NAME FROM CLASS_INFO C \n" +
            "LEFT JOIN STU_INFO S ON C.CLASS_ID = S.CLASS_ID \n" +
            "LEFT JOIN STU_COURSE SC ON S.STU_ID = SC.STU_ID \n" +
            "LEFT JOIN COURSE_INFO CO ON CO.COURSE_ID = SC.COURSE_ID \n" +
            "WHERE C.CLASS_ID = #{cid}")
    @ResultMap("org.ch08.dao.ClassDao.classMap")
    public ClassInfo findClassById2(int id);


}
