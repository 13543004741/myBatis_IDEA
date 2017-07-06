package org.ch05.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.ch05.dao.CardDao;
import org.ch05.entity.Card;
import org.ch05.utils.MyBatisUtil;

/**
 * Created by langye on 2017/3/23.
 */
public class CardDaoImpl implements CardDao {
    @Override
    public Card findCardById(int cardId) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        Card card = null;

        try {
            card = sqlSession.getMapper(CardDao.class).findCardById(cardId);
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            sqlSession.close();
        }
        return card;
    }
}
