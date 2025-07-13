package com.cognizant.spring_learn.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.Country;
@SuppressWarnings("deprecation")
@RestController
public class HelloController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String sayHello() {
        LOGGER.info("START - sayHello()");
        String response = "Hello World!!";
        LOGGER.info(response);
        LOGGER.info("END - sayHello()");
        return response;
    }
    
    @RequestMapping("/country" )
    public Country getCountryIndia() {
        LOGGER.info("START - getCountryIndia()");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = (Country) context.getBean("in");
        LOGGER.info("END - getCountryIndia()");
        return country;
    }
    @GetMapping("/country/{code}")
    public Country getCountryByCode(@PathVariable String code) {
    	LOGGER.info("Start- getCountrybycode()");
    	ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = (Country) context.getBean(code.toLowerCase());
        LOGGER.info("EDD- getContryBycode()");
        return country;
    	
    }

}
