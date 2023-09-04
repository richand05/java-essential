package com.richand.exceptions.exercise2;

import java.time.LocalDate;

public class OrderInvalidException extends Exception{
    private String user;
    private LocalDate date;

    public OrderInvalidException(String message, String user, LocalDate date){
        super(message);
        this.user = user;
        this.date = date;
    }

    public String getUser() {
        return user;
    }

    public LocalDate getDate() {
        return date;
    }
}
