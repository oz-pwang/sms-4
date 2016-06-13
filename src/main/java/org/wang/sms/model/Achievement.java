package org.wang.sms.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/**
 * Created by Yang Wang on 16/2/16.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:43
 */
@Entity public class Achievement implements Serializable {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @JoinColumn(name = "examinationId")
  @ManyToOne(cascade = { CascadeType.ALL })
  // 此次成绩对应的考试
  private Examination examination;


  @Column
// 分数
  private Integer             fraction;

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id private Integer id;

  @JoinColumn(name = "studentId")
  @ManyToOne(cascade = { CascadeType.ALL })
// 这是哪个学生的成绩
  private Student student;

  @JoinColumn(name = "subjectId")
  @ManyToOne(cascade = { CascadeType.ALL })
  // 此次成绩对应的科目
  private Subject subject;

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
   * getter method for fraction.
   *
   * @return  Integer
   */
  public Integer getFraction() {
    return fraction;
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
   * getter method for student.
   *
   * @return  Student
   */
  public Student getStudent() {
    return student;
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
   * setter method for examination.
   *
   * @param  examination  Examination
   */
  public void setExamination(Examination examination) {
    this.examination = examination;
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
   * setter method for id.
   *
   * @param  id  Integer
   */
  public void setId(Integer id) {
    this.id = id;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for student.
   *
   * @param  student  Student
   */
  public void setStudent(Student student) {
    this.student = student;
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
} // end class Achievement
