package com.example.netonefleet.servicies.implementation;

import com.example.netonefleet.models.VehicleMaintanance;
import com.example.netonefleet.repositories.VehicleHireRepository;
import com.example.netonefleet.repositories.VehicleMaintananceRepository;
import com.example.netonefleet.servicies.VehicleMaintananceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleMaintananceServiceImplementation implements VehicleMaintananceService {

    private VehicleMaintananceRepository vehicleMaintananceRepository;

    public VehicleMaintananceServiceImplementation(VehicleMaintananceRepository vehicleMaintananceRepository) {
        this.vehicleMaintananceRepository = vehicleMaintananceRepository;
    }

    @Override
    public List<VehicleMaintanance> getAllVehicleMaintanances() {
        return vehicleMaintananceRepository.findAll();
    }
}
