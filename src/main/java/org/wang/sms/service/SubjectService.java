package org.wang.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.wang.sms.model.Subject;
import org.wang.sms.repository.SubjectDao;


/**
 * Created by Yang Wang on 16/3/4.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:40
 */
@Service public class SubjectService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private SubjectDao subjectDao;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * find.
   *
   * @param   id  Integer
   *
   * @return  Subject
   */
  public Subject find(Integer id) {
    return subjectDao.find(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * find.
   *
   * @param   name  String
   *
   * @return  Subject
   */
  public Subject find(String name) {
    return subjectDao.find(name);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * list.
   *
   * @return  List
   */
  public List<Subject> list() {
    return subjectDao.list();
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
} // end class SubjectService
