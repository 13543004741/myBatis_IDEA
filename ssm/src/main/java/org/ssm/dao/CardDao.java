package org.ssm.dao;

import org.springframework.stereotype.Repository;
import org.ssm.entity.Card;

import java.util.List;

/**
 * Created by langye on 2017/3/28.
 */
@Repository("cardDao")
public interface CardDao {

    public Card findCardById(int cardId);

    public List<Card> findCards();
}
