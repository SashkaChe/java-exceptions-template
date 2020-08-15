package com.epam.izh.rd.online.repository;

import com.epam.izh.rd.online.entity.User;

public interface IUserRepository {

    User save(User user);

    User findByLogin(String login);

    User findByPassword(String password); // (^_^)

    void deleteByLogin(String login);
}
