package com.webservice.resources;

import com.webservice.entities.Category;
import com.webservice.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categories")
public class CategoryResources {

    @Autowired
    private CategoryService CategoryService;

    @GetMapping
    public ResponseEntity <List<Category>> findAll(){
        List<Category> listCategory =  CategoryService.findAll();
        return ResponseEntity.ok().body(listCategory);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Category>> findById(@PathVariable Long id){
        Optional<Category> byId = CategoryService.findById(id);
        return ResponseEntity.ok().body(byId);
    }

}
