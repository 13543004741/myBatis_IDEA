package org.ch09.service.impl;

import org.ch09.dao.ClassDao;
import org.ch09.entity.ClassInfo;
import org.ch09.service.ClassInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by wangl on 2017/3/27.
 */
@Service
@Transactional
public class ClassInfoServiceImpl implements ClassInfoService{

    @Autowired
    private ClassDao dao;

    @Override
    public ClassInfo findClassInfoById(int cid) {
        return dao.findClassById(cid);
    }
}
