package org.ch03.dao;


import org.ch03.entity.Students;

import java.util.List;

/**
 * Created by langye on 2017/3/21.
 */
public interface StuDao {

  /**
   * 根据主键id查询学生
   * @param sid
   * @return
   */
  public Students findStuById(int sid);

  /**
   * 根据名称查询用户
   * @param stuName
   * @return
   */
  public Students findStuByName(String stuName);

  /**
   * 根据id以及用户名查询学生
   * @param sid
   * @param stuName
   * @return
   */
  public Students findStuByIdAndByName(int sid,String stuName);

  /**
   * 将查询参数封装到对象中来查询某个对象
   * @param students
   * @return
   */
  public Students findStudent(Students students);

  /**
   * 根据名称模糊查询
   * @param stuName
   * @return
   */
  public List<Students> likeStudents(String stuName);
}
