package com.example.demo.test.vo;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// collections 이름 : users
@Document(collection = "users")
@Getter
public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private String password;

    @Builder
    public User(String id, String name, String email, String password){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
