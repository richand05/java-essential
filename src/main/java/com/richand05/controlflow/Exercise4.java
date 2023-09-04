package com.richand05.controlflow;

import java.util.Scanner;

/*  Develop a program that asks the user to input three student grades. The student passes if at least two out of the
    three grades are greater than or equal to 70.*/
public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 3 records:");
        int record1 =  input.nextInt();
        int record2 =  input.nextInt();
        int record3 =  input.nextInt();

        if (record1 >= 70 && (record2 >= 70 || record3 >=70) ||
            record2 >= 70 && (record1 >= 70 || record3 >=70) ||
            record3 >= 70 && (record1 >= 70 || record2 >= 70)) {
            System.out.println("Passes");
        }else{
            System.out.println("No Passes");
        }

    }
}
