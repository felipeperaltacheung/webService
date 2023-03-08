package com.webservice.resources;

import com.webservice.entities.Userr;
import com.webservice.services.UserrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
