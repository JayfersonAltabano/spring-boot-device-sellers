package com.altabanol.springbootdevicesellerapplication.service;

import com.altabanol.springbootdevicesellerapplication.model.Role;
import com.altabanol.springbootdevicesellerapplication.model.User;

import java.util.Optional;

public interface UserService
{
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);
}