package org.wang.sms.model;

import java.io.Serializable;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


/**
 * Created by ozintel06 on 16/7/24.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  07/27/2016 21:48
 */
@Entity public class Commodity implements Serializable {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @JoinColumn(name = "brandId")
  @ManyToOne private Brand brand;

  @JoinColumn(name = "categoryId")
  @ManyToOne private Category category;

  @Column(nullable = false)
  private Date createDate;

  @JoinColumn(name = "effectId")
  @ManyToOne private Effect effect;
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id private Long          id;

  @JoinTable(
    name               = "Merchant_commodity",
    joinColumns        = {@JoinColumn(name = "commodityId")},
    inverseJoinColumns = {@JoinColumn(name = "merchantId")}
  )
  @ManyToMany private Set<Merchant> merchantSet;

  @Column(
    length   = 12,
    nullable = false
  )
  private String name;

  @Column(nullable = false)
  private Integer price;

  @Column private Boolean isPutaway;

  @Column private Date putawayTime;

  @Column private Integer sales;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for brand.
   *
   * @return  Brand
   */
  public Brand getBrand() {
    return brand;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for category.
   *
   * @return  Category
   */
  public Category getCategory() {
    return category;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for create date.
   *
   * @return  Date
   */
  public Date getCreateDate() {
    return createDate;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for effect.
   *
   * @return  Effect
   */
  public Effect getEffect() {
    return effect;
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
   * getter method for merchant set.
   *
   * @return  Set
   */
  public Set<Merchant> getMerchantSet() {
    return merchantSet;
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
   * getter method for price.
   *
   * @return  Integer
   */
  public Integer getPrice() {
    return price;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for isPutaway.
   *
   * @return  Boolean
   */
  public Boolean getIsPutaway() {
    return isPutaway;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for putaway time.
   *
   * @return  Date
   */
  public Date getPutawayTime() {
    return putawayTime;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for sales.
   *
   * @return  Integer
   */
  public Integer getSales() {
    return sales;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for brand.
   *
   * @param  brand  Brand
   */
  public void setBrand(Brand brand) {
    this.brand = brand;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for category.
   *
   * @param  category  Category
   */
  public void setCategory(Category category) {
    this.category = category;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for create date.
   *
   * @param  createDate  Date
   */
  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for effect.
   *
   * @param  effect  Effect
   */
  public void setEffect(Effect effect) {
    this.effect = effect;
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
   * setter method for merchant set.
   *
   * @param  merchantSet  Set
   */
  public void setMerchantSet(Set<Merchant> merchantSet) {
    this.merchantSet = merchantSet;
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
   * setter method for price.
   *
   * @param  price  Integer
   */
  public void setPrice(Integer price) {
    this.price = price;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for putaway.
   *
   * @param  isPutaway  Boolean
   */
  public void setIsPutaway(Boolean isPutaway) {
    this.isPutaway = isPutaway;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for putaway time.
   *
   * @param  putawayTime  Date
   */
  public void setPutawayTime(Date putawayTime) {
    this.putawayTime = putawayTime;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for sales.
   *
   * @param  sales  Integer
   */
  public void setSales(Integer sales) {
    this.sales = sales;
  }
} // end class Commodity