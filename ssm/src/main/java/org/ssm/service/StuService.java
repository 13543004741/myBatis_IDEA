package org.ssm.service;

import org.ssm.entity.Students;

import java.util.List;

/**
 * Created by langye on 2017/3/28.
 */
public interface StuService {

    public Students findStuById(int stuId);

    public List<Students> findStuByIdOrName(Students students);
}
