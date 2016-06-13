package org.wang.sms.command;

import java.text.SimpleDateFormat;

import org.wang.sms.model.Examination;


/**
 * Created by Yang Wang on 16/3/9.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:45
 */
public class TeacherExaminationCommand {
  //~ Static fields/initializers ---------------------------------------------------------------------------------------

  private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

  //~ Instance fields --------------------------------------------------------------------------------------------------

  private String  achievementStatus;
  private String  createDate;
  private String  examinationStatus;
  private Integer id;
  private String  name;

  //~ Constructors -----------------------------------------------------------------------------------------------------

  /**
   * Creates a new TeacherExaminationCommand object.
   */
  public TeacherExaminationCommand() { }

  /**
   * Creates a new TeacherExaminationCommand object.
   *
   * @param  e  Examination
   */
  public TeacherExaminationCommand(Examination e) {
    this.setId(e.getId());
    this.setName(e.getName());
    this.setExaminationStatus(e.getExaminationStatus());
    this.setAchievementStatus(e.getAchievementStatus());

    if (e.getCreateDate() != null) {
      this.setCreateDate(sdf.format(e.getCreateDate()));
    }
  }

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for achievement status.
   *
   * @return  String
   */
  public String getAchievementStatus() {
    return achievementStatus;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for create date.
   *
   * @return  String
   */
  public String getCreateDate() {
    return createDate;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for examination status.
   *
   * @return  String
   */
  public String getExaminationStatus() {
    return examinationStatus;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for id.
   *
   * @return  Integer
   */
  public Integer getId() {
    return id;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for name.
   *
   * @return  String
   */
  public String getName() {
    return name;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for achievement status.
   *
   * @param  achievementStatus  String
   */
  public void setAchievementStatus(String achievementStatus) {
    this.achievementStatus = achievementStatus;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for create date.
   *
   * @param  createDate  String
   */
  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for examination status.
   *
   * @param  examinationStatus  String
   */
  public void setExaminationStatus(String examinationStatus) {
    this.examinationStatus = examinationStatus;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for id.
   *
   * @param  id  Integer
   */
  public void setId(Integer id) {
    this.id = id;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for name.
   *
   * @param  name  String
   */
  public void setName(String name) {
    this.name = name;
  }
} // end class TeacherExaminationCommand
