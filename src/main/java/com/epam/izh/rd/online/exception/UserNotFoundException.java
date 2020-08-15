package com.epam.izh.rd.online.exception;

public class UserNotFoundException extends Exception {

    UserNotFoundException() {
        System.out.println("Пользователь с таким логином не найден");
    }

}
