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
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Transient;


/**
 * Created by Yang Wang on 16/2/15.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  03/08/2016 12:04
 */
@Entity public class User implements Serializable {
  //~ Static fields/initializers ---------------------------------------------------------------------------------------

  /** Use serialVersionUID for interoperability. */
  private static final long serialVersionUID = -5156075693328055274L;

  //~ Instance fields --------------------------------------------------------------------------------------------------

  /** TODO: DOCUMENT ME! */
  @Column private Integer                                         age;
  @JoinColumn @ManyToMany
// 当前学生参加过的所有的考试
  private Set<Examination>                                        allExams = new LinkedHashSet<Examination>();

  @JoinColumn @OneToMany
// 当前学生的所有成绩
  private Set<Achievement>                                   allScores = new LinkedHashSet<Achievement>();

  /** TODO: DOCUMENT ME! */
  @Column private Date birthDate;

  /** TODO: DOCUMENT ME! */
  @Transient private String birthDateString;

  @JoinColumn
  @ManyToOne(cascade = { CascadeType.ALL })
// 当前学生的所在的班级
  private Clazz            clazz;

  @JoinColumn @OneToMany
// 教师创建的考试（多个）
  private Set<Examination>                                     examinationSet = new LinkedHashSet<Examination>();

  /** TODO: DOCUMENT ME! */
  @Column private String gender;

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id private Long id;

  /** TODO: DOCUMENT ME! */
  @Column(length = 18)
  private String IDCardNumber;

  /** TODO: DOCUMENT ME! */
  @Column(
    length   = 12,
    nullable = false
  )
  private String name;

  /** TODO: DOCUMENT ME! */
  @Column(
    length   = 16,
    nullable = false
  )
  private String passWord;

  /** TODO: DOCUMENT ME! */
  @Column(length = 11)
  private String phoneNumber;

  @JoinTable(
    name               = "user_role",
    joinColumns        = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "role_id")
  )
  @ManyToMany private Set<Role> roleSet;

  @JoinColumn(name = "subjectId")
  @ManyToOne(cascade = { CascadeType.ALL })
// 教学科目
  private Subject subject;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for age.
   *
   * @return  Integer
   */
  public Integer getAge() {
    return age;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for all exams.
   *
   * @return  Set
   */
  public Set<Examination> getAllExams() {
    return allExams;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for all scores.
   *
   * @return  Set
   */
  public Set<Achievement> getAllScores() {
    return allScores;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for birth date.
   *
   * @return  Date
   */
  public Date getBirthDate() {
    return birthDate;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for birth date string.
   *
   * @return  String
   */
  public String getBirthDateString() {
    return birthDateString;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

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
   * getter method for gender.
   *
   * @return  String
   */
  public String getGender() {
    return gender;
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
   * getter method for IDCard number.
   *
   * @return  String
   */
  public String getIDCardNumber() {
    return IDCardNumber;
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
   * getter method for pass word.
   *
   * @return  String
   */
  public String getPassWord() {
    return passWord;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for phone number.
   *
   * @return  String
   */
  public String getPhoneNumber() {
    return phoneNumber;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for role set.
   *
   * @return  Set
   */
  public Set<Role> getRoleSet() {
    return roleSet;
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
   * setter method for age.
   *
   * @param  age  Integer
   */
  public void setAge(Integer age) {
    this.age = age;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for all exams.
   *
   * @param  allExams  Set
   */
  public void setAllExams(Set<Examination> allExams) {
    this.allExams = allExams;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for all scores.
   *
   * @param  allScores  Set
   */
  public void setAllScores(Set<Achievement> allScores) {
    this.allScores = allScores;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for birth date.
   *
   * @param  birthDate  Date
   */
  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for birth date string.
   *
   * @param  birthDateString  String
   */
  public void setBirthDateString(String birthDateString) {
    this.birthDateString = birthDateString;
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
   * setter method for gender.
   *
   * @param  gender  String
   */
  public void setGender(String gender) {
    this.gender = gender;
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
   * setter method for IDCard number.
   *
   * @param  IDCardNumber  String
   */
  public void setIDCardNumber(String IDCardNumber) {
    this.IDCardNumber = IDCardNumber;
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
   * setter method for pass word.
   *
   * @param  passWord  String
   */
  public void setPassWord(String passWord) {
    this.passWord = passWord;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for phone number.
   *
   * @param  phoneNumber  String
   */
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for role set.
   *
   * @param  roleSet  Set
   */
  public void setRoleSet(Set<Role> roleSet) {
    this.roleSet = roleSet;
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
} // end class User
