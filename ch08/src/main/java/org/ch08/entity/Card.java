package org.ch08.entity;

import lombok.Data;

/**
 * Created by HQL on 2017/3/23.
 */
@Data
public class Card {

    private int cardId;
    private String cardNum;
    //一对一关联学生
    private Students student;
}
