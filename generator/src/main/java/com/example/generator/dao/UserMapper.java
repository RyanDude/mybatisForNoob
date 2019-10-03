package com.example.generator.dao;

import com.example.generator.entity.User;

import java.util.List;

public interface UserMapper {
    User findUserByUsername(String username);

    void updateUserByUsername(User user);

    void deleteUserByUsername(String username);

    void saveUser(User user);

    List<User> getUserList();
}
