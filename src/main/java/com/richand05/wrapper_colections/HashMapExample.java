package com.richand05.wrapper_colections;

import java.util.HashMap;
import java.util.Map;

class Person{
    private String name;
    private String lastname;

    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

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
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Person> personMap = new HashMap<>();
        personMap.put("72841548", new Person("Richard", "Ramos Benites"));
        personMap.put("72841549", new Person("Fátima", "Ramos Benites"));
        personMap.put("96857412", new Person("Manuel", "Ramos De la Cruz"));
        personMap.put("98745625", new Person("Rafek", "Quiñonez Alaraz"));
        System.out.println(personMap);


    }

}
