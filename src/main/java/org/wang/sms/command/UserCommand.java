package org.wang.sms.command;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

import org.springframework.util.StringUtils;

import org.wang.sms.model.User;


/**
 * Created by ozintel06 on 16/6/27.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/27/2016 14:36
 */
public class UserCommand {
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
  protected Long id;

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

  private Long clazzId;

  private String clazzName;

  private Long gradeId;

  private Long subjectId;

  private String subjectName;

  //~ Constructors -----------------------------------------------------------------------------------------------------

  /**
   * Creates a new UserCommand object.
   */
  public UserCommand() { }


  /**
   * Creates a new UserCommand object.
   *
   * @param  user  User
   */
  public UserCommand(User user) {
    this.setId(user.getId());
    this.setName(user.getName());
    this.setAge(user.getAge());
    this.setGender(user.getGender());
    this.setIDCardNumber(user.getIDCardNumber());
    this.setPhoneNumber(user.getPhoneNumber());

    if (user.getBirthDate() != null) {
      this.setBirthDateString(sdf.format(user.getBirthDate()));
    }
  }

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
   * getter method for clazz id.
   *
   * @return  Long
   */
  public Long getClazzId() {
    return clazzId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for clazz name.
   *
   * @return  String
   */
  public String getClazzName() {
    return clazzName;
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
   * getter method for grade id.
   *
   * @return  Long
   */
  public Long getGradeId() {
    return gradeId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for id.
   *
   * @return  Long
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
   * getter method for subject id.
   *
   * @return  Long
   */
  public Long getSubjectId() {
    return subjectId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for subject name.
   *
   * @return  String
   */
  public String getSubjectName() {
    return subjectName;
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
   * setter method for clazz id.
   *
   * @param  clazzId  Long
   */
  public void setClazzId(Long clazzId) {
    this.clazzId = clazzId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for clazz name.
   *
   * @param  clazzName  String
   */
  public void setClazzName(String clazzName) {
    this.clazzName = clazzName;
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
   * setter method for grade id.
   *
   * @param  gradeId  Long
   */
  public void setGradeId(Long gradeId) {
    this.gradeId = gradeId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for id.
   *
   * @param  id  Long
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

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for subject id.
   *
   * @param  subjectId  Long
   */
  public void setSubjectId(Long subjectId) {
    this.subjectId = subjectId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for subject name.
   *
   * @param  subjectName  String
   */
  public void setSubjectName(String subjectName) {
    this.subjectName = subjectName;
  }

  //~ ------------------------------------------------------------------------------------------------------------------
  /**
   * toUser.
   *
   * @return  User
   */
  public User toUser() {
    User teacher = new User();

    teacher.setId(this.getId());
    teacher.setName(this.getName());
    teacher.setIDCardNumber(this.getIDCardNumber());
    teacher.setPassWord(this.getPassWord());
    teacher.setAge(this.getAge());
    teacher.setPhoneNumber(this.getPhoneNumber());
    teacher.setGender(this.getGender());
    teacher.setBirthDateString(this.getBirthDateString());

    if (StringUtils.hasText(this.getBirthDateString())) {
      Date date = null;

      try {
        date = sdf.parse(this.getBirthDateString());
      } catch (ParseException e) {
        e.printStackTrace();
      }

      teacher.setBirthDate(date);
    }
    return teacher;
  } // end method toUser

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toUser.
   *
   * @param   t  User
   *
   * @return  User
   */
  public User toUser(User t) {
    t.setId(this.getId());
    t.setName(this.getName());
    t.setIDCardNumber(this.getIDCardNumber());
    t.setAge(this.getAge());
    t.setPhoneNumber(this.getPhoneNumber());
    t.setGender(this.getGender());
    t.setBirthDateString(this.getBirthDateString());

    if (StringUtils.hasText(this.getBirthDateString())) {
      Date date = null;

      try {
        date = sdf.parse(this.getBirthDateString());
      } catch (ParseException e) {
        e.printStackTrace();
      }

      t.setBirthDate(date);
    }
    return t;
  } // end method toUser

} // end class UserCommand
