package org.lessons.java.shop;

import org.lessons.java.shop.Prodotto;

public class Main {
  public static void main(String[] args) {

    Prodotto milk = new Prodotto("Parmalat", "Latte di vacca parzialmente scremato", 1.25f, 4);

    System.out.println(milk.name);
    System.out.println(milk.description);
    // System.out.println(milk.netPrice);
    System.out.println(milk.iva);
    System.out.println(milk.code);

    System.out.println("Il prezzo netto del prodotto è: " + milk.getNetPrice());
  }
}
