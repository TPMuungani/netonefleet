package com.example.netonefleet.servicies.implementation;

import com.example.netonefleet.models.Location;
import com.example.netonefleet.repositories.LocationRepository;
import com.example.netonefleet.servicies.LocationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImplementation implements LocationService {

    private LocationRepository locationRepository;

    public LocationServiceImplementation(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }
}
