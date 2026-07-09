package com.sandz.spring.Service;



import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sandz.spring.Entity.Country;
import com.sandz.spring.Exception.CountryNotFoundException;
import com.sandz.spring.Repository.CountryRepo;

import jakarta.transaction.Transactional;

@Service
public class CountryService {
    

    private CountryRepo countryRepo;


    public CountryService(CountryRepo repo){
        this.countryRepo = repo;
    }

    public List<Country> getAllCountry(){
        return countryRepo.findAll();
    }


    public Country getCode(String code) throws CountryNotFoundException{

        return countryRepo.findByCode(code).orElseThrow(
            () -> new CountryNotFoundException("not found");
        );
    }

    public void addCountry(String code, String name){
        Country c = new Country(code, name);
        countryRepo.save(c);
    }

    public void updateCountry(String code, String name){
        Country c = countryRepo.findByCode(code).orElseThrow(
            () -> new CountryNotFoundException(name)
        );
        c.setName(name);
        countryRepo.save(c);
    }

    @Transactional
    public void deleteCountry(String code){
        countryRepo.deleteByCode(code);
    }

    public List<Country> findCountryContaining(String name){
        return countryRepo.findByNameContaining(name);
    }
}
