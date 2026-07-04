package com.sandz.spring.Service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.sandz.spring.Entity.Country;
import com.sandz.spring.Repository.CountryRepo;

@Service
public class CountryService {
    

    private CountryRepo countryRepo;


    public CountryService(CountryRepo repo){
        this.countryRepo = repo;
    }

    public List<Country> getAllCountry(){
        return countryRepo.findAll();
    }


}
