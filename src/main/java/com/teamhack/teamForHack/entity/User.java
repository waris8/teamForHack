package com.teamhack.teamForHack.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.util.List;

@Document
@NoArgsConstructor
@Data
public class User {

    @Id
    private long id;
    private String name;
    private String email;
    private long phone;
    private SocialMediaLinks socialMediaLinks;
    private List<Skills>skillsList;


}
