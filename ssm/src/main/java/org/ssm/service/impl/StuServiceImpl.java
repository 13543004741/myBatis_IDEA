package org.ssm.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.ssm.dao.StuDao;
import org.ssm.entity.Students;
import org.ssm.service.StuService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by langye on 2017/3/28.
 */
@Service("stuService")
@Transactional
public class StuServiceImpl implements StuService {
    @Resource(name = "stuDao")
    private StuDao dao;
    @Override
    public Students findStuById(int stuId) {
        return dao.findStuById(stuId);
    }

    @Override
    public List<Students> findStuByIdOrName(Students students) {
        return dao.findStuByIdOrName(students);
    }


}
