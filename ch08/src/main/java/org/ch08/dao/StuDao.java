package org.ch08.dao;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.ch08.entity.Students;

/**
 * Created by HQL on 2017/3/23.
 */
public interface StuDao {
    //关联查询学生和身份证信息，应该使用resultMap属性
    @Select("SELECT * FROM STU_INFO S \n" +
            "LEFT JOIN CARD_INFO C ON S.STU_ID = C.STU_ID \n" +
            "WHERE S.STU_ID = #{sid}")
    @ResultMap("org.ch08.dao.StuDao.stuMap")
    public Students findStuById(int sid);

    //关联查询学生和身份证以及对应班级信息
    @Select("SELECT * FROM STU_INFO S " +
            "LEFT JOIN CARD_INFO CA ON S.STU_ID = CA.STU_ID \n" +
            "LEFT JOIN CLASS_INFO C ON C.CLASS_ID = S.CLASS_ID \n" +
            "WHERE S.STU_ID = #{sid}")
    @ResultMap("org.ch08.dao.StuDao.stuMap")
    public Students findStuById2(int sid);

    //关联查询某个学生所选的课程
    @Select("SELECT * FROM STU_INFO S " +
            "LEFT JOIN STU_COURSE SC ON S.STU_ID = SC.STU_ID \n" +
            "LEFT JOIN COURSE_INFO CO ON CO.COURSE_ID = SC.COURSE_ID \n" +
            "WHERE S.STU_ID = #{sid}")
    @ResultMap("org.ch08.dao.StuDao.stuMap")
    public Students findStuById3(int sid);
}

