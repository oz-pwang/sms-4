package org.wang.sms.command;

import org.wang.sms.model.Clazz;


/**
 * Created by Yang Wang on 16/3/6.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/13/2016 14:45
 */
public class ClazzCommand {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  private String  headTeacher;
  private Integer id;
  private String  name;
  private String  size;

  //~ Constructors -----------------------------------------------------------------------------------------------------

  /**
   * Creates a new ClazzCommand object.
   */
  public ClazzCommand() { }

  /**
   * Creates a new ClazzCommand object.
   *
   * @param  clazz  Clazz
   */
  public ClazzCommand(Clazz clazz) {
    this.setId(clazz.getId());
    this.setName(clazz.getName());
    this.setSize(String.valueOf(clazz.getStudentSet().size()));

    if (clazz.getHeadTeacher() != null) {
      this.setHeadTeacher(clazz.getHeadTeacher().getName());
    }
  }

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for head teacher.
   *
   * @return  String
   */
  public String getHeadTeacher() {
    return headTeacher;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

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
   * getter method for size.
   *
   * @return  String
   */
  public String getSize() {
    return size;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for head teacher.
   *
   * @param  headTeacher  String
   */
  public void setHeadTeacher(String headTeacher) {
    this.headTeacher = headTeacher;
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
   * setter method for size.
   *
   * @param  size  String
   */
  public void setSize(String size) {
    this.size = size;
  }
} // end class ClazzCommand
