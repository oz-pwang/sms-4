package org.wang.sms.command;

import org.springframework.util.StringUtils;
import org.wang.sms.model.Clazz;
import org.wang.sms.model.Subject;
import org.wang.sms.model.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ozintel06 on 16/6/27.
 */
public class UserCommand {
    public UserCommand() {
    }

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

    private Long subjectId;

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public String getClazzName() {
        return clazzName;
    }

    public void setClazzName(String clazzName) {
        this.clazzName = clazzName;
    }

    public Long getClazzId() {
        return clazzId;
    }

    public void setClazzId(Long clazzId) {
        this.clazzId = clazzId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassWordValidator() {
        return passWordValidator;
    }

    public void setPassWordValidator(String passWordValidator) {
        this.passWordValidator = passWordValidator;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIDCardNumber() {
        return IDCardNumber;
    }

    public void setIDCardNumber(String IDCardNumber) {
        this.IDCardNumber = IDCardNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDateString() {
        return birthDateString;
    }

    public void setBirthDateString(String birthDateString) {
        this.birthDateString = birthDateString;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private String subjectName;



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

        if (user.getClazz() != null) {
            this.setClazzId(user.getClazz().getId());
            this.setClazzName(user.getClazz().getName());
        }

        if (user.getSubject() != null) {
            this.setSubjectName(user.getSubject().getName());
            this.setSubjectId(user.getSubject().getId());
        }
    }



    public User toTeacher() {
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
    }




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

    }

    public User toTeacher(User t) {
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
    }


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
    }

}
