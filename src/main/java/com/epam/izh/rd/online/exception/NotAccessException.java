package com.epam.izh.rd.online.exception;

public class NotAccessException extends UnsupportedOperationException {

    public NotAccessException() {
        System.out.println("Недостаточно прав для выполнения операции");
    }

}
