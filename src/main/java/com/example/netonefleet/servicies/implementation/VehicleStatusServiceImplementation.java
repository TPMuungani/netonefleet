package com.example.netonefleet.servicies.implementation;

import com.example.netonefleet.models.VehicleStatus;
import com.example.netonefleet.repositories.VehicleStatusRepository;
import com.example.netonefleet.servicies.VehicleStatusService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleStatusServiceImplementation implements VehicleStatusService {

    private VehicleStatusRepository vehicleStatusRepository;

    public VehicleStatusServiceImplementation(VehicleStatusRepository vehicleStatusRepository) {
        this.vehicleStatusRepository = vehicleStatusRepository;
    }

    @Override
    public List<VehicleStatus> getAllVehicleStatuses() {
        return vehicleStatusRepository.findAll();
    }
}
