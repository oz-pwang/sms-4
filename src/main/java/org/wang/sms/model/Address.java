package org.wang.sms.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * Created by ozintel06 on 16/7/24.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  07/27/2016 21:58
 */
@Entity public class Address implements Serializable {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Column(
    length   = 50,
    nullable = false
  )
  private String address;

  @Column(nullable = false)
  private boolean  isDefaultAddress;
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id private Long id;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for address.
   *
   * @return  String
   */
  public String getAddress() {
    return address;
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
   * getter method for isDefaultAddress.
   *
   * @return  boolean
   */
  public boolean isDefaultAddress() {
    return isDefaultAddress;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for address.
   *
   * @param  address  String
   */
  public void setAddress(String address) {
    this.address = address;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for isDefaultAddress.
   *
   * @param  isDefaultAddress  boolean
   */
  public void setIsDefaultAddress(boolean isDefaultAddress) {
    this.isDefaultAddress = isDefaultAddress;
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
} // end class Address
