package org.wang.sms.model;

import java.io.Serializable;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


/**
 * Created by Yang Wang on 16/2/15.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:42
 */
@Entity public class Teacher extends User implements Serializable {
  //~ Static fields/initializers ---------------------------------------------------------------------------------------

  private static final String ROLE = "TEACHER";

  //~ Instance fields --------------------------------------------------------------------------------------------------

  @JoinColumn
  @ManyToOne(cascade = { CascadeType.ALL })
// 当前教师教学的班级
  private Clazz            clazz;

  @JoinColumn @OneToMany
// 教师创建的考试（多个）
  private Set<Examination>                                     examinationSet = new LinkedHashSet<Examination>();

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id private Integer id;

  @JoinColumn(name = "subjectId")
  @ManyToOne(cascade = { CascadeType.ALL })
// 教学科目
  private Subject subject;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for clazz.
   *
   * @return  Clazz
   */
  public Clazz getClazz() {
    return clazz;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for examination set.
   *
   * @return  Set
   */
  public Set<Examination> getExaminationSet() {
    return examinationSet;
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
   * getter method for subject.
   *
   * @return  Subject
   */
  public Subject getSubject() {
    return subject;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for clazz.
   *
   * @param  clazz  Clazz
   */
  public void setClazz(Clazz clazz) {
    this.clazz = clazz;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for examination set.
   *
   * @param  examinationSet  Set
   */
  public void setExaminationSet(Set<Examination> examinationSet) {
    this.examinationSet = examinationSet;
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
   * setter method for subject.
   *
   * @param  subject  Subject
   */
  public void setSubject(Subject subject) {
    this.subject = subject;
  }
} // end class Teacher
