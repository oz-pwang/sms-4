package org.wang.sms.service;

import java.util.List;

import org.wang.sms.model.Student;


/**
 * Created by Yang Wang on 16/3/4.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 15:16
 */
public interface StudentService {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * add.
   *
   * @param   student  Student
   *
   * @return  Integer
   */
  Integer save(Student student);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * find.
   *
   * @param   id  Integer
   *
   * @return  Student
   */
  Student findOne(Integer id);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * find.
   *
   * @param   username  String
   * @param   password  String
   *
   * @return  Student
   */
  Student findByNameAndPassWord(String username, String password);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findClazz.
   *
   * @param   id  Integer
   *
   * @return  List
   */
  List<Student> findStudentByClazzId(Integer id);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * list.
   *
   * @return  List
   */
  List<Student> findAll();



} // end interface StudentService
