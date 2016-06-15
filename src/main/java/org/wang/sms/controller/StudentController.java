package org.wang.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.wang.sms.command.StudentCommand;
import org.wang.sms.command.StudentExaminationCommand;
import org.wang.sms.model.Student;
import org.wang.sms.service.StudentService;
import org.wang.sms.until.validator.UserValidator;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Yang Wang on 16/2/15.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:44
 */
@Controller
@RequestMapping(value = "/student")
public class StudentController {
  //~ Instance fields --------------------------------------------------------------------------------------------------
//
//  @Autowired
//  private AchievementService achievementService;
//
//  @Autowired
//  private ClazzService clazzService;
//
//  @Autowired
//  private ExaminationService examinationService;
  @Autowired
  private StudentService     studentService;

  private UserValidator validator = new UserValidator();

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * addStudent.
   *
   * @param   model  Model
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/add",
    method = RequestMethod.GET
  )
  public String addStudent(Model model) {
//    List<Clazz> clazzList = clazzService.findAll();
//
//    model.addAttribute("command", new StudentCommand());
//    model.addAttribute("clazzList", clazzList);

    return "student/add";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * addStudent.
   *
   * @param   command  StudentCommand
   * @param   result   BindingResult
   * @param   model    Model
   *
   * @return  String
   *
   * @throws  Exception  exception
   */
  @RequestMapping(
    value  = "/add",
    method = RequestMethod.POST
  )
  public String addStudent(@ModelAttribute("command") StudentCommand command, BindingResult result, Model model)
    throws Exception {
    validator.validate(command, result);

    if (!result.hasErrors()) {
      Student student = command.toStudent();
      Integer id      = studentService.save(student);

      return "redirect:/student/list?id=" + command.getClazzId();
    } else {
      return "redirect:/student/add";
    }
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * editStudent.
   *
   * @param   id     Integer
   * @param   model  Model
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/edit",
    method = RequestMethod.GET
  )
  public String editStudent(Integer id, Model model) {
    Student student = studentService.findOne(id);
    model.addAttribute("command", new StudentCommand(student));

    return "student/edit";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * editStudent.
   *
   * @param   command  StudentCommand
   * @param   result   BindingResult
   * @param   model    Model
   *
   * @return  String
   *
   * @throws  Exception  exception
   */
  @RequestMapping(
    value  = "/edit",
    method = RequestMethod.POST
  )
  public String editStudent(@ModelAttribute("command") StudentCommand command, BindingResult result, Model model)
    throws Exception {
    validator.validate(command, result);

    if (!result.hasErrors()) {
      Student s = studentService.findOne(command.getId());

      Student student = command.toStudent(s);
//
//      Clazz clazz = clazzService.findOne(command.getClazzId());
//      student.setClazz(clazz);

      studentService.save(student);

      model.addAttribute("command", new StudentCommand(student));

      return "redirect:/student/info?id=" + student.getId();
    }

    return "student/edit";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * list.
   *
   * @param   id     Integer
   * @param   model  Model
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/list",
    method = RequestMethod.GET
  )
  public String list(Integer id, Model model) {
    if (id != null) {
      List<Student> studentList = studentService.findStudentByClazzId(id);

      List<StudentCommand> studentCommandList = new ArrayList<StudentCommand>();

      for (Student student : studentList) {
        studentCommandList.add(new StudentCommand(student));
      }

      model.addAttribute("users", studentCommandList);

      return "student/list";
    }

    List<Student>        studentList        = studentService.findAll();
    List<StudentCommand> studentCommandList = new ArrayList<StudentCommand>();

    for (Student student : studentList) {
      studentCommandList.add(new StudentCommand(student));
    }

    model.addAttribute("users", studentCommandList);

    return "student/list";
  } // end method list

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toStudentInfoView.
   *
   * @param   id     Integer
   * @param   model  Model
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/info",
    method = RequestMethod.GET
  )
  public String toStudentInfoView(Integer id, Model model) {
    Student student = studentService.findOne(id);
    model.addAttribute("user", new StudentCommand(student));

    return "student/info";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * viewResults.
   *
   * @param   id     Integer
   * @param   model  Model
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/viewResults",
    method = RequestMethod.GET
  )
  public String viewResults(Integer id, Model model) {
    List<StudentExaminationCommand> commandList = new ArrayList<StudentExaminationCommand>();

    Student student = studentService.findOne(id);
    Integer clazzId = student.getClazz().getId();
//
//    List<Examination> examinationList = examinationService.findExaminationByClazzId(clazzId);
//
//    for (Examination examination : examinationList) {
//      StudentExaminationCommand command = new StudentExaminationCommand(examination);
//      commandList.add(command);
//    }
//
//    model.addAttribute("examinationList", commandList);

    return "student/viewResults";
  }

} // end class StudentController
