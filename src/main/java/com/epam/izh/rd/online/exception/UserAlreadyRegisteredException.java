package com.epam.izh.rd.online.exception;

import com.epam.izh.rd.online.entity.User;
import com.epam.izh.rd.online.repository.IUserRepository;
import com.epam.izh.rd.online.repository.UserRepository;

public class UserAlreadyRegisteredException extends Exception {

    public UserAlreadyRegisteredException(User foundUser) {
             System.out.println("Пользователь с логином " + foundUser.getLogin() + " уже зарегистрирован");
    }
}
