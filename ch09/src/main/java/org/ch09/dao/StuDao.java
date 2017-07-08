package org.ch09.dao;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.ch09.entity.Students;
import org.springframework.stereotype.Repository;

/**
 * Created by wangl on 2017/3/23.
 */
@Repository
public interface StuDao {
    //关联查询学生和身份证信息
    @Select("SELECT * FROM STUDENTS S LEFT JOIN STU_CARD C ON S.STU_ID = C.STU_ID WHERE S.STU_ID = #{sid}")
    @ResultMap("org.ch09.dao.StuDao.stuMap")
    public Students findStuById(int sid);

    //关联查询学生和身份证以及对应班级信息
    @Select("SELECT * FROM STUDENTS S LEFT JOIN STU_CARD CA ON S.STU_ID = CA.STU_ID " +
            "LEFT JOIN CLASS_INFO C ON S.C_ID = C.C_ID WHERE S.STU_ID = #{sid}")
    @ResultMap("org.ch09.dao.StuDao.stuMap")
    public Students findStuById2(int sid);

    //关联查询某个学生所选的课程
    @Select("SELECT * FROM STUDENTS S LEFT JOIN COURSE_STU CS ON S.STU_ID = CS.STU_ID " +
            "LEFT JOIN COURSE C ON C.COURSE_ID = CS.COURSE_ID WHERE S.STU_ID = #{sid}")
    @ResultMap("org.ch09.dao.StuDao.stuMap")
    public Students findStuById3(int sid);
}
