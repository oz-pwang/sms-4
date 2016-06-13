package org.wang.sms.command;

import java.text.SimpleDateFormat;

import java.util.Date;


/**
 * Created by Yang Wang on 16/2/18.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:45
 */
public class BaseCommand {
  //~ Static fields/initializers ---------------------------------------------------------------------------------------

  /** TODO: DOCUMENT ME! */
  protected static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

  //~ Instance fields --------------------------------------------------------------------------------------------------

  /** TODO: DOCUMENT ME! */
  protected Integer age;

  /** TODO: DOCUMENT ME! */
  protected Date birthDate;

  /** TODO: DOCUMENT ME! */
  protected String birthDateString;

  /** TODO: DOCUMENT ME! */
  protected String gender = "male";

  /** TODO: DOCUMENT ME! */
  protected Integer id;

  /** TODO: DOCUMENT ME! */
  protected String IDCardNumber;

  /** TODO: DOCUMENT ME! */
  protected String name;

  /** TODO: DOCUMENT ME! */
  protected String passWord;

  /** TODO: DOCUMENT ME! */
  protected String passWordValidator;

  /** TODO: DOCUMENT ME! */
  protected String phoneNumber;

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
  public Integer getId() {
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
   * getter method for pass word validator.
   *
   * @return  String
   */
  public String getPassWordValidator() {
    return passWordValidator;
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
  public void setId(Integer id) {
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
   * setter method for pass word validator.
   *
   * @param  passWordValidator  String
   */
  public void setPassWordValidator(String passWordValidator) {
    this.passWordValidator = passWordValidator;
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

} // end class BaseCommand
