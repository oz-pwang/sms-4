package org.wang.sms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import org.wang.sms.model.Admin;
import org.wang.sms.repository.AdminDao;
import org.wang.sms.service.AdminService;


/**
 * Created by Yang Wang on 16/3/4.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 15:17
 */
@Service @Transactional public class AdminServiceImpl implements AdminService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private AdminDao adminDao;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.sms.service.AdminService#findOne(java.lang.Integer)
   */
  @Override public Admin findOne(Integer id) {
    return adminDao.findOne(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.sms.service.AdminService#findByNameAndPassWord(java.lang.String, java.lang.String)
   */
  @Override public Admin findByNameAndPassWord(String username, String password) {
    return adminDao.findByNameAndPassWord(username,password);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for admin dao.
   *
   * @param  adminDao  AdminDao
   */
  public void setAdminDao(AdminDao adminDao) {
    this.adminDao = adminDao;
  }
} // end class AdminServiceImpl
