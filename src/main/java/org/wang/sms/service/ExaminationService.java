package org.wang.sms.service;

import java.util.List;

import org.wang.sms.model.Examination;


/**
 * Created by Yang Wang on 16/3/4.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 15:16
 */
public interface ExaminationService {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * add.
   *
   * @param  examination  Examination
   */
  void save(Examination examination);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * find.
   *
   * @param   id  Integer
   *
   * @return  Examination
   */
  Examination findOne(Integer id);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for clazz examination.
   *
   * @param   clazzId  Integer
   *
   * @return  List
   */
  List<Examination> findExaminationByClazzId(Integer clazzId);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * list.
   *
   * @return  List
   */
  List<Examination> findAll();
} // end interface ExaminationService
