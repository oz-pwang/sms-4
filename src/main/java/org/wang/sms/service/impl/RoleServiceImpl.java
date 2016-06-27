package org.wang.sms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import org.wang.sms.model.Role;
import org.wang.sms.repository.RoleDao;
import org.wang.sms.repository.SubjectDao;
import org.wang.sms.service.RoleService;

import java.util.List;


/**
 * Created by ozintel06 on 16/6/22.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/22/2016 15:55
 */
@Service @Transactional public class RoleServiceImpl implements RoleService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private RoleDao roleDao;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.sms.service.RoleService#findRolesByImportant(java.lang.String)
   */
  @Override public List<Role> findRolesByImportant(String important) {
    return roleDao.findRolesByImportant(important);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for role dao.
   *
   * @param  roleDao  RoleDao
   */
  public void setRoleDao(RoleDao roleDao) {
    this.roleDao = roleDao;
  }
} // end class RoleServiceImpl
