package com.richand05.wrapper_colections;

import java.util.LinkedList;

class Country{
    private String name;

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Country> countries = new LinkedList<>();

        Country removeCountry =  new Country("Bolivia");

        countries.add(new Country("Peru"));
        countries.add(new Country("Venezuela"));
        countries.add(new Country("Ecuador"));
        countries.add(new Country("Argentina"));

        System.out.println(countries);

        countries.add(2,removeCountry);

        System.out.println(countries);

        countries.add(1, new Country("Brasil"));
        countries.add(3, new Country("Brasil"));

        System.out.println(countries.offer(new Country("Canadá")));

        System.out.println(countries);

        countries.remove(removeCountry);

        System.out.println(countries);




    }
}
