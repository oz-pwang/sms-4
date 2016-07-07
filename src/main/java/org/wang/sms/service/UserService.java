package org.wang.sms.service;

import java.util.List;

import org.wang.sms.model.User;


/**
 * Created by ozintel06 on 16/6/21.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/21/2016 11:00
 */
public interface UserService {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * list.
   *
   * @return  List
   */
  List<User> findAll();

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * find.
   *
   * @param   username  String
   * @param   password  String
   *
   * @return  Student
   */
  User findByNameAndPassWord(String username, String password);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * find.
   *
   * @param   id  Integer
   *
   * @return  Student
   */
  User findOne(Long id);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * add.
   *
   * @param   student  Student
   *
   * @return  Integer
   */
  Long save(User student);


} // end interface UserService
