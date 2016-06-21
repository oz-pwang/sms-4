package org.wang.sms.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import org.wang.sms.model.Subject;


/**
 * Created by Yang Wang on 16/3/4.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:41
 */
@Repository public interface SubjectDao extends CrudRepository<Subject, Long> {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * find.
   *
   * @param   name  String
   *
   * @return  Subject
   */
  Subject findByName(String name);

} // end interface SubjectDao
