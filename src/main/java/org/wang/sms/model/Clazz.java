package org.wang.sms.model;

import java.io.Serializable;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


/**
 * Created by Yang Wang on 16/2/15.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:42
 */
@Entity public class Clazz implements Serializable {
  //~ Static fields/initializers ---------------------------------------------------------------------------------------

  /** Use serialVersionUID for interoperability. */
  private static final long serialVersionUID = -3720683688781994444L;

  //~ Instance fields --------------------------------------------------------------------------------------------------

  @JoinColumn @OneToMany private Set<Examination> examinationSet = new HashSet<Examination>();

  @JoinColumn(name = "teacherId")
  @OneToOne(cascade = { CascadeType.ALL })
// 班主任
  private User headTeacher;

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id private Long id;

  @Column private String name;


  @JoinColumn @OneToMany
// 当前班级拥有的所有学生
  private Set<User>                                     studentSet;

  @JoinColumn @OneToMany
// 所有的任课 老师（ 多个科目   不同的老师）
  private Set<User> teacherSet = new HashSet<User>();

  //~ Methods ----------------------------------------------------------------------------------------------------------

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
   * getter method for head teacher.
   *
   * @return  User
   */
  public User getHeadTeacher() {
    return headTeacher;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for head teacher.
   *
   * @return  Teacher
   */

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
   * getter method for student set.
   *
   * @return  Set
   */
  public Set<User> getStudentSet() {
    return studentSet;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for teacher set.
   *
   * @return  Set
   */
  public Set<User> getTeacherSet() {
    return teacherSet;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for student set.
   *
   * @param  examinationSet  Set
   */

  /**
   * getter method for teacher set.
   *
   * @param  examinationSet  Set
   */

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
   * setter method for head teacher.
   *
   * @param  headTeacher  User
   */
  public void setHeadTeacher(User headTeacher) {
    this.headTeacher = headTeacher;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for head teacher.
   *
   * @param  id  headTeacher Teacher
   */

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
   * setter method for student set.
   *
   * @param  studentSet  Set
   */
  public void setStudentSet(Set<User> studentSet) {
    this.studentSet = studentSet;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for teacher set.
   *
   * @param  teacherSet  Set
   */
  public void setTeacherSet(Set<User> teacherSet) {
    this.teacherSet = teacherSet;
  }

  /**
   * setter method for student set.
   *
   * @param  studentSet  Set
   */

  /**
   * setter method for teacher set.
   *
   * @param  teacherSet  Set
   */

} // end class Clazz
