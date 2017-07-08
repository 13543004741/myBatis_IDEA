package org.ssm.dao;

import org.springframework.stereotype.Repository;
import org.ssm.entity.ClassInfo;

import java.util.List;

/**
 * Created by langye on 2017/3/28.
 */
@Repository("classDao")
public interface ClassDao {

    public ClassInfo findClassById(int classId);

    public List<Class> findClassInfo();
}
