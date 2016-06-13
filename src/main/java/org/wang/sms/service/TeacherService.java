package org.wang.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.wang.sms.model.Teacher;
import org.wang.sms.repository.TeacherDao;


/**
 * Created by Yang Wang on 16/3/4.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:40
 */
@Service public class TeacherService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private TeacherDao teacherDao;

  //~ Methods ----------------------------------------------------------------------------------------------------------


  /**
   * add.
   *
   * @param   teacher  Teacher
   *
   * @return  Integer
   */
  public Integer add(Teacher teacher) {
    return teacherDao.add(teacher);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * find.
   *
   * @param   id  Integer
   *
   * @return  Teacher
   */
  public Teacher find(Integer id) {
    return teacherDao.find(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * find.
   *
   * @param   username  String
   * @param   password  String
   *
   * @return  Teacher
   */
  public Teacher find(String username, String password) {
    return teacherDao.find(username, password);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * list.
   *
   * @return  List
   */
  public List<Teacher> list() {
    return teacherDao.list();
  }

  //~ ------------------------------------------------------------------------------------------------------------------


  /**
   * setter method for teacher dao.
   *
   * @param  teacherDao  TeacherDao
   */
  public void setTeacherDao(TeacherDao teacherDao) {
    this.teacherDao = teacherDao;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * update.
   *
   * @param  teacher  Teacher
   */
  public void update(Teacher teacher) {
    teacherDao.update(teacher);
  }
} // end class TeacherService
