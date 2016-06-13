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
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @JoinColumn @OneToMany private Set<Examination> examinationSet = new HashSet<Examination>();

  @JoinColumn(name = "teacherId")
  @OneToOne(cascade = { CascadeType.ALL })
// 班主任
  private Teacher headTeacher;

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id private Integer id;

  @Column private String name;


  @JoinColumn @OneToMany
// 当前班级拥有的所有学生
  private Set<Student>                                     studentSet;

  @JoinColumn @OneToMany
// 所有的任课 老师（ 多个科目   不同的老师）
  private Set<Teacher> teacherSet = new HashSet<Teacher>();

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
   * @return  Teacher
   */
  public Teacher getHeadTeacher() {
    return headTeacher;
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
   * getter method for student set.
   *
   * @return  Set
   */
  public Set<Student> getStudentSet() {
    return studentSet;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for teacher set.
   *
   * @return  Set
   */
  public Set<Teacher> getTeacherSet() {
    return teacherSet;
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
   * setter method for head teacher.
   *
   * @param  headTeacher  Teacher
   */
  public void setHeadTeacher(Teacher headTeacher) {
    this.headTeacher = headTeacher;
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
   * setter method for student set.
   *
   * @param  studentSet  Set
   */
  public void setStudentSet(Set<Student> studentSet) {
    this.studentSet = studentSet;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for teacher set.
   *
   * @param  teacherSet  Set
   */
  public void setTeacherSet(Set<Teacher> teacherSet) {
    this.teacherSet = teacherSet;
  }
} // end class Clazz
