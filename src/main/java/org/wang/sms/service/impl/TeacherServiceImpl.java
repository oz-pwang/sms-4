package org.wang.sms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import org.wang.sms.model.Teacher;
import org.wang.sms.repository.TeacherDao;
import org.wang.sms.service.TeacherService;


/**
 * Created by Yang Wang on 16/3/4.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 15:17
 */
@Service @Transactional public class TeacherServiceImpl implements TeacherService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private TeacherDao teacherDao;

  //~ Methods ----------------------------------------------------------------------------------------------------------


  /**
   * @see  org.wang.sms.service.TeacherService#save(org.wang.sms.model.Teacher)
   */
  @Override public Integer save(Teacher teacher) {
    return teacherDao.save(teacher).getId();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.sms.service.TeacherService#find(java.lang.Integer)
   */
  @Override public Teacher find(Integer id) {
    return teacherDao.findOne(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.sms.service.TeacherService#findByNameAndPassWord(java.lang.String, java.lang.String)
   */
  @Override public Teacher findByNameAndPassWord(String username, String password) {
    return teacherDao.findByNameAndPassWord(username, password);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.sms.service.TeacherService#findAll()
   */
  @Override public List<Teacher> findAll() {
    return (List<Teacher>) teacherDao.findAll();
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

} // end class TeacherServiceImpl
