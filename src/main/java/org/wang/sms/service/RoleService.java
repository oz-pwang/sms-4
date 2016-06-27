package org.wang.sms.service;

import org.wang.sms.model.Role;

import java.util.List;


/**
 * Created by ozintel06 on 16/6/22.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/22/2016 15:56
 */
public interface RoleService {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * findByImportant.
   *
   * @param   important  String
   *
   * @return  Role
   */
  List<Role> findRolesByImportant(String important);
}
