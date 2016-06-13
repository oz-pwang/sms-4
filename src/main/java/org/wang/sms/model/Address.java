package org.wang.sms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


/**
 * Created by Yang Wang on 16/3/13.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:43
 */
@Entity public class Address {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id private Integer id;

  @Column private Integer ref_id;

  @Column private String ref_name;

  @JoinColumn @OneToOne private Student student;

  //~ Methods ----------------------------------------------------------------------------------------------------------

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
   * getter method for ref id.
   *
   * @return  Integer
   */
  public Integer getRef_id() {
    return ref_id;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for ref name.
   *
   * @return  String
   */
  public String getRef_name() {
    return ref_name;
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
   * setter method for id.
   *
   * @param  id  Integer
   */
  public void setId(Integer id) {
    this.id = id;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for ref id.
   *
   * @param  ref_id  Integer
   */
  public void setRef_id(Integer ref_id) {
    this.ref_id = ref_id;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for ref name.
   *
   * @param  ref_name  String
   */
  public void setRef_name(String ref_name) {
    this.ref_name = ref_name;
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
} // end class Address
