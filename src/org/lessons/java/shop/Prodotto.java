package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

  Random randomCode = new Random();
  int randomMax = 900000;
  int randomMin = 100000;

  public int code = randomCode.nextInt(randomMax) + randomMin;
  public String name;
  public String description;
  public float netPrice;
  public int iva;

  public Prodotto(String name, String description, float netPrice, int iva) {
    this.name = name;
    this.description = description;
    this.netPrice = netPrice;
    this.iva = iva;
  }

  public float getNetPrice() {
    return this.netPrice;
  }

  public float getFullPrice() {
    float fullPrice = this.netPrice + (this.netPrice * this.iva / 100);
    return fullPrice;
  }

  public String getExtendedName() {
    String extendedName = this.code + "-" + this.name;
    return extendedName;
  }

}
