package org.wang.sms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import org.wang.sms.model.User;


/**
 * Created by ozintel06 on 16/6/21.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/21/2016 16:34
 */
public interface UserDao extends CrudRepository<User, Long> {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * findByNameAndPassWord.
   *
   * @param   username  String
   * @param   password  String
   *
   * @return  User
   */
  User findByNameAndPassWord(String username, String password);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findStudentByClazzId.
   *
   * @param   clazzId  Long
   *
   * @return  List
   */
  @Query("from User as s where s.clazz.id = clazzId")
  List<User> findStudentByClazzId(Long clazzId);
} // end interface UserDao
