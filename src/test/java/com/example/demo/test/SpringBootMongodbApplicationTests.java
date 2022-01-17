package com.example.demo.test;

import com.example.demo.test.vo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@DataMongoTest
public class SpringBootMongodbApplicationTests {

    @Autowired
    UserRepository userRepository;

    @Test
    public void findByEmail(){
        User user = new User("test101","jun","test@test.com","12345");
        userRepository.save(user);

        Optional<User> byId = userRepository.findById(user.getId());
    }
}
