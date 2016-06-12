package org.wang.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.wang.sms.model.User;
import org.wang.sms.repository.UserDao;
import org.wang.sms.service.UserService;

import javax.annotation.Resource;


/**
 * Created by ozintel06 on 16/5/12.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  05/12/2016 18:20
 */

@Controller public class UserController {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  // Private fields

  @Resource
  UserService userService;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * GET /create --> Create a new user and save it in the database.
   *
   * @param   email  String
   * @param   name   String
   *
   * @return  gET /create --> Create a new user and save it in the database.
   */
  @RequestMapping("/create")
  @ResponseBody public String create(String email, String name) {
    String userId = "";

    try {
      User user = new User(email, name);
      userService.save(user);
      userId = String.valueOf(user.getId());
    } catch (Exception ex) {
      return "Error creating the user: " + ex.toString();
    }

    return "User succesfully created with id = " + userId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * GET /delete --> Delete the user having the passed id.
   *
   * @param   id  long
   *
   * @return  gET /delete --> Delete the user having the passed id.
   */
  @RequestMapping("/delete")
  @ResponseBody public String delete(long id) {
    try {
      User user = new User(id);
      userService.delete(user);
    } catch (Exception ex) {
      return "Error deleting the user:" + ex.toString();
    }

    return "User succesfully deleted!";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * GET /get-by-email --> Return the id for the user having the passed email.
   *
   * @param   email  String
   *
   * @return  gET /get-by-email --> Return the id for the user having the passed email.
   */
  @RequestMapping("/get-by-email")
  @ResponseBody public String getByEmail(String email) {
    String userId = "";

    try {
      User user = userService.findByEmail(email);
      userId = String.valueOf(user.getId());
    } catch (Exception ex) {
      return "User not found";
    }

    return "The user id is: " + userId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * GET /update --> Update the email and the name for the user in the database having the passed id.
   *
   * @param   id     long
   * @param   email  String
   *
   * @return  gET /update --> Update the email and the name for the user in the database having the passed id.
   *
   * @param   name   String
   */
  @RequestMapping("/update")
  @ResponseBody public String updateUser(long id, String email, String name) {
    try {
      User user = userService.findOne(id);
      user.setEmail(email);
      user.setName(name);
      userService.save(user);
    } catch (Exception ex) {
      return "Error updating the user: " + ex.toString();
    }

    return "User succesfully updated!";
  }

} // end class UserController
