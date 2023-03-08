package com.webservice.configuration;

import com.webservice.entities.Userr;
import com.webservice.repositories.UserrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserrRepository userrRepository;

    @Override
    public void run(String... args) throws Exception {

        Userr u1 = new Userr(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        Userr u2 = new Userr(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        userrRepository.saveAll(Arrays.asList(u1, u2));

    }
}
