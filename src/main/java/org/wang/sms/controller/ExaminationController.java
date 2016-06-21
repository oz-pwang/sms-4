package org.wang.sms.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.wang.sms.command.ExaminationCommand;
import org.wang.sms.model.Clazz;
import org.wang.sms.model.Examination;
import org.wang.sms.model.Subject;
import org.wang.sms.model.User;
import org.wang.sms.service.ClazzService;
import org.wang.sms.service.ExaminationService;
import org.wang.sms.service.SubjectService;
import org.wang.sms.service.UserService;


/**
 * Created by Yang Wang on 16/2/25.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:44
 */
@Controller
@RequestMapping(value = "/examination")
public class ExaminationController {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private ClazzService clazzService;

  @Autowired private ExaminationService examinationService;

  @Autowired private SubjectService subjectService;

  @Autowired private UserService userService;

  //~ Methods ----------------------------------------------------------------------------------------------------------


  /**
   * add.
   *
   * @param   id     Integer
   * @param   model  Model
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/add",
    method = RequestMethod.GET
  )
  public String add(Integer id, Model model) {
    ExaminationCommand command = new ExaminationCommand();

    command.setSubjectList(subjectService.findAll());
    command.setClazzList(clazzService.findAll());

    model.addAttribute("id", id);
    model.addAttribute("command", command);

    return "/examination/add";
  }

  //~ ------------------------------------------------------------------------------------------------------------------


  /**
   * add.
   *
   * @param   request   HttpServletRequest
   * @param   response  HttpServletResponse
   * @param   id        Integer
   * @param   model     Model
   * @param   command   ExaminationCommand
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/add",
    method = RequestMethod.POST
  )
  public String add(HttpServletRequest request, HttpServletResponse response, Integer id, Model model,
    ExaminationCommand command) {
    User teacher       = userService.findOne(id);
    Examination   examination   = command.toExamination();
    List<Integer> subjectIdList = command.getSubjectIdList();
    List<Integer> clazzIdList   = command.getClazzIdList();
    Set<User>  studentSet    = new LinkedHashSet<User>();

    Set<Subject> subjectSet = new HashSet<Subject>();
    Set<Clazz>   clazzSet   = new HashSet<Clazz>();

    for (Integer clazzId : clazzIdList) {
      Clazz clazz = clazzService.findOne(clazzId);
      studentSet.addAll(clazz.getStudentSet());
      clazzSet.add(clazz);
    }

    for (Integer subjectId : subjectIdList) {
      Subject subject = subjectService.findOne(subjectId);
      subjectSet.add(subject);
    }

    examination.setCreateDate(new Date());
    examination.setSubjectSet(subjectSet);
    examination.setClazzSet(clazzSet);
    examination.setCreator(teacher);
    examination.setExaminationStatus("no");
    examination.setAchievementStatus("no");
    examination.setStudentSet(studentSet);

    examinationService.save(examination);

    List<Examination>        examinationList = examinationService.findAll();
    List<ExaminationCommand> commandList     = new ArrayList<ExaminationCommand>();

    for (Examination e : examinationList) {
      commandList.add(new ExaminationCommand(e));
    }

    model.addAttribute("examinationList", commandList);

    return "redirect:/teacher/examinationList?id=" + teacher.getId();
  } // end method add

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * query.
   *
   * @param   model  Model
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/list",
    method = RequestMethod.GET
  )
  public String query(Model model) {
    List<Examination>        examinationList = examinationService.findAll();
    List<ExaminationCommand> commandList     = new ArrayList<ExaminationCommand>();

    for (Examination examination : examinationList) {
      commandList.add(new ExaminationCommand(examination));
    }

    model.addAttribute("examinationList", commandList);

    return "examination/list";
  }


} // end class ExaminationController
