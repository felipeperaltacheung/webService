package com.webservice.resources;

import com.webservice.entities.Order;
import com.webservice.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderResources {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity <List<Order>> findAll(){
        List<Order> listOrder =  orderService.findAll();
        return ResponseEntity.ok().body(listOrder);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Order>> findById(@PathVariable Long id){
        Optional<Order> byId = orderService.findById(id);
        return ResponseEntity.ok().body(byId);
    }

}
