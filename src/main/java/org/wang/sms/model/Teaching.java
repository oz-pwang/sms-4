package org.wang.sms.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;


/**
 * Created by ozintel06 on 16/6/21.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  06/21/2016 15:08
 */
@Entity public class Teaching implements Serializable {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Column private Long clazzId;
  @Column private Long subjectId;
  @Column private Long teacherId;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for clazz id.
   *
   * @return  Long
   */
  public Long getClazzId() {
    return clazzId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for subject id.
   *
   * @return  Long
   */
  public Long getSubjectId() {
    return subjectId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for teacher id.
   *
   * @return  Long
   */
  public Long getTeacherId() {
    return teacherId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for clazz id.
   *
   * @param  clazzId  Long
   */
  public void setClazzId(Long clazzId) {
    this.clazzId = clazzId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for subject id.
   *
   * @param  subjectId  Long
   */
  public void setSubjectId(Long subjectId) {
    this.subjectId = subjectId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for teacher id.
   *
   * @param  teacherId  Long
   */
  public void setTeacherId(Long teacherId) {
    this.teacherId = teacherId;
  }
} // end class Teaching
