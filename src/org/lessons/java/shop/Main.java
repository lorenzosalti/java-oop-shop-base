package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {

    Prodotto milk = new Prodotto("Parmalat",
        "Latte di vacca parzialmente scremato",
        new BigDecimal(1.25),
        new BigDecimal(4));

    Prodotto peanutButter = new Prodotto("Skippy",
        "Burro d'arachidi cremoso marchiato Skippy! Nella versione classica cremosa Skippy Peanut Butter è tra i più venduti negli USA e tu cosa aspetti a scoprirne il delizioso sapore? Provalo ora!",
        new BigDecimal(8.99),
        new BigDecimal(10));

    System.out.println("Il prezzo netto del prodotto è: " + milk.getNetPrice());

    System.out.println("Il prezzo totale del prodotto è: " + milk.getFullPrice());

    System.out.println("Il nome esteso del prodotto è: " + milk.getExtendedName());
  }
}
