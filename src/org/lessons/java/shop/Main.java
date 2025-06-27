package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {

    Prodotto milk = new Prodotto("Parmalat",
        "Latte di vacca parzialmente scremato",
        new BigDecimal(1.25),
        new BigDecimal(4));

    Prodotto peanutButter = new Prodotto("Skippy",
        "Burro d'arachidi cremoso marchiato Skippy! Nella versione classica cremosa Skippy Peanut Butter è tra i più venduti negli USA e tu cosa aspetti a scoprirne il delizioso sapore? Provalo ora!");

    System.out.println("Il prezzo netto del latte è: " + milk.getNetPrice());

    System.out.println("Il prezzo totale del latte è: " + milk.getFullPrice());

    System.out.println("Il nome esteso del latte è: " + milk.getExtendedName());

    System.out.println("Il prezzo netto del burro di arachidi è: " + peanutButter.getNetPrice());

    System.out.println("Il prezzo totale del burro di arachidi è: " + peanutButter.getFullPrice());

    System.out.println("Il nome esteso del burro di arachidi è: " + peanutButter.getExtendedName());

    peanutButter.setNetPrice(new BigDecimal(8.99));
    peanutButter.setIva(new BigDecimal(10));

    System.out.println("Il prezzo netto del burro di arachidi è: " + peanutButter.getNetPrice());

    System.out.println("Il prezzo totale del burro di arachidi è: " + peanutButter.getFullPrice());
  }
}
