package org.ch09.dao;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.ch09.entity.ClassInfo;
import org.springframework.stereotype.Repository;

/**
 * Created by wangl on 2017/3/23.
 */
@Repository
public interface ClassDao {

    //关联查询某个班级下的所有学生所选择的课程
    @Select("SELECT * FROM CLASS_INFO C LEFT JOIN STUDENTS S ON C.C_ID = S.C_ID " +
            "LEFT JOIN COURSE_STU CS ON CS.STU_ID = S.STU_ID LEFT JOIN COURSE CO " +
            "ON CS.COURSE_ID = CO.COURSE_ID WHERE C.C_ID = #{cid}")
    @ResultMap("org.ch09.dao.ClassDao.classMap")
    public ClassInfo findClassById(int cid);

}
