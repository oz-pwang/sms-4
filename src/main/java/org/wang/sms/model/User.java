package org.wang.sms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * Created by ozintel06 on 16/5/17.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  05/17/2016 17:15
 */
@Entity public class User {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Column private String email;
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id private Long       id;
  @Column private String name;

  //~ Constructors -----------------------------------------------------------------------------------------------------

  /**
   * Creates a new User object.
   *
   * @param  id  Long
   */
  public User(Long id) {
    this.id = id;
  }

  /**
   * Creates a new User object.
   *
   * @param  email  String
   * @param  name   String
   */
  public User(String email, String name) {
    this.name  = name;
    this.email = email;
  }

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for email.
   *
   * @return  String
   */
  public String getEmail() {
    return email;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for id.
   *
   * @return  Long
   */
  public Long getId() {
    return id;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for name.
   *
   * @return  String
   */
  public String getName() {
    return name;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for email.
   *
   * @param  email  String
   */
  public void setEmail(String email) {
    this.email = email;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for id.
   *
   * @param  id  Long
   */
  public void setId(Long id) {
    this.id = id;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for name.
   *
   * @param  name  String
   */
  public void setName(String name) {
    this.name = name;
  }

} // end class User
