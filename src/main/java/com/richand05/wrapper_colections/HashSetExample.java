package com.richand05.wrapper_colections;

import java.util.HashSet;

class Heore implements Comparable<Heore>{
    private String name;

    public Heore(String name) {
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
        return "Heore{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Heore heore) {
        return this.name.compareTo(heore.getName());
    }
}
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Heore> heores = new HashSet<>();
        heores.add(new Heore("Batman"));
        heores.add(new Heore("Iroman"));
        heores.add(new Heore("Superman"));
        heores.add(new Heore("Spiderman"));
        heores.add(new Heore("Batman"));
        System.out.println(heores);

    }
}
