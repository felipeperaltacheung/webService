package com.webservice.services;

import com.webservice.entities.Category;
import com.webservice.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    private final CategoryRepository CategoryRepository;

    public CategoryService(CategoryRepository CategoryRepository) {
        this.CategoryRepository = CategoryRepository;
    }

    public List<Category> findAll(){
        return CategoryRepository.findAll();
    }

    public Optional<Category> findById(Long id){
        return CategoryRepository.findById(id);
    }

}
