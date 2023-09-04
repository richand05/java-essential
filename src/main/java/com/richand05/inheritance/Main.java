package com.richand05.inheritance;

public class Main {
    public static void main(String[] args) {
        Child child = new Child("Raul", "Peña");
        child.setRol("play");
        System.out.println(child.toString());

        if(child instanceof  Person){
            System.out.println("This is a child");
        }
    }
}
