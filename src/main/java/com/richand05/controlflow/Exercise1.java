package com.richand05.controlflow;

import java.util.Scanner;

/*  Write a program that asks for a person's age. If the age is between 18 and 35 (inclusive), print
    "Welcome to the party"; otherwise, print "Sorry, you cannot enter." */
public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How old are your?");
        int age = input.nextInt();

        String result = (age >= 18 && age <= 35) ? "Welcome to the party" : "Sorry, you cannot enter";
        System.out.println(result);
    }
}
