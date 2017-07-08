package org.ssm.provider;

import org.apache.ibatis.jdbc.SQL;
import org.ssm.entity.Students;

/**
 * Created by langye on 2017/3/28.
 */
public class StuDaoSqlProvider {

    public String findStuByIdSql(){
        return new SQL(){
            {
                SELECT("S.ID AS stuId, S.STU_NAME AS stuName,S.AGE AS age");
                FROM("STUDENTS S");
                WHERE("S.ID = #{stuId}");
            }
        }.toString();
    }

    public String findStuByIdOrName(Students students){
        return new SQL(){
            {
                SELECT("S.ID AS stuId,S.STU_NAME AS stuName,S.AGE AS age");
                FROM("STUDENTS S");
                if(students != null){
                    if(students.getStuName() != null){
                        WHERE("S.STU_NAME = #{stuName}");
                    }
                    if(students.getAge() != 0){
                        System.out.println("my name is age...");
                        WHERE("S.AGE = #{age}");
                    }
                }
            }
        }.toString();
    }
}
