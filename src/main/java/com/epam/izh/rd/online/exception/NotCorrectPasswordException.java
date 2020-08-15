package com.epam.izh.rd.online.exception;

public class NotCorrectPasswordException extends Exception {

    public NotCorrectPasswordException() {
        System.out.println("Пароль введен неверно!");
    }

}
