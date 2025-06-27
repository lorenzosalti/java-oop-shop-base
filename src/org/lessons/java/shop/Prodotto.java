package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {

  Random randomCode = new Random();
  int randomMax = 900000;
  int randomMin = 100000;

  // ATTRIBUTES
  private int code = randomCode.nextInt(randomMax) + randomMin;
  private String name;
  private String description;
  private BigDecimal netPrice;
  private BigDecimal iva;

  // CONSTRUCTOR
  protected Prodotto(String name, String description, BigDecimal netPrice, BigDecimal iva) {
    this.name = name;
    this.description = description;
    this.netPrice = netPrice.setScale(2, RoundingMode.DOWN);
    this.iva = iva;
  }

  // METHODS
  // code
  protected int getCode() {
    return this.code;
  }

  // name
  protected String getName() {
    return this.name;
  }

  protected void setName(String name) {
    if (name != null) {
      this.name = name;
    }
  }

  protected String getExtendedName() {
    String extendedName = this.code + "-" + this.name;
    return extendedName;
  }

  // description
  protected String getDescription() {
    return this.description;
  }

  protected void setDescription(String description) {
    if (description != null) {
      this.description = description;
    }
  }

  // price
  protected BigDecimal getNetPrice() {
    return this.netPrice;
  }

  protected void setNetPrice(BigDecimal netPrice) {
    if (netPrice != null) {
      this.netPrice = netPrice.setScale(2, RoundingMode.DOWN);
    }
  }

  protected BigDecimal getFullPrice() {
    BigDecimal fullPrice = this.netPrice.add(((this.netPrice.multiply(this.iva)).divide(new BigDecimal(100))));
    return fullPrice.setScale(2, RoundingMode.DOWN);
  }

  // iva
  protected BigDecimal getIva() {
    return this.iva;
  }

  protected void setIva(BigDecimal iva) {
    if (iva != null) {
      this.iva = iva;
    }
  }

}
