package com.richand05.inheritance.excercise1;

import java.time.LocalDate;

public class Vehicle {

    private String brand;
    private LocalDate localDate;

    public Vehicle(String brand, LocalDate localDate) {
        this.brand = brand;
        this.localDate = localDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
