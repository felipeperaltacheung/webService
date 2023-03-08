package com.webservice.services;

import com.webservice.repositories.UserrRepository;
import org.springframework.stereotype.Service;

@Service
public class UserrService {

    private final UserrRepository userrRepository;

    public UserrService(UserrRepository userrRepository) {
        this.userrRepository = userrRepository;
    }



}
