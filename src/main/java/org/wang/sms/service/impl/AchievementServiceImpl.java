package org.wang.sms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import org.wang.sms.model.Achievement;
import org.wang.sms.repository.AchievementDao;
import org.wang.sms.service.AchievementService;


/**
 * Created by Yang Wang on 16/3/4.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 15:17
 */
@Service @Transactional public class AchievementServiceImpl implements AchievementService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private AchievementDao achievementDao;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.sms.service.AchievementService#getByExaminationId(java.lang.Long)
   */
  @Override public List<Achievement> getByExaminationId(Long examinationId) {
    return achievementDao.findAchievementsByExaminationId(examinationId);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wang.sms.service.AchievementService#save(org.wang.sms.model.Achievement)
   */
  @Override public void save(Achievement achievement) {
    achievementDao.save(achievement);
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
} // end class AchievementServiceImpl
