package org.ch08.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.ch08.dao.CardDao;
import org.ch08.entity.Card;
import org.ch08.utils.MybatisUtil;

/**
 * Created by HQL on 2017/3/23.
 */
public class CardDaoImpl implements CardDao{

    @Override
    public Card findCardById(int id) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        Card card = null;
        try {
            card = sqlSession.getMapper(CardDao.class).findCardById(id);
        }finally {
            sqlSession.close();
        }
        return card;
    }
}
