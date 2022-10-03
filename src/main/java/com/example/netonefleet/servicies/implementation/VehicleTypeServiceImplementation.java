package com.example.netonefleet.servicies.implementation;

import com.example.netonefleet.models.VehicleType;
import com.example.netonefleet.repositories.VehicleTypeRepository;
import com.example.netonefleet.servicies.VehicleTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleTypeServiceImplementation implements VehicleTypeService {

    private VehicleTypeRepository vehicleTypeRepository;

    public VehicleTypeServiceImplementation(VehicleTypeRepository vehicleTypeRepository) {
        this.vehicleTypeRepository = vehicleTypeRepository;
    }

    @Override
    public List<VehicleType> getAllVehicleTypes() {
        return vehicleTypeRepository.findAll();
    }
}
