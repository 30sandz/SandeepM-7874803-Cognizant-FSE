package com.sandz.spring.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sandz.spring.Entity.Country;

@Repository
public interface CountryRepo extends JpaRepository<Country, String>{
    
    public Optional<Country> findByCode(String code);

    public void deleteByCode(String code);

    public List<Country> findByNameContaining(String name);


}
