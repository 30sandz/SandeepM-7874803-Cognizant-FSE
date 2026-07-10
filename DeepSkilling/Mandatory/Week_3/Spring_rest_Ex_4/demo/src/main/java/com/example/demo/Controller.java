package com.example.demo;


import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller{

    private static final Logger log = LoggerFactory.getLogger(Controller.class);
    ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

    @GetMapping("/country")
    public Country getCountryIndia(){
        log.info("Method entered");

        return context.getBean("india",Country.class);

    }

    @GetMapping("/country/{code}")
    public Country getCountryById(@PathVariable String code){
        log.info("Method Find by ID entered");

        Map<String, Country> list = context.getBeansOfType(Country.class);

        for(Map.Entry<String, Country> c: list.entrySet()){
            if(c.getValue().getCode().equalsIgnoreCase(code)){
                return c.getValue();
            }
        }

        return null;
        
    }
}