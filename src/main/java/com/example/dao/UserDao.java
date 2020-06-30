package com.example.dao;

import com.example.model.User;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}