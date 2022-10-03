package com.example.netonefleet.servicies.implementation;

import com.example.netonefleet.models.VehicleMovement;
import com.example.netonefleet.repositories.VehicleMovementRepository;
import com.example.netonefleet.servicies.VehicleMovementService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleMovementServiceImplementation implements VehicleMovementService {

    private VehicleMovementRepository vehicleMovementRepository;

    public VehicleMovementServiceImplementation(VehicleMovementRepository vehicleMovementRepository) {
        this.vehicleMovementRepository = vehicleMovementRepository;
    }

    @Override
    public List<VehicleMovement> getAllVehicleMovements() {
        return vehicleMovementRepository.findAll();
    }
}
