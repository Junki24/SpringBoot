package com.example.demo.test;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.beans.Transient;

@Getter
@NoArgsConstructor
@Document(collection = "posts")
public class Posts {

//    @Transient
    public static final String SEQUENCE_NAME = "posts_sequence";

    @Id
    private Long id;
    private String title;
    private String content;
    private String author;

    public void setId(Long id){
        this.id = id;
    }

    public void posts(String title, String content){
        this.title = title;
        this.content = content;
    }

}
