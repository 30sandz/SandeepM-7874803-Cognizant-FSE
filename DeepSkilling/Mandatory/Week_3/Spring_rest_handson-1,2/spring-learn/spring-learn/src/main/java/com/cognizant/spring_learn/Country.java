package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {

    private static final Logger log = LoggerFactory.getLogger(Country.class);

    private String code;
    private String name;

    public Country(){
        log.debug("Inside Country Constructor");
    }

    public void setCode(String name){
        this.name = name;
    }

    public void setName(String code){
        this.code = code;
    }

    public String getCode(){
        return code;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Code : "+code+" Name: "+name;
    }
}
