package com.example.netonefleet.servicies;

import com.example.netonefleet.models.Vehicle;

import java.util.List;

public interface VehicleService {

    List<Vehicle> getAllVehicles();

    public Vehicle saveVehicle(Vehicle vehicle);
    public Vehicle editVehicleDetails(Vehicle vehicle);
    public Vehicle updateVehicleDetails(Vehicle vehicle);
    void deleteVehicleById(Long id);
    public Vehicle getVehicleByID();


}
