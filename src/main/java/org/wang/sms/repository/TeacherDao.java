package org.wang.sms.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import org.wang.sms.model.Teacher;


/**
 * Created by Yang Wang on 16/3/4.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:41
 */
@Repository public interface TeacherDao extends CrudRepository {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * add.
   *
   * @param   teacher  Teacher
   *
   * @return  Integer
   */
  Integer add(Teacher teacher);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * find.
   *
   * @param   id  Integer
   *
   * @return  Teacher
   */
  Teacher find(Integer id);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * find.
   *
   * @param   username  String
   * @param   password  String
   *
   * @return  Teacher
   */
  Teacher find(String username, String password);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * list.
   *
   * @return  List
   */
  List<Teacher> list();

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * update.
   *
   * @param  teacher  Teacher
   */
  void update(Teacher teacher);
} // end interface TeacherDao
