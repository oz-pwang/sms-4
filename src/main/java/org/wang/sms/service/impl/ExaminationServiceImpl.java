package org.wang.sms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import org.wang.sms.model.Examination;
import org.wang.sms.repository.ClazzDao;
import org.wang.sms.repository.ExaminationDao;
import org.wang.sms.service.ExaminationService;


/**
 * Created by Yang Wang on 16/3/4.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 15:17
 */
@Service @Transactional public class ExaminationServiceImpl implements ExaminationService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private ClazzDao clazzDao;

  @Autowired private ExaminationDao examinationDao;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.sms.service.ExaminationService#save(org.wang.sms.model.Examination)
   */
  @Override public void save(Examination examination) {
    examinationDao.save(examination);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.sms.service.ExaminationService#findOne(java.lang.Integer)
   */
  @Override public Examination findOne(Integer id) {
    return examinationDao.findOne(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.sms.service.ExaminationService#findExaminationByClazzId(java.lang.Integer)
   */
  @Override public List<Examination> findExaminationByClazzId(Integer clazzId) {
    return examinationDao.findExaminationByClazzId(clazzId);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.sms.service.ExaminationService#list()
   */
  @Override public List<Examination> findAll() {
    return (List<Examination>) examinationDao.findAll();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for examination dao.
   *
   * @param  examinationDao  ExaminationDao
   */
  public void setExaminationDao(ExaminationDao examinationDao) {
    this.examinationDao = examinationDao;
  }
} // end class ExaminationServiceImpl
