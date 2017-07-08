package org.ch06.dao;

import org.apache.ibatis.annotations.*;
import org.ch06.entity.Students;

import java.util.List;
import java.util.Map;

/**
 * Created by HQL on 2017/3/24.
 * 使用注解映射Dao接口
 */
public interface StuDao {

    /**
     * 添加
     * @param stu
     * @return
     * 使用@Insert注解映射插入语句
     */
    @Insert("INSERT INTO STU_INFO(STU_NAME,STU_AGE,STU_SEX) VALUES(#{stuName},#{stuAge},#{stuSex})")
    //使用自增长策略
    @Options(keyProperty = "stuId", useGeneratedKeys = true)
    //2. 使用@SelectKey注解实现sequence或者uuid的主键策略
    /*@SelectKey(keyProperty = "sid",
            resultType = int.class,
            before = true,
            statement = "SELECT MY_SEQ.NEXTVAL FROM DUAL")*/
    public int save(Students stu);

    /**
     * 删除
     * @param sid
     * @return
     * 使用@Delete注解执行删除语句
     */
    @Delete("DELETE FROM STU_INFO WHERE STU_ID = #{stuId}")
    public int delete(int sid);

    /**
     * 修改
     * @param stu
     * @return
     */
    @Update("UPDATE STU_INFO S SET STU_NAME = #{stuName}, STU_AGE = #{stuAge}, " +
            "STU_SEX = #{stuSex} WHERE S.STU_ID = #{stuId} ")
    public int update(Students stu);


    /**
     * 查询所有Student信息
     * 使用@Select注解执行查询语句
     */
    //1.根据别名映射结果集,别名对应实体中的属性名
    //@Select("SELECT STU_ID AS stuId, STU_NAME AS stuName, STU_AGE AS stuAge, STU_SEX AS stuSex FROM STU_INFO WHERE STU_ID = #{stuId}")
    //2.使用@Results注解映射结果集，类似mapper配置文件中的<resultMap>
    //  在Results注解中定义多个@Result注解映射不同的属性，id=true标识当前属性为主键
    @Results({
          @Result(property = "stuId", column = "STU_ID", id = true),
          @Result(property = "stuName", column = "STU_NAME"),
          @Result(property = "stuAge", column = "STU_AGE"),
          @Result(property = "stuSex", column = "STU_SEX")
    })
    @Select("SELECT * FROM STU_INFO")
    public List<Students> findStudentsForEntity();

    /**
     * 使用Map映射结果集，表的列名为map的key，列的值映射为value，一个map对象就是一条记录
     * @return
     */
    @Select("SELECT * FROM STU_INFO")
    public List<Map<String, Object>> findStudentsForMap();

    /**
     * 根据id查询唯一记录,使用别名映射结果集
     * 当查询参数只有一个的时候，sql中的#{}变量名可以任意
     * @param sid
     * @return
     */
    @Select("SELECT STU_ID AS sid, STU_NAME AS stuName, " +
            "STU_AGE AS stuAge, STU_SEX AS stuSex " +
            "FROM STU_INFO WHERE STU_ID = #{stuId}")
    public Students findStuById(int sid);


    /**
     * 当具有多个查询条件参数，使用@Param注解映射参数名
     * @Param注解中的属性的值对应的是#{}中的名称
     * @param stuName
     * @param age
     * @return
     */
    @Select("SELECT STU_ID AS sid, STU_NAME AS stuName, " +
            "STU_AGE AS stuAge, STU_SEX AS stuSex " +
            "FROM STU_INFO WHERE STU_NAME = #{name} AND STU_AGE = #{age}")
    public Students findStuByCondition(@Param("name") String stuName, @Param("age") int age);

    /**
     * 当查询参数是一个对象或实体的时候，那么#{}中的名称对应的就是对象或实体中的属性名
     * @param stu
     * @return
     */
    @Select("SELECT STU_ID AS sid, STU_NAME AS stuName, " +
            "STU_AGE AS stuAge, STU_SEX AS stuSex " +
            "FROM STU_INFO WHERE STU_NAME = #{stuName} AND STU_AGE = #{stuAge}")
    public Students findStuByCondition2(Students stu);
}
