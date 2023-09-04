package com.richand05.interfacesAbtract.exercise2;

public class Person implements Work{
    private String name;
    private String lastname;

    Person(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public void working() {
        System.out.println("clock in at work");
        System.out.println("daily meeting");
    }
}
