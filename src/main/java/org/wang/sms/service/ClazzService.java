package org.wang.sms.service;

import java.util.List;

import org.wang.sms.model.Clazz;


/**
 * Created by Yang Wang on 16/3/4.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 15:16
 */
public interface ClazzService {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * list.
   *
   * @return  List
   */
  List<Clazz> findAll();

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * find.
   *
   * @param   id  Integer
   *
   * @return  Clazz
   */
  Clazz findOne(Long id);
} // end interface ClazzService
