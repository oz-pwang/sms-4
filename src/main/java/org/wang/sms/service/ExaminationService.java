package org.wang.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.wang.sms.model.Examination;
import org.wang.sms.repository.ClazzDao;
import org.wang.sms.repository.ExaminationDao;


/**
 * Created by Yang Wang on 16/3/4.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:41
 */
@Service public class ExaminationService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private ClazzDao clazzDao;

  @Autowired private ExaminationDao examinationDao;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * add.
   *
   * @param  examination  Examination
   */
  public void add(Examination examination) {
    examinationDao.add(examination);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * find.
   *
   * @param   id  Integer
   *
   * @return  Examination
   */
  public Examination find(Integer id) {
    return examinationDao.find(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for clazz examination.
   *
   * @param   clazzId  Integer
   *
   * @return  List
   */
  public List<Examination> getClazzExamination(Integer clazzId) {
    return examinationDao.findByClazzId(clazzId);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * list.
   *
   * @return  List
   */
  public List<Examination> list() {
    return examinationDao.list();
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
} // end class ExaminationService
