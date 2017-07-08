package org.ch08.dao;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.ch08.entity.Card;

/**
 * Created by HQL on 2017/3/23.
 */
public interface CardDao {

    //查询身份证和学生的信息
    @Select("SELECT * FROM CARD_INFO C \n" +
            "LEFT JOIN STU_INFO S ON C.STU_ID = S.STU_ID \n" +
            "WHERE C.STU_ID = #{cid}")
    @ResultMap("org.ch08.dao.CardDao.cardMap")
    public Card findCardById(int id);
}
