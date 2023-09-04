package com.richand05.controlflow;

import java.util.Scanner;

/*  Write a program that takes a number as input and determines if it's positive, negative, or zero. Additionally,
    if it's positive, check if it's even or odd.*/
public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        if(number > 0){
            System.out.println("Positive number");
            if(number % 2 == 0){
                System.out.println("Even number");
            }else{
                System.out.println("Odd number");
            }
        }else if(number == 0){
            System.out.println("Zero number");
        }else{
            System.out.println("Negative number");
        }
    }
}
