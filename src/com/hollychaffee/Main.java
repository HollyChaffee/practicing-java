package com.hollychaffee;

public class Main {
    public static void main(String[] args) {
        // Loops
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("hello" + i);
        }
        System.out.println("reverse for loop");
        for (int i = 10; i >= 0; i--) {
            System.out.println("hello" + i);
        }
        // Loops and Arrays
        String[] names = {
                "Sarah",
                "Phillip",
                "Joanna",
                "Bella"
        };
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // if statements
        int age = 0;
        boolean isAdult = age >= 18;
        if (isAdult) {
            System.out.println("is adult");
        } else if (age == 0) {
                System.out.println("baby");
        } else if (age == 1) {
            System.out.println("toddler");
        } else if (age == 2) {
            System.out.println("toddler");
        } else if (age ==3) {
            System.out.println("toddler");
        } else {
            System.out.println("is not an adult");

        }
        System.out.println("this code is outside if statement, so it will run");

        double yield = calculatePropertyYield(1_300, 250_000);
        System.out.println(yield);
    }
    private static double calculatePropertyYield(
            double rent, double propertyPrice)
    {
        double yearlyRent = rent * 12;
        double yield = (yearlyRent / propertyPrice) * 100;
        return yield;
    }

    }








