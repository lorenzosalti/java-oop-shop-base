package org.lessons.java.shop;

import org.lessons.java.shop.Prodotto;

public class Main {
  public static void main(String[] args) {

    Prodotto milk = new Prodotto("Parmalat", "Latte di vacca parzialmente scremato", 1.25f, 4);

    System.out.println("Il prezzo netto del prodotto è: " + milk.getNetPrice());

    System.out.println("Il prezzo totale del prodotto è: " + milk.getFullPrice());

    System.out.println("Il nome esteso del prodotto è: " + milk.getExtendedName());
  }
}
