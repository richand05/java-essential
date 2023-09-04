package com.richand05.interfacesAbtract.exercise1;

import java.util.Objects;

public abstract class Animal {

    private String name;

    Animal(){}
    protected abstract void sound();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    
}
