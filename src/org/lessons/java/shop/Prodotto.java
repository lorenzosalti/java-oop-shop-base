package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {

  Random randomCode = new Random();
  int randomMax = 900000;
  int randomMin = 100000;

  private int code = randomCode.nextInt(randomMax) + randomMin;
  private String name;
  private String description;
  private BigDecimal netPrice;
  private BigDecimal iva;

  protected Prodotto(String name, String description, BigDecimal netPrice, BigDecimal iva) {
    this.name = name;
    this.description = description;
    this.netPrice = netPrice;
    this.iva = iva;
  }

  protected String getName() {
    return this.name;
  }

  protected String setName(String name) {
    if (name != null) {
      this.name = name;
    }
    return this.name;
  }

  protected String getDescription() {
    return this.description;
  }

  protected String setDescription(String description) {
    if (description != null) {
      this.description = description;
    }
    return this.description;
  }

  protected BigDecimal getNetPrice() {
    return this.netPrice.setScale(2, RoundingMode.DOWN);
  }

  protected BigDecimal getFullPrice() {
    BigDecimal fullPrice = this.netPrice.add(((this.netPrice.multiply(this.iva)).divide(new BigDecimal(100))));
    return fullPrice.setScale(2, RoundingMode.DOWN);
  }

  protected String getExtendedName() {
    String extendedName = this.code + "-" + this.name;
    return extendedName;
  }

}
