package org.wang.sms.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import org.wang.sms.model.Student;


/**
 * Created by Yang Wang on 16/3/4.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:41
 */
@Repository public interface StudentDao extends CrudRepository {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * add.
   *
   * @param   student  Student
   *
   * @return  Integer
   */
  Integer add(Student student);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * find.
   *
   * @param   id  Integer
   *
   * @return  Student
   */
  Student find(Integer id);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * find.
   *
   * @param   username  String
   * @param   password  String
   *
   * @return  Student
   */
  Student find(String username, String password);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findClazz.
   *
   * @param   id  Integer
   *
   * @return  List
   */
  List<Student> findClazz(Integer id);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * list.
   *
   * @return  List
   */
  List<Student> list();

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * update.
   *
   * @param  student  Student
   */
  void update(Student student);

} // end interface StudentDao
