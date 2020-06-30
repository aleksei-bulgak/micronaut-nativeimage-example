package com.example.controller;

import java.util.List;
import javax.inject.Singleton;

import com.example.model.User;
import com.example.service.UserService;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

@Singleton
@Controller("/users")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Get(uri = "/")
    public List<User> getUsers() {
        return userService.findAll();
    }

    @Post()
    public User createUser(@Body User user) {
        return userService.create(user);
    }

    @Get("/{id}")
    public User getById(String id) {
        return userService.findById(id);
    }
}