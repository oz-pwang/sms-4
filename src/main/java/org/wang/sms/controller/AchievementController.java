package org.wang.sms.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.wang.sms.command.AchievementCommand;
import org.wang.sms.model.Achievement;
import org.wang.sms.model.Clazz;
import org.wang.sms.model.Examination;
import org.wang.sms.model.Subject;
import org.wang.sms.model.User;
import org.wang.sms.service.AchievementService;
import org.wang.sms.service.ClazzService;
import org.wang.sms.service.ExaminationService;
import org.wang.sms.service.SubjectService;
import org.wang.sms.service.UserService;


/**
 * Created by Yang Wang on 16/3/11.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:44
 */
@Controller
@RequestMapping(value = "/achievement")
public class AchievementController {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private AchievementService achievementService;

  @Autowired private ClazzService clazzService;

  @Autowired private ExaminationService examinationService;
  @Autowired private SubjectService     subjectService;
  @Autowired private UserService        userService;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * add.
   *
   * @param   command  AchievementCommand
   * @param   model    Model
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/add",
    method = RequestMethod.POST
  )
  public String add(AchievementCommand command, Model model) {
    Achievement achievement = new Achievement();

    achievement.setFraction(command.getFraction());
    achievement.setExamination(examinationService.findOne(command.getExaminationId()));
    achievement.setSubject(subjectService.findOne(command.getSubjectId()));
    achievement.setStudent(userService.findOne(command.getStudentId()));


    achievementService.save(achievement);

    String url = "redirect:/achievement/info?eid=" + command.getExaminationId() + "&tid=" + command.getTeacherId();

    return url;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * add.
   *
   * @param   request   HttpServletRequest
   * @param   response  HttpServletResponse
   * @param   model     Model
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/add",
    method = RequestMethod.GET
  )
  public String add(HttpServletRequest request, HttpServletResponse response, Model model) {
    Long examinationId = Long.valueOf(request.getParameter("eid"));
    Long teacherId     = Long.valueOf(request.getParameter("tid"));

    AchievementCommand command     = new AchievementCommand();
    Examination        examination = examinationService.findOne(examinationId);
    User               teacher     = userService.findOne(teacherId);
    Clazz              clazz       = teacher.getClazz();
    List<User>         studentList = userService.findStudentByClazzId(clazz.getId());

    Subject subject = teacher.getSubject();

    command.setStudentList(studentList);
    command.setSubject(subject);
    command.setExamination(examination);
    command.setTeacher(teacher);
    model.addAttribute("command", command);

    return "/achievement/add";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * info.
   *
   * @param   examinationId  Integer
   * @param   teacherId      Integer
   * @param   request        HttpServletRequest
   * @param   response       HttpServletResponse
   * @param   model          Model
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/info",
    method = RequestMethod.GET
  )
  public String info(@RequestParam(value = "eid") Integer examinationId,
    @RequestParam(value = "tid") Integer teacherId, HttpServletRequest request, HttpServletResponse response,
    Model model) {
    return "/achievement/add";
  }


} // end class AchievementController
