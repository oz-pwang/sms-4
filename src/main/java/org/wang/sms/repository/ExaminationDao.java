package org.wang.sms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import org.wang.sms.model.Examination;


/**
 * Created by Yang Wang on 16/3/4.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:41
 */
@Repository public interface ExaminationDao extends CrudRepository<Examination,Integer> {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * findByClazzId.
   *
   * @param   clazzId  Integer
   *
   * @return  List
   */
  @Query("select distinct e from Examination e left join e.clazzSet c where c.id = :clazzId")
  List<Examination> findExaminationByClazzId(Integer clazzId);

} // end interface ExaminationDao
