package org.wang.sms.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * Created by Yang Wang on 16/3/3.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:43
 */
@Entity public class Admin implements Serializable {
  //~ Static fields/initializers ---------------------------------------------------------------------------------------

  private static final String ROLE = "ADMIN";

  //~ Instance fields --------------------------------------------------------------------------------------------------

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id private Integer id;

  @Column(
    length   = 12,
    nullable = false
  )
  private String name;

  @Column(
    length   = 16,
    nullable = false
  )
  private String passWord;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for id.
   *
   * @return  Integer
   */
  public Integer getId() {
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
   * getter method for pass word.
   *
   * @return  String
   */
  public String getPassWord() {
    return passWord;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for id.
   *
   * @param  id  Integer
   */
  public void setId(Integer id) {
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

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for pass word.
   *
   * @param  passWord  String
   */
  public void setPassWord(String passWord) {
    this.passWord = passWord;
  }


} // end class Admin
