package org.wang.sms.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.wang.sms.model.Admin;
import org.wang.sms.repository.AdminDao;


/**
 * Created by Yang Wang on 16/3/4.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:41
 */
@Service public class AdminService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private AdminDao adminDao;

  //~ Methods ----------------------------------------------------------------------------------------------------------


  /**
   * find.
   *
   * @param   id  Integer
   *
   * @return  Admin
   */
  public Admin find(Integer id) {
    return adminDao.find(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * find.
   *
   * @param   username  String
   * @param   password  String
   *
   * @return  Admin
   */
  public Admin find(String username, String password) {
    return adminDao.find(username, password);
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
} // end class AdminService
