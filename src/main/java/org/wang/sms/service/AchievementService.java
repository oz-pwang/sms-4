package org.wang.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import org.wang.sms.model.Achievement;
import org.wang.sms.repository.AchievementDao;


/**
 * Created by Yang Wang on 16/3/4.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:41
 */
@Service public class AchievementService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private AchievementDao achievementDao;

  //~ Methods ----------------------------------------------------------------------------------------------------------


  /**
   * add.
   *
   * @param  achievement  Achievement
   */
  public void add(Achievement achievement) {
    achievementDao.add(achievement);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for by examination id.
   *
   * @param   examinationId  Integer
   *
   * @return  List
   */
  public List<Achievement> getByExaminationId(Integer examinationId) {
    return achievementDao.getByExaminationId(examinationId);
  }

  //~ ------------------------------------------------------------------------------------------------------------------


  /**
   * setter method for achievement dao.
   *
   * @param  achievementDao  AchievementDao
   */
  public void setAchievementDao(AchievementDao achievementDao) {
    this.achievementDao = achievementDao;
  }
} // end class AchievementService
