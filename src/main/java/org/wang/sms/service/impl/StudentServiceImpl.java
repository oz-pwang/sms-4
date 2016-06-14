package org.wang.sms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import org.wang.sms.model.Student;
import org.wang.sms.repository.StudentDao;
import org.wang.sms.service.StudentService;


/**
 * Created by Yang Wang on 16/3/4.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 15:17
 */
@Service @Transactional public class StudentServiceImpl implements StudentService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private StudentDao studentDao;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.sms.service.StudentService#save(org.wang.sms.model.Student)
   */
  @Override public Integer save(Student student) {
    return studentDao.save(student).getId();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.sms.service.StudentService#findOne(java.lang.Integer)
   */
  @Override public Student findOne(Integer id) {
    return studentDao.findOne(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.sms.service.StudentService#findByNameAndPassWord(java.lang.String, java.lang.String)
   */
  @Override public Student findByNameAndPassWord(String username, String password) {
    return studentDao.findByNameAndPassWord(username, password);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.sms.service.StudentService#findStudentByClazzId(java.lang.Integer)
   */
  @Override public List<Student> findStudentByClazzId(Integer id) {
    return studentDao.findStudentByClazzId(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.sms.service.StudentService#findAll()
   */
  @Override public List<Student> findAll() {
    return (List<Student>) studentDao.findAll();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for student dao.
   *
   * @param  studentDao  StudentDao
   */
  public void setStudentDao(StudentDao studentDao) {
    this.studentDao = studentDao;
  }


} // end class StudentServiceImpl
