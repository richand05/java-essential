package com.richand05.wrapper_colections;

import java.util.TreeSet;

class Dog implements Comparable<Dog>{

    private String name;

    public Dog(String name) {
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
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo    (Dog o) {
        char secondLetter1 = o.getName().charAt(1);
        char secondLetter2 = this.name.charAt(1);

        if (secondLetter2 != secondLetter1) {
            return Character.compare(secondLetter2, secondLetter1);
        } else {
            return this.name.compareTo(o.getName());
        }
    }


  /*  @Override
    public int compareTo(Dog dog) {
        return this.name.compareTo(dog.getName());
    }*/
}

public class TreeSetExample {
   /* public static void main(String[] args) {
        TreeSet<Dog> dogSet = new TreeSet<>();
        dogSet.add(new Dog("Zhabelita"));
        dogSet.add(new Dog("Ana"));
        dogSet.add(new Dog("Chabelita"));
        dogSet.add(new Dog("Chabelita"));
        dogSet.add(new Dog("Zhabelita"));


        int count = 0;

        for (Dog dog:dogSet) {
            System.out.println("id: " + ++count + " " + dog.toString() + " hash: " + dog.hashCode());
        }
    }*/

    public static void main(String[] args) {
        TreeSet<Dog> dogSet = new TreeSet<>();
        dogSet.add(new Dog("Zzabelita"));
        dogSet.add(new Dog("Ana"));
        dogSet.add(new Dog("Abej"));
        dogSet.add(new Dog("Chabelita"));
        dogSet.add(new Dog("Chabelita"));
        dogSet.add(new Dog("Zhabelita"));

        int count = 0;

        for (Dog dog:dogSet) {
            System.out.println("id: " + ++count + " " + dog.toString() + " hash: " + dog.hashCode());
        }
    }
}
