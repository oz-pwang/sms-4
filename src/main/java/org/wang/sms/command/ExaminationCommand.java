package org.wang.sms.command;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.List;

import org.wang.sms.model.Clazz;
import org.wang.sms.model.Examination;
import org.wang.sms.model.Subject;


/**
 * Created by Yang Wang on 16/3/6.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:45
 */
public class ExaminationCommand {
  //~ Static fields/initializers ---------------------------------------------------------------------------------------

  /** TODO: DOCUMENT ME! */
  public static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

  //~ Instance fields --------------------------------------------------------------------------------------------------

  private List<Long>    clazzIdList;
  private List<Clazz>   clazzList     = new ArrayList<Clazz>();
  private String        createDate;
  private String        creator;
  private Long          id;
  private String        name;
  private String        startDate;
  private List<Long>    subjectIdList;
  private List<Subject> subjectList;

  //~ Constructors -----------------------------------------------------------------------------------------------------

  /**
   * Creates a new ExaminationCommand object.
   */
  public ExaminationCommand() { }

  /**
   * Creates a new ExaminationCommand object.
   *
   * @param  examination  Examination
   */
  public ExaminationCommand(Examination examination) {
    this.setId(examination.getId());
    this.setName(examination.getName());

    if (examination.getCreator() != null) {
      this.setCreator(examination.getCreator().getName());
    }

    if (examination.getCreateDate() != null) {
      this.setCreateDate(sdf.format(examination.getCreateDate()));
    }
  }

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for clazz id list.
   *
   * @return  List
   */
  public List<Long> getClazzIdList() {
    return clazzIdList;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for clazz list.
   *
   * @return  List
   */
  public List<Clazz> getClazzList() {
    return clazzList;
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
   * getter method for start date.
   *
   * @return  String
   */
  public String getStartDate() {
    return startDate;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for subject id list.
   *
   * @return  List
   */
  public List<Long> getSubjectIdList() {
    return subjectIdList;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for subject list.
   *
   * @return  List
   */
  public List<Subject> getSubjectList() {
    return subjectList;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for clazz id list.
   *
   * @param  clazzIdList  List
   */
  public void setClazzIdList(List<Long> clazzIdList) {
    this.clazzIdList = clazzIdList;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for clazz list.
   *
   * @param  clazzList  List
   */
  public void setClazzList(List<Clazz> clazzList) {
    this.clazzList = clazzList;
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
   * setter method for start date.
   *
   * @param  startDate  String
   */
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for subject id list.
   *
   * @param  subjectIdList  List
   */
  public void setSubjectIdList(List<Long> subjectIdList) {
    this.subjectIdList = subjectIdList;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for subject list.
   *
   * @param  subjectList  List
   */
  public void setSubjectList(List<Subject> subjectList) {
    this.subjectList = subjectList;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toExamination.
   *
   * @return  Examination
   */
  public Examination toExamination() {
    Examination examination = new Examination();

    examination.setId(this.getId());
    examination.setName(this.getName());

    try {
      examination.setStartDate(sdf.parse(this.getStartDate()));
    } catch (ParseException e) {
      e.printStackTrace();
    }

    return examination;
  }
} // end class ExaminationCommand
