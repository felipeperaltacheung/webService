package com.webservice.resources;

import com.webservice.entities.Userr;
import com.webservice.services.UserrService;
import jakarta.servlet.Servlet;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserrResources {

    @Autowired
    private UserrService userrService;

    @GetMapping
    public ResponseEntity <List<Userr>> findAll(){
        List<Userr> listUser =  userrService.findAll();
        return ResponseEntity.ok().body(listUser);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Userr>> findById(@PathVariable Long id){
        Optional<Userr> byId = userrService.findById(id);
        return ResponseEntity.ok().body(byId);
    }

    @PostMapping
    public ResponseEntity<Userr> insert(@RequestBody  Userr userr){
        userrService.create(userr);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(userr.getId()).toUri();
        return ResponseEntity.created(uri).body(userr);
    }

}
