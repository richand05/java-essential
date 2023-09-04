package com.richand05.wrapper_colections;


import java.util.TreeMap;

class Car {
    private String brand;
    private String type;

    public Car(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Car> carTreeMap= new TreeMap<>();
        carTreeMap.put("C1", new Car("Gelly GX3", "SUV"));
        carTreeMap.put("C5", new Car("Toyota Hillux", "PickUp"));
        carTreeMap.put("C2", new Car("MiniCooper", "Cooper"));
        carTreeMap.put("C4", new Car("Geely Okavango", "Family"));

        System.out.println(carTreeMap);
    }


}
