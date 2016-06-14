package org.wang.sms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import org.wang.sms.model.Student;


/**
 * Created by Yang Wang on 16/3/4.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:41
 */
@Repository public interface StudentDao extends CrudRepository<Student,Integer> {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * find.
   *
   * @param   username  String
   * @param   password  String
   *
   * @return  Student
   */
  Student findByNameAndPassWord(String username, String password);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findClazz.
   *
   * @param   clazzId  Integer
   *
   * @return  List
   */
@Query("from Student as s where s.clazz.id = clazzId")
  List<Student> findStudentByClazzId(Integer clazzId);


} // end interface StudentDao
