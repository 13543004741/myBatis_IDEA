package org.ch05.dao;

import org.ch05.entity.Students;

/**
 * Created by langye on 2017/3/23.
 */
public interface StuDao {

    public Students findStuById(int stuId);

    public Students findStuById2(int stuId);

    public Students findStuById3(int stuId);
}
