package com.richand.exceptions.exercise2;

public class Main {

    public static void main(String[] args) {
        try {
            Order order = new Order(45.0, "User123");
        } catch (OrderInvalidException e) {
            System.out.println("Error al crear pedido");
            System.out.println("User: " + e.getUser());
            System.out.println("Date: " + e.getDate());
            System.out.println("Message: " + e.getMessage());
        }


    }


}
