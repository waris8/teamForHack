package com.teamhack.teamForHack.service.impl;

import com.teamhack.teamForHack.entity.User;
import com.teamhack.teamForHack.repository.UserRepo;
import com.teamhack.teamForHack.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;


    @Override
    public List<User> getAllUser() {
        return userRepo.findAllBy();
    }

    @Override
    public User addUser(User user) {
        return userRepo.insert(user);
    }
}
