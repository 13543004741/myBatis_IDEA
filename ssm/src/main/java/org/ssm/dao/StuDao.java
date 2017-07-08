package org.ssm.dao;

import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;
import org.ssm.entity.Students;
import org.ssm.provider.StuDaoSqlProvider;

import java.util.List;

/**
 * Created by langye on 2017/3/28.
 */
@Repository("stuDao")
public interface StuDao {

    @SelectProvider(type = StuDaoSqlProvider.class, method = "findStuByIdSql")
    public Students findStuById(int stuId);

    @SelectProvider(type = StuDaoSqlProvider.class,method = "findStuByIdOrName")
    public List<Students> findStuByIdOrName(Students students);
}
