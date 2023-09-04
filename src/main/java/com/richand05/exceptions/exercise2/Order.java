package com.richand.exceptions.exercise2;

import java.time.LocalDate;

public class Order {
    private double total;

    public Order(double total, String user) throws OrderInvalidException{
        if(total < 50.0){
            throw new OrderInvalidException("El valor mínimo del pedido es de $50.0", user, LocalDate.now());
        }

        this.total = total;
    }
}
