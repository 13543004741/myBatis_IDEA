package org.ch05.dao;

import org.ch05.entity.ClassInfo;

/**
 * Created by langye on 2017/3/23.
 */
public interface ClassDao {

    public ClassInfo findClassById(int classId);

    public ClassInfo findClassById2(int classId);
}
