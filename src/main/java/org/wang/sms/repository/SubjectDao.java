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
@Repository public interface SubjectDao extends CrudRepository {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * find.
   *
   * @param   id  Integer
   *
   * @return  Subject
   */
  Subject find(Integer id);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * find.
   *
   * @param   name  String
   *
   * @return  Subject
   */
  Subject find(String name);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * list.
   *
   * @return  List
   */
  List<Subject> list();
} // end interface SubjectDao
