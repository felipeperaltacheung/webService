package com.webservice.repositories;

import com.webservice.entities.Userr;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserrRepository extends JpaRepository<Userr, Long> {
}
