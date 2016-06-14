package org.wang.sms.service;

import java.util.List;

import org.wang.sms.model.Teacher;


/**
 * Created by Yang Wang on 16/3/4.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 15:16
 */
public interface TeacherService {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * add.
   *
   * @param   teacher  Teacher
   *
   * @return  Integer
   */
  Integer save(Teacher teacher);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * find.
   *
   * @param   id  Integer
   *
   * @return  Teacher
   */
  Teacher find(Integer id);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * find.
   *
   * @param   username  String
   * @param   password  String
   *
   * @return  Teacher
   */
  Teacher findByNameAndPassWord(String username, String password);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * list.
   *
   * @return  List
   */
  List<Teacher> findAll();

  //~ ------------------------------------------------------------------------------------------------------------------

} // end interface TeacherService
