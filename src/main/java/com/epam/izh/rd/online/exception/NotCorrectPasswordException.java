package com.epam.izh.rd.online.exception;

public class NotCorrectPasswordException extends Exception {

    NotCorrectPasswordException() {
        System.out.println("Пароль введен неверно!");
    }

}
