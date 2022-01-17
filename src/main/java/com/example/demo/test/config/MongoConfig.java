package com.example.demo.test.config;

import com.mongodb.client.MongoClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoConfig extends AbstractMongoClientConfiguration {

    @Value("${spring.data.mongodb.username}")     //application.properties에서 정의한 MongoDB에 계정 아이디
    private String userName;


    @Value("${spring.data.mongodb.password}")    //application.properties에서 정의한 MongoDB에 계정 비밀번호
    private String password;


    @Value("${spring.data.mongodb.database}") //application.properties에서 정의한 MongoDB에있는 데이터베이스
    private String database;

    //레거시 프로젝트에서 xml파일 안에 <bean>태그 안에 있던 코드를 적어놓은것.
    //mongotemplate을 만들어서 리턴해준다.
    public @Bean
    MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate((MongoClient) mongoClient(), database);
    }

    @Override
    protected String getDatabaseName() {
        return database;
    }

}
