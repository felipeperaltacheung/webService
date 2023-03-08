package com.webservice.resources;

import com.webservice.entities.Userr;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserrResources {

    @GetMapping
    public ResponseEntity <Userr> findAll(){
        Userr userr = new Userr(1L, "maria", "maria@gmail.com", "0000", "1234");
        return ResponseEntity.ok().body(userr);
    }

}
