package com.example.netonefleet.servicies.implementation;

import com.example.netonefleet.models.Country;
import com.example.netonefleet.repositories.CountryRepository;
import com.example.netonefleet.servicies.CountryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImplementation implements CountryService {

    private CountryRepository countryRepository;


    public CountryServiceImplementation(CountryRepository countryRepository) {
        super();
        this.countryRepository = countryRepository;
    }

    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
}
