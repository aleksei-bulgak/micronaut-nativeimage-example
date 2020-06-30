package com.example.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import com.example.model.User;
import com.example.dao.UserDao;

@Singleton
public class UserService {

    private UserDao userDao;

    @Inject
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> findAll() {
        Iterable<User> users = userDao.findAll();
        List<User> result = new ArrayList<>();
        users.iterator().forEachRemaining(result::add);
        return result;
    }

    public User create(User user) {
        return userDao.save(user);
    }

    public User findById(String id) {
        return userDao.findById(id).orElse(null);
    }

}