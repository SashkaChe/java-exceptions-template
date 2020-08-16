package com.epam.izh.rd.online.exception;

public class NotAccessException extends Exception {

    public NotAccessException() {
        System.out.println("Недостаточно прав для выполнения операции");
    }

}
