package com.example.netonefleet.controllers;

import com.example.netonefleet.models.Vehicle;
import com.example.netonefleet.servicies.VehicleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VehicleController {

    private VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        super();
        this.vehicleService = vehicleService;
    }


    @GetMapping("/vehicles")
    public String listVehicles(Model model) {

        model.addAttribute("vehicles", vehicleService.getAllVehicles());
        return "vehicle";

    }

    @GetMapping("/vehicles/new")
    public String CreateVehicle(Model model) {
        Vehicle vehicle = new Vehicle();
        model.addAttribute("vehicles", vehicle);
        return "myModal";

    }
    @PostMapping("/vehicles")
    public String saveVehicle(@ModelAttribute("vehicle") Vehicle vehicle){
        vehicleService.saveVehicle(vehicle);
        return "redirect:/vehicle";

    }
    @GetMapping("/vehicles/{id}")
    public String editVehicleDetails(@PathVariable Long id, Model model){
        model.addAttribute("vehicle", vehicleService.getVehicleByID());
        return "myModal1";
    }
    @PostMapping("/vehicles/{id}")
    public String updateVehicleDetails(@PathVariable Long id, @ModelAttribute("vehicle") Vehicle vehicle, Model model){
        Vehicle existingVehicle = vehicleService.getVehicleByID();

        existingVehicle.setId(id);
        existingVehicle.setName(vehicle.getName());
        existingVehicle.setRegistrationNumber(vehicle.getRegistrationNumber());
        existingVehicle.setEngineNumber(vehicle.getEngineNumber());
        existingVehicle.setChasisNumber(vehicle.getChasisNumber());
        existingVehicle.setRegistrationDate(vehicle.getRegistrationDate());
        existingVehicle.setAcquisitionDate(vehicle.getAcquisitionDate());
        existingVehicle.setFuelType(vehicle.getFuelType());
        existingVehicle.setColor(vehicle.getColor());
        existingVehicle.setWeight(vehicle.getWeight());
        existingVehicle.setVehicleMake(vehicle.getVehicleMake());
        existingVehicle.setVehicleMake_id(vehicle.getVehicleMake_id());
        existingVehicle.setVehicleModel(vehicle.getVehicleModel());
        existingVehicle.setVehicleModel_id(vehicle.getVehicleModel_id());
        existingVehicle.setMilage(vehicle.getMilage());
        existingVehicle.setVehicleType(vehicle.getVehicleType());
        existingVehicle.setVehicleType_id(vehicle.getVehicleType_id());
        existingVehicle.setVehicleStatus(vehicle.getVehicleStatus());
        existingVehicle.setVehicleStatus_id(vehicle.getVehicleStatus_id());
        existingVehicle.setRemarks(vehicle.getRemarks());
        existingVehicle.setLocation(vehicle.getLocation());
        existingVehicle.setLocation_id(vehicle.getLocation_id());
        existingVehicle.setState(vehicle.getState());
        existingVehicle.setState_id(vehicle.getState_id());
        existingVehicle.setCountry(vehicle.getCountry());




        vehicleService.updateVehicleDetails(existingVehicle);
        return "redirect:/vehicle";
    }

    @GetMapping("/vehicles/remove/{id}")
    public String deleteVehicleById(@PathVariable Long id){
        vehicleService.deleteVehicleById(id);
        return "redirect:/vehicle";
    }
}
