package com.sandz.spring.Exception;

public class CountryNotFoundException extends RuntimeException {
    public CountryNotFoundException(String msg){
        super(msg);
    }
}
