package com.richand05.inheritance;

public class Child extends Person{

    private String rol;

    Child(String name,String lastname){
        super(name, lastname);
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + getName() + '\'' +
                "lastname='" + getLastname() + '\'' +
                "rol='" + rol + '\'' +
                '}';
    }
}
