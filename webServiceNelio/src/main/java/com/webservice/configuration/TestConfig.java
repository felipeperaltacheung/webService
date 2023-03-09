package com.webservice.configuration;

import com.webservice.entities.Order;
import com.webservice.entities.Userr;
import com.webservice.repositories.OrderRepository;
import com.webservice.repositories.UserrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.Instant;
import java.util.Arrays;

@Configuration
public class TestConfig implements CommandLineRunner {


    @Autowired
    private UserrRepository userrRepository;

    @Autowired
    private OrderRepository orderRepository;


    @Override
    public void run(String... args) throws Exception {

        Userr u1 = new Userr(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        Userr u2 = new Userr(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        userrRepository.saveAll(Arrays.asList(u1, u2));

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1);

        orderRepository.saveAll(Arrays.asList(o1, o2, o3));

    }
}
