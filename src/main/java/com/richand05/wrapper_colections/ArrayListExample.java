package com.richand05.wrapper_colections;

import java.util.ArrayList;

class Cat{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Cat> catArrayList = new ArrayList<>();
        catArrayList.add(new Cat("Miñu"));
        catArrayList.add(new Cat("Michi"));
        catArrayList.add(new Cat("Molli"));
        catArrayList.add(new Cat("Sancho"));
        catArrayList.add(new Cat("Michi"));

        int count = 0;

        for (Cat cat: catArrayList) {
            System.out.println("id: " + ++count + " " + (cat.toString()));
        }
    }
}
