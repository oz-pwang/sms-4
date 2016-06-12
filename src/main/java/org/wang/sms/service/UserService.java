package org.wang.sms.service;

import javax.annotation.Resource;

import org.springframework.context.annotation.Bean;

import org.springframework.stereotype.Service;

import org.wang.sms.model.User;
import org.wang.sms.repository.UserDao;


/**
 * Created by ozintel06 on 16/5/16.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  05/17/2016 16:02
 */
@Service public class UserService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  /** TODO: DOCUMENT ME! */
  @Resource UserDao userDao;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * delete.
   *
   * @param  user  User
   */
  public void delete(User user) {
    userDao.delete(user);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findByEmail.
   *
   * @param   email  String
   *
   * @return  User
   */
  public User findByEmail(String email) {
    return userDao.findByEmail(email);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findOne.
   *
   * @param   id  long
   *
   * @return  User
   */
  public User findOne(long id) {
    return userDao.findOne(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * save.
   *
   * @param   user  User
   *
   * @return  User
   */
  public User save(User user) {
    return userDao.save(user);
  }
} // end class UserService
