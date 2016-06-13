package org.wang.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import org.wang.sms.model.Admin;


/**
 * Created by Yang Wang on 16/3/4.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:41
 */
@Repository public interface AdminDao extends JpaRepository {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * find.
   *
   * @param   id  Integer
   *
   * @return  Admin
   */
  Admin find(Integer id);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * find.
   *
   * @param   username  String
   * @param   password  String
   *
   * @return  Admin
   */
  Admin find(String username, String password);
}
