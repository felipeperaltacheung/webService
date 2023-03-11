package com.webservice.resources;

import com.webservice.entities.Product;
import com.webservice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductResources {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity <List<Product>> findAll(){
        List<Product> listProduct =  productService.findAll();
        return ResponseEntity.ok().body(listProduct);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Product>> findById(@PathVariable Long id){
        Optional<Product> byId = productService.findById(id);
        return ResponseEntity.ok().body(byId);
    }

}
