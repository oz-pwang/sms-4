package org.wang.sms.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.wang.sms.command.TeacherCommand;
import org.wang.sms.command.TeacherExaminationCommand;
import org.wang.sms.model.Clazz;
import org.wang.sms.model.Examination;
import org.wang.sms.model.Subject;
import org.wang.sms.model.User;
import org.wang.sms.service.UserService;
import org.wang.sms.until.validator.UserValidator;


/**
 * Created by Yang Wang on 16/2/15.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:43
 */
@Controller
@RequestMapping(value = "/teacher")
public class TeacherController {
  //~ Instance fields --------------------------------------------------------------------------------------------------

//
// @Autowired
// private ClazzService clazzService;
//
// @Autowired
// private ExaminationService examinationService;
//
// @Autowired
// private SubjectService subjectService;

  @Autowired private UserService userService;


  private UserValidator validator = new UserValidator();

  //~ Methods ----------------------------------------------------------------------------------------------------------

// @RequestMapping(
// value = "/createExamination",
// method = RequestMethod.GET
// )
// public String createExamination(Model model,Integer id) {
// List<Subject> subjectList = subjectService.list();
// AddOrEditTeacherCommand command = new AddOrEditTeacherCommand();
// command.setSubjectList(subjectList);
// command.setId(id);
// model.addAttribute("command",command);
//
// return "examination/add";
// }


  /**
   * addTeacher.
   *
   * @param   model  Model
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/add",
    method = RequestMethod.GET
  )
  public String addTeacher(Model model) {
    List<Subject> subjectList = new ArrayList<Subject>();
// subjectService.findAll();
    List<Clazz>   clazzList   = new ArrayList<Clazz>();
// clazzService.findAll();
    model.addAttribute("subjectList", subjectList);
    model.addAttribute("clazzList", clazzList);
    model.addAttribute("command", new TeacherCommand());

    return "teacher/add";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * addTeacher.
   *
   * @param   command  TeacherCommand
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
  public String addTeacher(@ModelAttribute("command") TeacherCommand command, BindingResult result, Model model)
    throws Exception {
    validator.validate(command, result);

    if (!result.hasErrors()) {
      User    teacher = command.toTeacher();
      Integer id      = userService.save(teacher);

      return "redirect:/teacher/list?id=" + id;
    } else {
      return "redirect:teacher/add";
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
  public String editStudent(Long id, Model model) {
    User          teacher     = userService.findOne(id);
    List<Subject> subjectList = new ArrayList<Subject>();
// subjectService.findAll();
    List<Clazz>   clazzList   = new ArrayList<Clazz>();
// clazzService.findAll();
    model.addAttribute("subjectList", subjectList);
    model.addAttribute("clazzList", clazzList);
    model.addAttribute("command", new TeacherCommand(teacher));

    return "teacher/edit";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * editStudent.
   *
   * @param   command  TeacherCommand
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
  public String editStudent(@ModelAttribute("command") TeacherCommand command, BindingResult result, Model model)
    throws Exception {
    validator.validate(command, result);

    if (!result.hasErrors()) {
      User t = userService.findOne(command.getId());

      User teacher = command.toTeacher(t);

      Clazz   clazz   = new Clazz();
// clazzService.findOne(command.getClazzId());
      Subject subject = new Subject();
// subjectService.findOne(command.getSubjectId());
      teacher.setClazz(clazz);
      teacher.setSubject(subject);

      userService.save(teacher);

      return "redirect:/teacher/info?id=" + teacher.getId();
    } else {
      return "teacher/edit";
    }

  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * examinationList.
   *
   * @param   id     Integer
   * @param   model  Model
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/examinationList",
    method = RequestMethod.GET
  )
  public String examinationList(Long id, Model model) {
    List<Examination>               examinationList = new ArrayList<Examination>();
// examinationService.findAll();
    TeacherCommand                  teacherCommand  = new TeacherCommand(userService.findOne(id));
    List<TeacherExaminationCommand> commandList     = new ArrayList<TeacherExaminationCommand>();

    for (Examination examination : examinationList) {
      commandList.add(new TeacherExaminationCommand(examination));
    }

    model.addAttribute("user", teacherCommand);
    model.addAttribute("commandList", commandList);

    return "teacher/examinationList";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * list.
   *
   * @param   model  Model
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/list",
    method = RequestMethod.GET
  )
  public String list(Model model) {
    List<User>           teacherList        = userService.findAll();
    List<TeacherCommand> teacherCommandList = new ArrayList<TeacherCommand>();

    for (User teacher : teacherList) {
      teacherCommandList.add(new TeacherCommand(teacher));
    }

    model.addAttribute("users", teacherCommandList);

    return "teacher/list";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * queryAchievement.
   *
   * @param   id     Integer
   * @param   model  Model
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/queryAchievement",
    method = RequestMethod.GET
  )
  public String queryAchievement(Integer id, Model model) {
    Examination examination = new Examination();
// examinationService.findOne(id);
// Integer clazzId = examination.getClazz().getId();
// Clazz clazz = clazzService.find(clazzId);
// Set<Student> studentSet = clazz.getStudentSet();
// Set<Subject> subjectSet = examination.getSubjectSet();
//
// for (Subject subject : subjectSet){
// subjectService.find(examination.getId(),clazzId)
// }

    return "teacher/achievementList";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toStudentInfoView.
   *
   * @param   request  HttpServletRequest
   * @param   id       Integer
   * @param   model    Model
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/info",
    method = RequestMethod.GET
  )
  public String toStudentInfoView(HttpServletRequest request, Long id, Model model) {
    User teacher = userService.findOne(id);
    model.addAttribute("user", new TeacherCommand(teacher));

    return "teacher/info";
  }


} // end class TeacherController
