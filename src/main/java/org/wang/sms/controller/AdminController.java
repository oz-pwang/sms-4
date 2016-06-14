package org.wang.sms.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import org.wang.sms.model.Admin;
import org.wang.sms.service.AdminService;


/**
 * Created by Yang Wang on 16/3/6.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:44
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminController {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private AdminService adminService;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * menu.
   *
   * @param   request   HttpServletRequest
   * @param   response  HttpServletResponse
   * @param   id        Integer
   * @param   model     Model
   *
   * @return  String
   */
  @RequestMapping(value = "/menu")
  public String menu(HttpServletRequest request, HttpServletResponse response, Integer id, Model model) {
    Admin admin = adminService.findOne(id);
    model.addAttribute("user", admin);

    return "/admin/menu";
  }

} // end class AdminController
