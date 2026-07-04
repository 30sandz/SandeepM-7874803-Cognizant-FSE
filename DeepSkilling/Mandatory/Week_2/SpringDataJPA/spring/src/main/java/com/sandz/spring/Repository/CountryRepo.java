package com.sandz.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sandz.spring.Entity.Country;

@Repository
public interface CountryRepo extends JpaRepository<Country, String>{
    
}
