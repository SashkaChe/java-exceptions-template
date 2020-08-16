package com.epam.izh.rd.online.exception;

public class SimplePasswordException extends Exception {

    public SimplePasswordException() {
        System.out.println("Пароль не соответствует требованиям безопасности");
    }

}
