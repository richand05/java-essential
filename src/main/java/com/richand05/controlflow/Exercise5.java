package com.richand05.controlflow;

import java.util.List;
import java.util.Scanner;

/*  Design a program that prompts the user to input a password. The password must be at least 8 characters long and
    include at least one uppercase letter, one lowercase letter, and one digit.
 */
public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password:");
        String password = input.next();

        boolean oneUpperCase = false;
        boolean oneLowerCase = false;
        boolean oneDigit = false;



        if(password.length() >= 8){
            char[] characterList = password.toCharArray();

            for(char character:characterList){
                if(Character.isUpperCase(character)){
                    oneUpperCase = true;
                }

                if(Character.isLowerCase(character)){
                    oneLowerCase = true;
                }

                if (Character.isDigit(character)) {
                    oneDigit = true;
                }

            }

        }

        if(oneUpperCase && oneLowerCase && oneDigit){
            System.out.println("Passord is valid");
        }else{
            System.out.println("Passord no valid");
        }

    }
}