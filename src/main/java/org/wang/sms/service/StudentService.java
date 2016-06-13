package org.wang.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.wang.sms.model.Student;
import org.wang.sms.repository.StudentDao;


/**
 * Created by Yang Wang on 16/3/4.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:40
 */
@Service public class StudentService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private StudentDao studentDao;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * add.
   *
   * @param   student  Student
   *
   * @return  Integer
   */
  public Integer add(Student student) {
    return studentDao.add(student);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * find.
   *
   * @param   id  Integer
   *
   * @return  Student
   */
  public Student find(Integer id) {
    return studentDao.find(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * find.
   *
   * @param   username  String
   * @param   password  String
   *
   * @return  Student
   */
  public Student find(String username, String password) {
    return studentDao.find(username, password);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findClazz.
   *
   * @param   id  Integer
   *
   * @return  List
   */
  public List<Student> findClazz(Integer id) {
    return studentDao.findClazz(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * list.
   *
   * @return  List
   */
  public List<Student> list() {
    return studentDao.list();
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

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * update.
   *
   * @param  student  Student
   */
  public void update(Student student) {
    studentDao.update(student);
  }

} // end class StudentService
