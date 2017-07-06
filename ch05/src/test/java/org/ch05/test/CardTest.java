package org.ch05.test;

import org.ch05.dao.CardDao;
import org.ch05.dao.impl.CardDaoImpl;
import org.ch05.entity.Card;
import org.junit.Test;

/**
 * Created by langye on 2017/3/23.
 */
public class CardTest {

    @Test
    public void test(){
        CardDao dao = new CardDaoImpl();
        Card card = dao.findCardById(1);
        System.out.println(card.getStudents().getStuName());
        System.out.println(card.getCardNum());
    }
}
