package org.wang.sms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import org.wang.sms.model.User;


/**
 * Created by ozintel06 on 16/6/21.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/21/2016 16:34
 */
@Repository public interface UserDao extends CrudRepository<User, Long> {
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

} // end interface UserDao
