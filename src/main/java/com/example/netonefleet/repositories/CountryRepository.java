package com.example.netonefleet.repositories;

import com.example.netonefleet.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
