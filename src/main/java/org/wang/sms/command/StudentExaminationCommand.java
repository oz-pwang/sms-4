package org.wang.sms.command;

import java.text.SimpleDateFormat;

import org.wang.sms.model.Examination;


/**
 * Created by Yang Wang on 16/3/9.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:45
 */
public class StudentExaminationCommand {
  //~ Static fields/initializers ---------------------------------------------------------------------------------------

  private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

  //~ Instance fields --------------------------------------------------------------------------------------------------

  private String createDate;

  private String creator;

  private Long id;

  private String name;

  private Integer overallResult;

  private String startDate;

  //~ Constructors -----------------------------------------------------------------------------------------------------

  /**
   * Creates a new StudentExaminationCommand object.
   */
  public StudentExaminationCommand() { }


  /**
   * Creates a new StudentExaminationCommand object.
   *
   * @param  e  Examination
   */
  public StudentExaminationCommand(Examination e) {
    this.setId(e.getId());
    this.setName(e.getName());
    this.setOverallResult(e.getOverallResult());

    if (e.getStartDate() != null) {
      this.setStartDate(sdf.format(e.getStartDate()));
    }

    if (e.getCreateDate() != null) {
      this.setCreateDate(sdf.format(e.getCreateDate()));
    }

    if (e.getCreator() != null) {
      this.setCreator(e.getCreator().getName());
    }
  }

  //~ Methods ----------------------------------------------------------------------------------------------------------

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
   * getter method for creator.
   *
   * @return  String
   */
  public String getCreator() {
    return creator;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for id.
   *
   * @return  Integer
   */
  public Long getId() {
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
   * getter method for overall result.
   *
   * @return  Integer
   */
  public Integer getOverallResult() {
    return overallResult;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for start date.
   *
   * @return  String
   */
  public String getStartDate() {
    return startDate;
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
   * setter method for creator.
   *
   * @param  creator  String
   */
  public void setCreator(String creator) {
    this.creator = creator;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for id.
   *
   * @param  id  Integer
   */
  public void setId(Long id) {
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

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for overall result.
   *
   * @param  overallResult  Integer
   */
  public void setOverallResult(Integer overallResult) {
    this.overallResult = overallResult;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for start date.
   *
   * @param  startDate  String
   */
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }
} // end class StudentExaminationCommand
