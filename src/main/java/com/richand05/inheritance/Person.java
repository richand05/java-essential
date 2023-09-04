package com.richand05.inheritance;

public class Person {
    private String name;
    private String lastname;

    Person(){}

    Person(String name, String lastname){
          this.name = name;
          this.lastname = lastname;
    }

    public void run(){
        System.out.println("I run");
    }

    public void walk(){
        System.out.println("I walk");
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }
}
