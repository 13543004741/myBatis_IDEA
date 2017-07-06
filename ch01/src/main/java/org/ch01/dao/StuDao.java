package org.ch01.dao;

import org.ch01.entity.Students;

/**
 * Created by Administrator on 2017/3/20.
 * Dao接口，其实这个接口也就是mybatis的要映射的mapper
 * 每一个mapper.xml文件都会对应一个接口，映射文件中的每一条
 * sql语句就是对应接口的某个方法，这是一一对应的
 */
public interface StuDao {

    /**
     * 保存
     * @param students
     * @return
     */
    public int save(Students students);

    /**
     * 删除
     * @param sid
     * @return
     */
    public int delete(int sid);

    /**
     * 更新
     * @param students
     * @return
     */
    public int update(Students students);
}
