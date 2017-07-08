package org.ch08.test;

import org.ch08.dao.CardDao;
import org.ch08.dao.impl.CardDaoImpl;
import org.ch08.entity.Card;
import org.junit.Test;

/**
 * Created by Hql on 2017/3/27.
 */
public class CardTest {

    @Test
    public void findCardById(){
        CardDao dao = new CardDaoImpl();
        Card card = dao.findCardById(1);
        System.out.println(card.getStudent().getStuName());
        System.out.println(card.getCardNum());
    }
}
