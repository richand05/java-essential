package com.richand05.inheritance.excercise1;

import java.time.LocalDate;

public class Car extends Vehicle{
    private int kgCarTrunk;

    public Car(String brand, LocalDate localDate, int kgCarTrunk) {
        super(brand, localDate);
        this.kgCarTrunk = kgCarTrunk;
    }

    public int getKgCarTrunk() {
        return kgCarTrunk;
    }

    public void setNumberTire(int numberTire) {
        this.kgCarTrunk = numberTire;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + getBrand() +
                ", year=" + getLocalDate().getYear() +
                ", numberTire=" + kgCarTrunk +
                '}';
    }
}
