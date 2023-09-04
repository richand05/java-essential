package com.richand05.inheritance.excercise1;

import java.time.LocalDate;

public class Motorcycle extends Vehicle{
    private String typeOfHandlebars;

    public Motorcycle(String brand, LocalDate localDate, String typeOfHandlebars) {
        super(brand, localDate);
        this.typeOfHandlebars = typeOfHandlebars;
    }

    public String getTypeOfHandlebars() {
        return typeOfHandlebars;
    }

    public void setTypeOfHandlebars(String typeOfHandlebars) {
        this.typeOfHandlebars = typeOfHandlebars;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                ", brand='" + getBrand() + '\'' +
                ", year='" + getLocalDate().getYear() + '\'' +
                ", typeOfHandlebars='" + typeOfHandlebars + '\'' +
                '}';
    }
}
