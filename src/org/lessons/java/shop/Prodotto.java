package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {

  Random randomCode = new Random();
  int randomMax = 900000;
  int randomMin = 100000;

  public int code = randomCode.nextInt(randomMax) + randomMin;
  public String name;
  public String description;
  public BigDecimal netPrice;
  public BigDecimal iva;

  public Prodotto(String name, String description, BigDecimal netPrice, BigDecimal iva) {
    this.name = name;
    this.description = description;
    this.netPrice = netPrice;
    this.iva = iva;
  }

  public BigDecimal getNetPrice() {
    return this.netPrice.setScale(2, RoundingMode.DOWN);
  }

  public BigDecimal getFullPrice() {
    BigDecimal fullPrice = this.netPrice.add(((this.netPrice.multiply(this.iva)).divide(new BigDecimal(100))));
    return fullPrice.setScale(2, RoundingMode.DOWN);
  }

  public String getExtendedName() {
    String extendedName = this.code + "-" + this.name;
    return extendedName;
  }

}
