package org.wang.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.wang.sms.model.Clazz;
import org.wang.sms.repository.ClazzDao;


/**
 * Created by Yang Wang on 16/3/4.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:41
 */
@Service public class ClazzService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private ClazzDao clazzDao;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * find.
   *
   * @param   id  Integer
   *
   * @return  Clazz
   */
  public Clazz find(Integer id) {
    return clazzDao.find(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * List.
   *
   * @return  List
   */
  public List<Clazz> List() {
    return clazzDao.list();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * list.
   *
   * @return  List
   */
  public List<Clazz> list() {
    return clazzDao.list();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for clazz dao.
   *
   * @param  clazzDao  ClazzDao
   */
  public void setClazzDao(ClazzDao clazzDao) {
    this.clazzDao = clazzDao;
  }
} // end class ClazzService
