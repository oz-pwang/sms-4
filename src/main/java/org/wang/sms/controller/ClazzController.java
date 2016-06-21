package org.wang.sms.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.wang.sms.command.ClazzCommand;
import org.wang.sms.model.Clazz;
import org.wang.sms.model.User;
import org.wang.sms.service.ClazzService;
import org.wang.sms.service.UserService;


/**
 * Created by Yang Wang on 16/3/6.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:44
 */
@Controller
@RequestMapping(value = "/clazz")
public class ClazzController {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private ClazzService   clazzService;
  @Autowired private UserService userService;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * info.
   *
   * @param   request   HttpServletRequest
   * @param   response  HttpServletResponse
   * @param   id        Integer
   * @param   model     Model
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/info",
    method = RequestMethod.GET
  )
  public String info(HttpServletRequest request, HttpServletResponse response, Integer id, Model model) {
    Clazz         clazz       = clazzService.findOne(id);
    List<User> studentList = userService.findStudentByClazzId(id);
    model.addAttribute("clazz", new ClazzCommand(clazz));
    model.addAttribute("studentList", studentList);

    return "/clazz/info";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * list.
   *
   * @param   request   HttpServletRequest
   * @param   response  HttpServletResponse
   * @param   id        Integer
   * @param   model     Model
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/list",
    method = RequestMethod.GET
  )
  public String list(HttpServletRequest request, HttpServletResponse response, Integer id, Model model) {
    List<Clazz>        clazzList        = clazzService.findAll();
    List<ClazzCommand> clazzCommandList = new ArrayList<ClazzCommand>();

    for (Clazz clazz : clazzList) {
      clazzCommandList.add(new ClazzCommand(clazz));
    }

    model.addAttribute("clazzList", clazzCommandList);

    return "/clazz/list";
  }

} // end class ClazzController
