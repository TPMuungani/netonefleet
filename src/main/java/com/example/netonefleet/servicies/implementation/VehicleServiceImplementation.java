package com.example.netonefleet.servicies.implementation;

import com.example.netonefleet.models.Vehicle;
import com.example.netonefleet.repositories.VehicleRepository;
import com.example.netonefleet.servicies.VehicleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImplementation implements VehicleService {

    private VehicleRepository vehicleRepository;
    private Long id;

    public VehicleServiceImplementation(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    @Override
    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle editVehicleDetails(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle updateVehicleDetails(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public void deleteVehicleById(Long id) {

        vehicleRepository.deleteById(id);

    }

    @Override
    public Vehicle getVehicleByID() {
        return vehicleRepository.findById(id).get();
    }



}

