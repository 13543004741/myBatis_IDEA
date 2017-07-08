package org.ch09.entity;

/**
 * Created by wangl on 2017/3/23.
 */
public class StuCard {

    private int cardId;
    private String cardNum;
    //一对一关联学生
    private Students student;

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public Students getStudent() {
        return student;
    }

    public void setStudent(Students student) {
        this.student = student;
    }
}
