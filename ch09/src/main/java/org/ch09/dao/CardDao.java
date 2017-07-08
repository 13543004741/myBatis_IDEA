package org.ch09.dao;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.ch09.entity.StuCard;
import org.springframework.stereotype.Repository;

/**
 * Created by wangl on 2017/3/23.
 */
@Repository
public interface CardDao {

    //关联查询身份证和学生信息
    @Select("SELECT * FROM STU_CARD C LEFT JOIN STUDENTS S ON C.STU_ID = S.STU_ID WHERE C.CARD_ID = #{cardId}")
    @ResultMap("org.ch09.dao.CardDao.cardMap")
    public StuCard findCardById(int cid);

}
