package com.example.netonefleet.servicies.implementation;

import com.example.netonefleet.models.VehicleHire;
import com.example.netonefleet.repositories.VehicleHireRepository;
import com.example.netonefleet.servicies.VehicleHireService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleHireServiceImplementation implements VehicleHireService {

    private VehicleHireRepository vehicleHireRepository;

    public VehicleHireServiceImplementation(VehicleHireRepository vehicleHireRepository) {
        this.vehicleHireRepository = vehicleHireRepository;
    }

    @Override
    public List<VehicleHire> getAllVehicleHires() {
        return vehicleHireRepository.findAll();
    }
}
