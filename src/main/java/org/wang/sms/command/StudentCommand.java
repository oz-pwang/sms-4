package org.wang.sms.command;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

import org.springframework.util.StringUtils;

import org.wang.sms.model.Clazz;
import org.wang.sms.model.User;


/**
 * Created by Yang Wang on 16/3/6.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:45
 */
public class StudentCommand extends BaseCommand {
  //~ Static fields/initializers ---------------------------------------------------------------------------------------

  /** TODO: DOCUMENT ME! */
  public static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

  //~ Instance fields --------------------------------------------------------------------------------------------------

  private Integer clazzId;

  private String clazzName;

  //~ Constructors -----------------------------------------------------------------------------------------------------

  /**
   * Creates a new StudentCommand object.
   */
  public StudentCommand() { }

  /**
   * Creates a new StudentCommand object.
   *
   * @param  student  Student
   */
  public StudentCommand(User student) {
    this.setId(student.getId());
    this.setName(student.getName());
    this.setAge(student.getAge());
    this.setGender(student.getGender());
    this.setIDCardNumber(student.getIDCardNumber());
    this.setPhoneNumber(student.getPhoneNumber());

    if (student.getBirthDate() != null) {
      this.setBirthDateString(sdf.format(student.getBirthDate()));
    }

    if (student.getClazz() != null) {
      this.setClazzId(student.getClazz().getId());
      this.setClazzName(student.getClazz().getName());
    }

  }

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for clazz id.
   *
   * @return  Integer
   */
  public Integer getClazzId() {
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
   * setter method for clazz id.
   *
   * @param  clazzId  Integer
   */
  public void setClazzId(Integer clazzId) {
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
   * toStudent.
   *
   * @return  Student
   */
  public User toStudent() {
    User student = new User();

    student.setId(this.getId());
    student.setName(this.getName());
    student.setIDCardNumber(this.getIDCardNumber());
    student.setPassWord(this.getPassWord());
    student.setAge(this.getAge());
    student.setPhoneNumber(this.getPhoneNumber());
    student.setGender(this.getGender());
    student.setBirthDateString(this.getBirthDateString());

    if (StringUtils.hasText(this.getBirthDateString())) {
      Date date = null;

      try {
        date = sdf.parse(this.getBirthDateString());
      } catch (ParseException e) {
        e.printStackTrace();
      }

      student.setBirthDate(date);
    }

    if (this.getClazzId() != null) {
      Clazz clazz = new Clazz();
      clazz.setId(this.getClazzId());
      student.setClazz(clazz);
    }

    return student;
  } // end method toStudent

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toStudent.
   *
   * @param   s  Student
   *
   * @return  Student
   */
  public User toStudent(User s) {
    s.setId(this.getId());
    s.setName(this.getName());
    s.setIDCardNumber(this.getIDCardNumber());
    s.setPassWord(this.getPassWord());
    s.setAge(this.getAge());
    s.setPhoneNumber(this.getPhoneNumber());
    s.setGender(this.getGender());
    s.setBirthDateString(this.getBirthDateString());

    if (StringUtils.hasText(this.getBirthDateString())) {
      Date date = null;

      try {
        date = sdf.parse(this.getBirthDateString());
      } catch (ParseException e) {
        e.printStackTrace();
      }

      s.setBirthDate(date);
    }

    if (this.getClazzId() != null) {
      Clazz clazz = new Clazz();
      clazz.setId(this.getClazzId());
      s.setClazz(clazz);
    }

    return s;

  } // end method toStudent
} // end class StudentCommand
