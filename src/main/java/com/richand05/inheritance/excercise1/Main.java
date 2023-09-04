package com.richand05.inheritance.excercise1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Geely", LocalDate.of(2024, 1, 1), 30);
        System.out.println(car.toString());

        System.out.println("--------------------------");

        Motorcycle motorcycle = new Motorcycle("Honda", LocalDate.of(2022, 2, 3), "leather");
        System.out.println(motorcycle.toString());
    }
}
