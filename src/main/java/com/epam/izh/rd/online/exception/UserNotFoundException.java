package com.epam.izh.rd.online.exception;

public class UserNotFoundException extends Exception {

    public UserNotFoundException() {
        System.out.println("Пользователь с таким логином не найден");
    }

}
