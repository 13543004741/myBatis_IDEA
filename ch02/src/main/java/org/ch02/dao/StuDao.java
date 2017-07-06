package org.ch02.dao;

import org.apache.ibatis.session.RowBounds;
import org.ch02.entity.Students;

import java.util.List;
import java.util.Map;

/**
 * Created by langye on 2017/3/21.
 */
public interface StuDao {

    /**
     * 查询所有学员信息，返回list集合，List中存放的是实体对象
     * @return
     */
    public List<Students> findStuEntityForList();


    /**
     * 查询所有学员信息，返回的是list集合,List中存放的是Map对象
     * @return
     */
    public List<Map<String,Object>> findStuForMapList();


    /***
     * 分页查询，使用myBaits提供的RowBounds
     * 在调用此方法时，可以创建一个RowBound实例，指定其记录和最大抓取条目
     * 并传递到该方法即可
     * RowBounds rowBounds = new RowBounds(0,2);
     * @return
     */
    public List<Students> findStuEntityForList(RowBounds rowBounds);


    public int count();
}
