package com.cognizant.controller;

import com.cognizant.entity.Country;
import com.cognizant.repository.CountryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private final CountryRepository repository;

    public CountryController(CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Country> getAllCountries() {
        return repository.findAll();
    }
}