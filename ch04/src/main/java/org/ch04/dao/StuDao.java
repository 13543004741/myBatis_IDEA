package org.ch04.dao;

import org.ch04.entity.Students;

import java.util.List;
import java.util.Map;

/**
 * Created by langye on 2017/3/22.
 */
public interface StuDao {

    /**
     * 动态条件查询,可以将多个查询条件封装为一个实体对象，
     * 也可以封装为一个map对象
     * @param map
     * @return
     */
    public List<Students> findStuByCondition(Map<String,Object> map);


    /***
     * 动态条件选择
     * @param map
     * @return
     */
    public List<Students> findStuByCondition2(Map<String,Object> map);


    /**
     * 动态拼接or条件
     * @param map
     * @return
     */
    public List<Students> findStuByCondition3(Map<String,Object> map);


    /**
     * in子句
     * @param map
     * @return
     */
    public List<Students> findStuByCondition4(Map<String,Object> map);


    /**
     * 使用set标签动态执行更新
     * @param map
     * @return
     */
    public int update(Map<String,Object> map);
}
