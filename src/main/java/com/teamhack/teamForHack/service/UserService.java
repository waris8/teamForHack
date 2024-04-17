package com.teamhack.teamForHack.service;

import com.teamhack.teamForHack.entity.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUser() ;

    public User addUser(User user);
}
