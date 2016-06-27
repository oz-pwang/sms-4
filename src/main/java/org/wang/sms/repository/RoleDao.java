package org.wang.sms.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import org.wang.sms.model.Role;

import java.util.List;


/**
 * Created by ozintel06 on 16/6/22.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/22/2016 15:48
 */
@Repository public interface RoleDao extends CrudRepository<Role, Long> {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * findByImportant.
   *
   * @param   important  String
   *
   * @return  Role
   */
  @Query("from Role as r where r.important = important")
  List<Role> findRolesByImportant(String important);
}
