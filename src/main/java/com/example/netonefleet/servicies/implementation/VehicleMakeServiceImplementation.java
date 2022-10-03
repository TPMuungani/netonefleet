package com.example.netonefleet.servicies.implementation;

import com.example.netonefleet.models.VehicleMake;
import com.example.netonefleet.repositories.VehicleMakeRepository;
import com.example.netonefleet.servicies.VehicleMakeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleMakeServiceImplementation implements VehicleMakeService {

    private VehicleMakeRepository vehicleMakeRepository;

    public VehicleMakeServiceImplementation(VehicleMakeRepository vehicleMakeRepository) {
        this.vehicleMakeRepository = vehicleMakeRepository;
    }

    @Override
    public List<VehicleMake> getAllVehicleMakes() {
        return vehicleMakeRepository.findAll();
    }
}
