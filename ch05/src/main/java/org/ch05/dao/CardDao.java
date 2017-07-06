package org.ch05.dao;

import org.ch05.entity.Card;

/**
 * Created by langye on 2017/3/23.
 */
public interface CardDao {

    public Card findCardById(int cardId);
}
