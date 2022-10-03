package com.example.netonefleet.servicies.implementation;

import com.example.netonefleet.models.VehicleModel;
import com.example.netonefleet.repositories.VehicleModelRepository;
import com.example.netonefleet.servicies.VehicleModelService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleModelServiceImplementation implements VehicleModelService {

    private VehicleModelRepository vehicleModelRepository;

    public VehicleModelServiceImplementation(VehicleModelRepository vehicleModelRepository) {
        this.vehicleModelRepository = vehicleModelRepository;
    }

    @Override
    public List<VehicleModel> getAllVehicleModels() {
        return vehicleModelRepository.findAll();
    }
}
