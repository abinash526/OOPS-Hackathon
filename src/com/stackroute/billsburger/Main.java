package com.stackroute.billsburger;

public class Main {

    public static void main(String[] args) {

        // Menu ------------------------------------------------------------>
        // Bread Types ----------------------------------------------------->

        String maida = "maida";
        String sunflowerseed = "sunflowerseed";
        String wheat = "whole wheat";

        // Additional Types

        Additional cheese   = new Additional("Cheese", 15.0f);
        Additional lettuce  = new Additional("Lettuce", 12.25f);
        Additional tomato   = new Additional("Tomato", 25.0f);
        Additional onion    = new Additional("Onion", 7.5f);
        Additional chips    = new Additional("Chips", 30.5f);
        Additional drink    = new Additional("Drink", 60.0f);

        // Tests

        // Base hamburger max topping limit

        System.out.println("Ordering a Bill's burger...");
        BillsBurger maxBurger = new BillsBurger(79.00f, "chicken", maida);
        maxBurger.addTopping(tomato);
        maxBurger.addTopping(chips);
        maxBurger.addTopping(drink);
        maxBurger.displayPrice();

        // Base hamburger over topping limit

        System.out.println("Ordering a Bill's burger...");
        BillsBurger overBurger = new BillsBurger(69.00f, "veggie", wheat);
        overBurger.addTopping(tomato);
        overBurger.addTopping(drink);
        overBurger.addTopping(new Additional("Should not be able to add",42.0f));
        overBurger.displayPrice();


        // Healthy burger

        System.out.println("Ordering a Healthy burger...");
        HealthyBurger healthyBurger = new HealthyBurger(89.00f,"chicken");
        healthyBurger.addTopping(lettuce);
        healthyBurger.addTopping(tomato);
        healthyBurger.addTopping(onion);
        healthyBurger.addTopping(drink);
        healthyBurger.addTopping(new Additional("Should not be able to add",42.0f));
        healthyBurger.displayPrice();

        // Deluxe burger

        System.out.println("Ordering a Deluxe burger...");
        DeluxeBurger deluxeBurger = new DeluxeBurger(99.00f,"chicken", sunflowerseed);
        deluxeBurger.addTopping(new Additional("Should not be able to add",42.0f));
        deluxeBurger.displayPrice();
    }

}
