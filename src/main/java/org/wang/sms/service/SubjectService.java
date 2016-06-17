package org.wang.sms.service;

import java.util.List;

import org.wang.sms.model.Subject;


/**
 * Created by Yang Wang on 16/3/4.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 15:16
 */
public interface SubjectService {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * find.
   *
   * @param   id  Integer
   *
   * @return  Subject
   */
  Subject findOne(Integer id);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * find.
   *
   * @param   name  String
   *
   * @return  Subject
   */
  Subject findByName(String name);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * list.
   *
   * @return  List
   */
  List<Subject> findAll();
} // end interface SubjectService
