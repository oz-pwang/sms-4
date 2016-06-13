package org.wang.sms.command;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

import org.springframework.util.StringUtils;

import org.wang.sms.model.Clazz;
import org.wang.sms.model.Subject;
import org.wang.sms.model.Teacher;


/**
 * Created by Yang Wang on 16/3/6.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:45
 */
public class TeacherCommand extends BaseCommand {
  //~ Static fields/initializers ---------------------------------------------------------------------------------------

  private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

  //~ Instance fields --------------------------------------------------------------------------------------------------

  private Integer clazzId;

  private String clazzName;

  private Integer subjectId;

  private String subjectName;

  //~ Constructors -----------------------------------------------------------------------------------------------------

  /**
   * Creates a new TeacherCommand object.
   */
  public TeacherCommand() { }

  /**
   * Creates a new TeacherCommand object.
   *
   * @param  teacher  Teacher
   */
  public TeacherCommand(Teacher teacher) {
    this.setId(teacher.getId());
    this.setName(teacher.getName());
    this.setAge(teacher.getAge());
    this.setGender(teacher.getGender());
    this.setIDCardNumber(teacher.getIDCardNumber());
    this.setPhoneNumber(teacher.getPhoneNumber());

    if (teacher.getBirthDate() != null) {
      this.setBirthDateString(sdf.format(teacher.getBirthDate()));
    }

    if (teacher.getClazz() != null) {
      this.setClazzId(teacher.getClazz().getId());
      this.setClazzName(teacher.getClazz().getName());
    }

    if (teacher.getSubject() != null) {
      this.setSubjectName(teacher.getSubject().getName());
      this.setSubjectId(teacher.getSubject().getId());
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
   * getter method for subject id.
   *
   * @return  Integer
   */
  public Integer getSubjectId() {
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
   * setter method for subject id.
   *
   * @param  subjectId  Integer
   */
  public void setSubjectId(Integer subjectId) {
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
   * toTeacher.
   *
   * @return  Teacher
   */
  public Teacher toTeacher() {
    Teacher teacher = new Teacher();

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

    if (this.getSubjectId() != null) {
      Subject subject = new Subject();

      subject.setId(this.getSubjectId());
      teacher.setSubject(subject);
    }

    if (this.getClazzId() != null) {
      Clazz clazz = new Clazz();
      clazz.setId(this.getClazzId());
      teacher.setClazz(clazz);
    }

    return teacher;
  } // end method toTeacher

  //~ ------------------------------------------------------------------------------------------------------------------


  /**
   * toTeacher.
   *
   * @param   t  Teacher
   *
   * @return  Teacher
   */
  public Teacher toTeacher(Teacher t) {
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

    if (this.getSubjectId() != null) {
      Subject subject = new Subject();

      subject.setId(this.getSubjectId());
      t.setSubject(subject);
    }

    if (this.getClazzId() != null) {
      Clazz clazz = new Clazz();
      clazz.setId(this.getClazzId());
      t.setClazz(clazz);
    }

    return t;
  } // end method toTeacher
} // end class TeacherCommand
