package org.wang.sms.service;

import java.util.List;

import org.wang.sms.model.Achievement;


/**
 * Created by Yang Wang on 16/3/4.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 15:16
 */
public interface AchievementService {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for by examination id.
   *
   * @param   examinationId  Integer
   *
   * @return  List
   */
  List<Achievement> getByExaminationId(Long examinationId);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * add.
   *
   * @param  achievement  Achievement
   */
  void save(Achievement achievement);
}
