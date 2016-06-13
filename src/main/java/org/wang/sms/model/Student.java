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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


/**
 * Created by Yang Wang on 16/2/15.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:42
 */
@Entity public class Student extends User implements Serializable {
  //~ Static fields/initializers ---------------------------------------------------------------------------------------

  private static final String ROLE = "STUDENT";

  //~ Instance fields --------------------------------------------------------------------------------------------------

  @JoinColumn(
    name                 = "add_id",
    referencedColumnName = "ref_name"
  )
  @OneToOne private Address address;

  @JoinColumn @ManyToMany
// 当前学生参加过的所有的考试
  private Set<Examination>                                        allExams = new LinkedHashSet<Examination>();

  @JoinColumn @OneToMany
// 当前学生的所有成绩
  private Set<Achievement>                                   allScores = new LinkedHashSet<Achievement>();

  @JoinColumn
  @ManyToOne(cascade = { CascadeType.ALL })
// 当前学生的所在的班级
  private Clazz            clazz;

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id private Integer id;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for address.
   *
   * @return  Address
   */
  public Address getAddress() {
    return address;
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
   * getter method for clazz.
   *
   * @return  Clazz
   */
  public Clazz getClazz() {
    return clazz;
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
   * setter method for address.
   *
   * @param  address  Address
   */
  public void setAddress(Address address) {
    this.address = address;
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
   * setter method for clazz.
   *
   * @param  clazz  Clazz
   */
  public void setClazz(Clazz clazz) {
    this.clazz = clazz;
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
} // end class Student
