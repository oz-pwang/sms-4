package org.wang.sms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import org.wang.sms.model.User;
import org.wang.sms.repository.UserDao;
import org.wang.sms.service.UserService;


/**
 * Created by ozintel06 on 16/6/21.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/21/2016 16:37
 */
@Service @Transactional public class UserServiceImpl implements UserService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private UserDao userDao;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.sms.service.UserService#findAll()
   */
  @Override public List<User> findAll() {
    return (List<User>) userDao.findAll();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.sms.service.UserService#findByNameAndPassWord(java.lang.String, java.lang.String)
   */
  @Override public User findByNameAndPassWord(String username, String password) {
    return userDao.findByNameAndPassWord(username, password);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.sms.service.UserService#findOne(java.lang.Long)
   */
  @Override public User findOne(Long id) {
    return userDao.findOne(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.sms.service.UserService#findStudentByClazzId(java.lang.Long)
   */
  @Override public List<User> findStudentByClazzId(Long id) {
    return userDao.findStudentByClazzId(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.sms.service.UserService#save(org.wang.sms.model.User)
   */
  @Override public Long save(User student) {
    return userDao.save(student).getId();
  }
} // end class UserServiceImpl
