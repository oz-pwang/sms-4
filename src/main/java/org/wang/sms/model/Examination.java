package org.wang.sms.model;

import java.io.Serializable;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


/**
 * Created by Yang Wang on 16/2/15.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:42
 */
@Entity public class Examination implements Serializable {
  //~ Static fields/initializers ---------------------------------------------------------------------------------------

  /** Use serialVersionUID for interoperability. */
  private static final long serialVersionUID = -6003607511793012344L;

  //~ Instance fields --------------------------------------------------------------------------------------------------

  @JoinColumn @OneToMany
// 当次考试的所有成绩
  private Set<Achievement>                                   achievementSet = new LinkedHashSet<Achievement>();

  @Column private String achievementStatus;

  @JoinColumn
  @ManyToMany(cascade = { CascadeType.ALL })
  private Set<Clazz>             clazzSet;


  @Column private Date createDate;

  // 当前考试的创建者
  @JoinColumn(name = "teacherId")
  @ManyToOne(cascade = { CascadeType.ALL })
  private User creator;

  @Column private String examinationStatus;

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id private Integer id;

  @Column private String name;

  @Column private Integer OverallResult;

  @Column private Date startDate;

  @JoinColumn @OneToMany private Set<User> studentSet = new LinkedHashSet<User>();

  @JoinTable(
    name               = "user_role",
    joinColumns        = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "role_id")
  )
// 每次考试有多个科目
  @ManyToMany private Set<Subject> subjectSet = new LinkedHashSet<Subject>();

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for achievement set.
   *
   * @return  Set
   */
  public Set<Achievement> getAchievementSet() {
    return achievementSet;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

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
   * getter method for clazz set.
   *
   * @return  Set
   */
  public Set<Clazz> getClazzSet() {
    return clazzSet;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for create date.
   *
   * @return  Date
   */
  public Date getCreateDate() {
    return createDate;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for creator.
   *
   * @return  User
   */
  public User getCreator() {
    return creator;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for creator.
   *
   * @return  Teacher
   */

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
   * getter method for overall result.
   *
   * @return  Integer
   */
  public Integer getOverallResult() {
    return OverallResult;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for start date.
   *
   * @return  Date
   */
  public Date getStartDate() {
    return startDate;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for student set.
   *
   * @return  Set
   */
  public Set<User> getStudentSet() {
    return studentSet;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for student set.
   *
   * @return  Set
   */

  /**
   * getter method for subject set.
   *
   * @return  Set
   */
  public Set<Subject> getSubjectSet() {
    return subjectSet;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for achievement set.
   *
   * @param  achievementSet  Set
   */
  public void setAchievementSet(Set<Achievement> achievementSet) {
    this.achievementSet = achievementSet;
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
   * setter method for clazz set.
   *
   * @param  clazzSet  Set
   */
  public void setClazzSet(Set<Clazz> clazzSet) {
    this.clazzSet = clazzSet;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for create date.
   *
   * @param  createDate  Date
   */
  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for creator.
   *
   * @param  creator  User
   */
  public void setCreator(User creator) {
    this.creator = creator;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for creator.
   *
   * @param  examinationStatus  creator Teacher
   */

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

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for overall result.
   *
   * @param  overallResult  Integer
   */
  public void setOverallResult(Integer overallResult) {
    OverallResult = overallResult;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for start date.
   *
   * @param  startDate  Date
   */
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for student set.
   *
   * @param  studentSet  Set
   */
  public void setStudentSet(Set<User> studentSet) {
    this.studentSet = studentSet;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for student set.
   *
   * @param  subjectSet  Set
   */

  /**
   * setter method for subject set.
   *
   * @param  subjectSet  Set
   */
  public void setSubjectSet(Set<Subject> subjectSet) {
    this.subjectSet = subjectSet;
  }
} // end class Examination
