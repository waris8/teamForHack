package com.teamhack.teamForHack.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class SocialMediaLinks {


//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;

    private String linkedIn;
    private String github;
    private String portfolio;
}
