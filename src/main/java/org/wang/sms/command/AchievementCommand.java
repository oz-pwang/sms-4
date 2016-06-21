package org.wang.sms.command;

import java.util.ArrayList;
import java.util.List;

import org.wang.sms.model.Examination;
import org.wang.sms.model.Subject;
import org.wang.sms.model.User;


/**
 * Created by Yang Wang on 16/3/9.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:45
 */
public class AchievementCommand {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  private Examination examination = new Examination();

  private Integer examinationId;

// 分数
  private Integer fraction;
  private Integer id;

  private Integer studentId;

  private List<User> studentList = new ArrayList<User>();
  private String     studentName;

  private Subject subject = new Subject();

  private Integer subjectId;
  private User    teacher;
  private Integer teacherId;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for examination.
   *
   * @return  Examination
   */
  public Examination getExamination() {
    return examination;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for examination id.
   *
   * @return  Integer
   */
  public Integer getExaminationId() {
    return examinationId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for fraction.
   *
   * @return  Integer
   */
  public Integer getFraction() {
    return fraction;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for student id.
   *
   * @return  Integer
   */
  public Integer getStudentId() {
    return studentId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for student list.
   *
   * @return  List
   */
  public List<User> getStudentList() {
    return studentList;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for student name.
   *
   * @return  String
   */
  public String getStudentName() {
    return studentName;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for subject.
   *
   * @return  Subject
   */
  public Subject getSubject() {
    return subject;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for subject id.
   *
   * @return  Integer
   */
  public Integer getSubjectId() {
    return subjectId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for teacher.
   *
   * @return  Teacher
   */
  public User getTeacher() {
    return teacher;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for teacher id.
   *
   * @return  Integer
   */
  public Integer getTeacherId() {
    return teacherId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for examination.
   *
   * @param  examination  Examination
   */
  public void setExamination(Examination examination) {
    this.examination = examination;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for examination id.
   *
   * @param  examinationId  Integer
   */
  public void setExaminationId(Integer examinationId) {
    this.examinationId = examinationId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for fraction.
   *
   * @param  fraction  Integer
   */
  public void setFraction(Integer fraction) {
    this.fraction = fraction;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for student id.
   *
   * @param  studentId  Integer
   */
  public void setStudentId(Integer studentId) {
    this.studentId = studentId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for student list.
   *
   * @param  studentList  List
   */
  public void setStudentList(List<User> studentList) {
    this.studentList = studentList;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for student name.
   *
   * @param  studentName  String
   */
  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for subject.
   *
   * @param  subject  Subject
   */
  public void setSubject(Subject subject) {
    this.subject = subject;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for subject id.
   *
   * @param  subjectId  Integer
   */
  public void setSubjectId(Integer subjectId) {
    this.subjectId = subjectId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for teacher.
   *
   * @param  teacher  Teacher
   */
  public void setTeacher(User teacher) {
    this.teacher = teacher;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for teacher id.
   *
   * @param  teacherId  Integer
   */
  public void setTeacherId(Integer teacherId) {
    this.teacherId = teacherId;
  }
} // end class AchievementCommand
