package com.teamhack.teamForHack.repository;


import com.teamhack.teamForHack.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Stream;

@Repository
public interface UserRepo extends MongoRepository<User, Long> {


    List<User> findAllBy();


}


//mongodb://localhost:27017