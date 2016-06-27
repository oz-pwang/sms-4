package org.wang.sms.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.wang.sms.command.LoginFormCommand;
import org.wang.sms.model.Role;
import org.wang.sms.model.User;
import org.wang.sms.service.UserService;
import org.wang.sms.until.Constants;

import static org.apache.coyote.http11.Constants.a;


/**
 * Created by Yang Wang on 8/15/15.
 *
 * @author   $author$
 * @version  $Revision$, $Date$
 */
@Controller public class LoginAction {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private UserService userService;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * login.
   *
   * @param   request    HttpServletRequest
   * @param   loginForm  LoginForm
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/login",
    method = RequestMethod.POST
  )
  public String login(HttpServletRequest request, LoginFormCommand loginForm) {
    User user = userService.findByNameAndPassWord(loginForm.getUsername(), loginForm.getPassword());
    if (user != null){
      for (Role role :user.getRoleSet()) {
        if ("ADMIN".equalsIgnoreCase(role.getName())){
          request.getSession().setAttribute(Constants.USER_NAME_KEY, user.getName());
          request.getSession().setAttribute(Constants.USER_ID_KEY, user.getId());

          return "redirect:/admin/menu?id=" + user.getId();
        }else if ("TEACHER".equalsIgnoreCase(role.getName())){
          request.getSession().setAttribute(Constants.USER_NAME_KEY, user.getName());
          request.getSession().setAttribute(Constants.USER_ID_KEY, user.getId());

          return "redirect:/teacher/info?id=" + user.getId();
        }else  if ("STUDENT".equalsIgnoreCase(role.getName())){
          request.getSession().setAttribute(Constants.USER_NAME_KEY, user.getName());
          request.getSession().setAttribute(Constants.USER_ID_KEY, user.getId());

          return "redirect:/student/info?id=" + user.getId();
        }else {
          return "redirect:/login?failed=true";
        }
      }
    }
    return "redirect:/login?failed=true";

//
//    if ("STUDENT".equals(loginForm.getRole())) {
//      User student = userService.findByNameAndPassWord(loginForm.getUsername(), loginForm.getPassword());
//
//      if (student != null) {
//        request.getSession().setAttribute(Constants.USER_NAME_KEY, student.getName());
//        request.getSession().setAttribute(Constants.USER_ID_KEY, student.getId());
//
//        return "redirect:/student/info?id=" + student.getId();
//      } else {
//        return "redirect:/login?failed=true";
//      }
//    }
//
//    if ("TEACHER".equals(loginForm.getRole())) {
//      User teacher = userService.findByNameAndPassWord(loginForm.getUsername(), loginForm.getPassword());
//
//      if (teacher != null) {
//        request.getSession().setAttribute(Constants.USER_NAME_KEY, teacher.getName());
//        request.getSession().setAttribute(Constants.USER_ID_KEY, teacher.getId());
//
//        return "redirect:/teacher/info?id=" + teacher.getId();
//      } else {
//        return "redirect:/login?failed=true";
//      }
//    }
//
//    if ("ADMIN".equals(loginForm.getRole())) {
//      User admin = userService.findByNameAndPassWord(loginForm.getUsername(), loginForm.getPassword());
//
//      if (admin != null) {
//        return "redirect:/admin/menu?id=" + admin.getId();
//      } else {
//        return "redirect:/login?failed=true";
//      }
//    } else {
//      return "redirect:/login?failed=true";
//    } // end if-else
  }   // end method login

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * login.
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/login",
    method = RequestMethod.GET
  )
  public String toLoginView() {
    return "login";
  }

} // end class LoginAction
