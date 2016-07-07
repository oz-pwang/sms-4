package org.wang.sms.model;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

  @Column private Integer age;

  /** TODO: DOCUMENT ME! */
  @Column private Date birthDate;

  /** TODO: DOCUMENT ME! */
  @Transient private String birthDateString;

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
   * setter method for age.
   *
   * @param  age  Integer
   */
  public void setAge(Integer age) {
    this.age = age;
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

} // end class User
