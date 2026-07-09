package com.sandz.spring.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Country {

    public Country(){}

    public Country(String code, String name){
        this.code = code;
        this.name = name;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="code")
    private String code;
    
    @Column(name="name")
    private String name;

    public String getName(){
        return name;
    }

    public String getCode(){
        return code;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCode(String code){
        this.code = code;
    }

    @Override
    public String toString(){
        return "Country code: "+code+" Country Name: "+name;
    }
}
