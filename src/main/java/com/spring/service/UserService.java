package com.spring.service;

import com.spring.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

}
