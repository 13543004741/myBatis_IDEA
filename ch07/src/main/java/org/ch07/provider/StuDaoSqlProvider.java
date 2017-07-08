package org.ch07.provider;


import org.apache.ibatis.jdbc.SQL;
import org.ch07.entity.Students;

import java.util.Map;

/**
 * Created by Hql on 2017/3/24.
 * 自定义一个类，这个类是一个Sql提供方，
 * 用于定义接口中各种方法得SQL语句
 *
 * Mybatis提供了一个sql类来封装sql语句
 * 注意：如果使用Map类型的参数，map的key是param1，param12...这样的键
 */
public class StuDaoSqlProvider {

    //返回值类型必须是String，因为sql语句就是一个字符串类型
    public String findStuByIdSql(){
        /*SQL sql = new SQL();
        sql.SELECT("STU_ID AS stuId, STU_NAME AS stuName, " +
                "STU_AGE AS stuAge, STU_SEX AS stuSex");
        sql.FROM("STU_INFO");
        sql.WHERE("STU_ID = #{sid}");
        return toString();*/

       return new SQL(){
           {
               SELECT("STU_ID AS stuId, STU_NAME AS stuName, " +
                              "STU_AGE AS stuAge, STU_SEX AS stuSex");
               FROM("STU_INFO");
               WHERE("STU_ID = #{sid}");
           }
       }.toString();
    }

    /**
     * 多参数查询
     * @return
     */
    public String findStuByConditionSql(){
        return new SQL(){
            {
                SELECT("STU_ID AS stuId, STU_NAME AS stuName, " +
                        "STU_AGE AS stuAge, STU_SEX AS stuSex");
                FROM("STU_INFO");
                WHERE("STU_NAME = #{name}");
                //WHERE方法可以多次使用，mybatis会自动拼接and条件
                WHERE("STU_AGE = #{age}");
            }
        }.toString();
    }

    /**
     * 多参数查询
     * @return
     */
    public String findStuByConditionSql2(Students s){
        return new SQL(){
            {
                SELECT("STU_ID AS stuId, STU_NAME AS stuName, " +
                        "STU_AGE AS stuAge, STU_SEX AS stuSex");
                FROM("STU_INFO");
                if(s != null){
                    if(s.getStuName() != null){
                        WHERE("STU_NAME = #{stuName}");
                    }
                    if(s.getStuAge() != 0){
                        WHERE("STU_AGE = #{stuAge}");
                    }
                }
                ORDER_BY("STU_ID DESC");
            }
        }.toString();
    }

    /**
     * 动态条件查询
     * provider类中的方法都可以定义参数，但是，参数的类型只能有两种
     * 一种是和Dao接口中相同类型的参数，另外一种只能是Map类型的参数
     * 当执行的时候，就会把Dao接口对应的参数传入这个provider的方法中
     *
     * 注意：如果使用map类型的参数，map的key是param1，param2，...这样的键
     * @return
     */
    public String findStuByCondition2(Map<String, Object> map){
        return new SQL(){
            {
                String name = (String) map.get("param1");
                String age = (String) map.get("param2");
                SELECT("STU_ID AS stuId, STU_NAME AS stuName, " +
                        "STU_AGE AS stuAge, STU_SEX AS stuSex");
                FROM("STU_INFO");
                if (map != null){
                    if (name != null){
                        WHERE("STU_NAME = #{stuName}");
                    }
                    if (age != null){
                        WHERE("STU_AGE = #{stuAge}");
                    }
                }
                ORDER_BY("STU_ID DESC");
            }
        }.toString();
    }

    /**
     * 添加操作
     * @return
     */
    public String saveSql(){
        return new SQL(){
            {
                INSERT_INTO("STU_INFO");
                //VALUES()方法也可以重复使用多次，表示插入多个列
                VALUES("STU_NAME","#{stuName}");
                VALUES("STU_AGE","#{stuAge}");
                VALUES("STU_SEX","#{stuSex}");
            }
        }.toString();
    }

    /**
     * 修改操作
     * @return
     */
    public String updateSql(){
        return new SQL(){
            {
                UPDATE("STU_INFO");
                SET("STU_NAME = #{stuName}");
                SET("STU_AGE = #{stuAge}");
                SET("STU_SEX = #{stuSex}");
                WHERE("STU_ID = #{stuId}");
            }
        }.toString();
    }

    /**
     * 删除操作
     * @return
     */
    public String deleteSql(){
        return new SQL(){
            {
                DELETE_FROM("STU_INFO");
                WHERE("STU_ID = #{stuId}");
            }
        }.toString();
    }
}
