package org.ch07.dao;

import org.apache.ibatis.annotations.*;
import org.ch07.entity.Students;
import org.ch07.provider.StuDaoSqlProvider;

import java.util.List;

/**
 * Created by HQL on 2017/3/24.
 * 使用Mybatis的SqlProvider
 */
public interface StuDao {

    /**
     * 单个查询参数
     * 根据id查询唯一记录
     * type属性指定自定义Provider类的class
     * method属性指定自定义Provider类中的方法名
     * @return
     */
    @SelectProvider(type = StuDaoSqlProvider.class, method = "findStuByIdSql")
    public Students findStuById(int sid);

    /**
     * 多条件查询
     * @param stuName
     * @param age
     * @return
     */
    @SelectProvider(type = StuDaoSqlProvider.class, method = "findStuByConditionSql")
    public Students findStuByCondition(@Param("name")String stuName, @Param("age")int age);

    /**
     * 动态条件查询
     * @param stu
     * @return
     */
    @SelectProvider(type = StuDaoSqlProvider.class, method = "findStuByConditionSql2")
    public List<Students> findStuByCondition2(Students stu);

    /**
     * 添加操作
     * @param stu
     * @return
     */
    @InsertProvider(type = StuDaoSqlProvider.class, method = "saveSql")
    public int save(Students stu);

    /**
     * 修改操作
     * @return
     */
    @UpdateProvider(type = StuDaoSqlProvider.class, method = "updateSql")
    public int update(Students stu);

    /**
     * 删除操作
     * @param sid
     * @return
     */
    @DeleteProvider(type = StuDaoSqlProvider.class, method = "deleteSql")
    public int delete(int sid);
}
