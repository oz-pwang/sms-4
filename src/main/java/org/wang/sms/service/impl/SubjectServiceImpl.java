package org.wang.sms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import org.wang.sms.model.Subject;
import org.wang.sms.repository.SubjectDao;
import org.wang.sms.service.SubjectService;


/**
 * Created by Yang Wang on 16/3/4.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 15:17
 */
@Service @Transactional public class SubjectServiceImpl implements SubjectService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private SubjectDao subjectDao;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.sms.service.SubjectService#findOne(java.lang.Integer)
   */
  @Override public Subject findOne(Integer id) {
    return subjectDao.findOne(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.sms.service.SubjectService#findByName(java.lang.String)
   */
  @Override public Subject findByName(String name) {
    return subjectDao.findByName(name);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.sms.service.SubjectService#findAll()
   */
  @Override public List<Subject> findAll() {
    return (List<Subject>) subjectDao.findAll();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for subject dao.
   *
   * @param  subjectDao  SubjectDao
   */
  public void setSubjectDao(SubjectDao subjectDao) {
    this.subjectDao = subjectDao;
  }
} // end class SubjectServiceImpl
