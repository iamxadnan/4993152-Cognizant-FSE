package com.example.demo;

import com.example.demo.entity.Country;
import com.example.demo.service.CountryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {
    private final CountryService countryService;

    public OrmLearnApplication(CountryService countryService) {
        this.countryService = countryService;
    }

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Example: Insert a country
        Country country = new Country();
        country.setCode("IN");
        country.setName("India");
        countryService.addCountry(country);

        // Example: Fetch all countries
        countryService.getAllCountries().forEach(c -> 
            System.out.println(c.getCode() + " - " + c.getName())
        );
    }
}
