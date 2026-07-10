package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class Controller{

    private static final Logger log = LoggerFactory.getLogger(Controller.class);

    @RequestMapping("/")
    public String sayHello(){

        log.info("Entered the method");
        String msg = "Hello World";
        log.info("The msg {} is printed", msg);


        return msg;   

        
    }

}