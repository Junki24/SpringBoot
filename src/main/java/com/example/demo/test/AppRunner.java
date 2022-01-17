package com.example.demo.test;

import com.example.demo.test.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

//    @Autowired
//    MongoTemplate mongoTemplate;

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(ApplicationArguments arge) throws Exception{
//        User user = new User("koko7051","junki","aaa@bbb","12345");
//
//        mongoTemplate.insert(user);

        User user = new User("koko7052","junki","aaaccc@bbb","12345");
        userRepository.insert(user);
    }

}
