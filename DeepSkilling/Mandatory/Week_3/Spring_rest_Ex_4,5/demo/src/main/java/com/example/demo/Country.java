package com.example.demo;


public class Country {
    
    private String code;
    public String name;

    public Country(String code, String name){
        this.code = code;
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setCode(String code){
        this.code = code;
    }

    public String getCode(){
        return code;
    }
    
}
