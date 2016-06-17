package org.wang.sms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import org.wang.sms.model.Clazz;
import org.wang.sms.repository.ClazzDao;
import org.wang.sms.service.ClazzService;


/**
 * Created by Yang Wang on 16/3/4.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 15:17
 */
@Service @Transactional public class ClazzServiceImpl implements ClazzService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private ClazzDao clazzDao;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.sms.service.ClazzService#findOne(java.lang.Integer)
   */
  @Override public Clazz findOne(Integer id) {
    return clazzDao.findOne(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.sms.service.ClazzService#findAll()
   */
  @Override public List<Clazz> findAll() {
    return (List<Clazz>) clazzDao.findAll();
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
} // end class ClazzServiceImpl
