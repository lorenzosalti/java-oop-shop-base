package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

  public int code;
  public String name;
  public String description;
  public float netPrice;
  public int iva;

  Random randomCode = new Random();
  int randomMax = 900000;
  int randomMin = 100000;

  public Prodotto(String name, String description, float netPrice, int iva) {
    this.name = name;
    this.description = description;
    this.netPrice = netPrice;
    this.iva = iva;
    this.code = randomCode.nextInt(randomMax) + randomMin;
  }

  public float getNetPrice() {
    return this.netPrice;
  }

  public float getFullPrice() {
    float fullPrice = this.netPrice + (this.netPrice * this.iva / 100);
    return fullPrice;
  }

}
