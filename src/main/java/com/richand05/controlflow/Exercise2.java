package com.richand05.controlflow;

import java.util.Scanner;

/*  Create a program that prompts the user to input a day of the week (as a number from 1 to 7). If it's a working day
    (Monday to Friday), display "Working day"; otherwise, display "Weekend."*/
public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number of week:");
        int numberOfWek = input.nextByte();

        if(numberOfWek <= 5){
            System.out.println("Working day");
        }else{
            System.out.println("Weekend");
        }
    }
}
