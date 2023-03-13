package com.webservice.services;

import com.webservice.entities.Userr;
import com.webservice.repositories.UserrRepository;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Service
public class UserrService {

    private final UserrRepository userrRepository;

    public UserrService(UserrRepository userrRepository) {
        this.userrRepository = userrRepository;
    }

    public List<Userr> findAll(){
        return userrRepository.findAll();
    }

    public Optional<Userr> findById(Long id){
        return userrRepository.findById(id);
    }

    public Userr create(Userr userr){
        return userrRepository.save(userr);
    }

}
