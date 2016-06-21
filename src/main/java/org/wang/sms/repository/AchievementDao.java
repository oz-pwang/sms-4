package org.wang.sms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import org.springframework.stereotype.Repository;

import org.wang.sms.model.Achievement;


/**
 * Created by Yang Wang on 16/3/4.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:41
 */
@Repository public interface AchievementDao extends CrudRepository<Achievement, Long> {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for by examination id.
   *
   * @param   examinationId  Long
   *
   * @return  List
   */
  @Query("from Achievement as a where a.examination.id=examinationId")
  List<Achievement> findAchievementsByExaminationId(Long examinationId);
}
