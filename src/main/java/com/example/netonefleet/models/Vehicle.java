package com.example.netonefleet.models;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String registrationNumber;
    private Date registrationDate;
    private Date acquisitionDate;
    private String fuelType;
    private String color;
    private float weight;
    @ManyToOne
    @JoinColumn(name = "vehicleMake_id", insertable = false, updatable = false)
    private VehicleMake vehicleMake;
    private int vehicleMake_id;
    @ManyToOne
    @JoinColumn(name = "vehicleModel_id", insertable = false, updatable = false)
    private VehicleModel vehicleModel;
    private int vehicleModel_id;
    private float milage;
    @ManyToOne
    @JoinColumn(name = "vehicleType_id", insertable = false, updatable = false)
    private VehicleType vehicleType;
    private int vehicleType_id;
    @ManyToOne
    @JoinColumn(name = "vehicleStatus_id", insertable = false, updatable = false)
    private VehicleStatus vehicleStatus;
    private int vehicleStatus_id;
    private String remarks;
    @ManyToOne
    @JoinColumn(name = "location_id", insertable = false, updatable = false)
    private Location location;
    private int location_id;
    @ManyToOne
    @JoinColumn(name = "state_id", insertable = false, updatable = false)
    private State state;
    private int state_id;
    @ManyToOne
    @JoinColumn(name = "country_id", insertable = false, updatable = false)
    private Country country;

    public Vehicle() {

    }

    public Vehicle(String name, String registrationNumber, Date registrationDate, Date acquisitionDate, String fuelType, String color, float weight, VehicleMake vehicleMake, int vehicleMake_id, VehicleModel vehicleModel, int vehicleModel_id, float milage, VehicleType vehicleType, int vehicleType_id, VehicleStatus vehicleStatus, int vehicleStatus_id, String remarks, Location location, int location_id, State state, int state_id, Country country) {
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.registrationDate = registrationDate;
        this.acquisitionDate = acquisitionDate;
        this.fuelType = fuelType;
        this.color = color;
        this.weight = weight;
        this.vehicleMake = vehicleMake;
        this.vehicleMake_id = vehicleMake_id;
        this.vehicleModel = vehicleModel;
        this.vehicleModel_id = vehicleModel_id;
        this.milage = milage;
        this.vehicleType = vehicleType;
        this.vehicleType_id = vehicleType_id;
        this.vehicleStatus = vehicleStatus;
        this.vehicleStatus_id = vehicleStatus_id;
        this.remarks = remarks;
        this.location = location;
        this.location_id = location_id;
        this.state = state;
        this.state_id = state_id;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getAcquisitionDate() {
        return acquisitionDate;
    }

    public void setAcquisitionDate(Date acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public VehicleMake getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(VehicleMake vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public int getVehicleMake_id() {
        return vehicleMake_id;
    }

    public void setVehicleMake_id(int vehicleMake_id) {
        this.vehicleMake_id = vehicleMake_id;
    }

    public VehicleModel getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(VehicleModel vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public int getVehicleModel_id() {
        return vehicleModel_id;
    }

    public void setVehicleModel_id(int vehicleModel_id) {
        this.vehicleModel_id = vehicleModel_id;
    }

    public float getMilage() {
        return milage;
    }

    public void setMilage(float milage) {
        this.milage = milage;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getVehicleType_id() {
        return vehicleType_id;
    }

    public void setVehicleType_id(int vehicleType_id) {
        this.vehicleType_id = vehicleType_id;
    }

    public VehicleStatus getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(VehicleStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    public int getVehicleStatus_id() {
        return vehicleStatus_id;
    }

    public void setVehicleStatus_id(int vehicleStatus_id) {
        this.vehicleStatus_id = vehicleStatus_id;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getLocation_id() {
        return location_id;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getState_id() {
        return state_id;
    }

    public void setState_id(int state_id) {
        this.state_id = state_id;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", registrationDate=" + registrationDate +
                ", acquisitionDate=" + acquisitionDate +
                ", fuelType='" + fuelType + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", vehicleMake=" + vehicleMake +
                ", vehicleMake_id=" + vehicleMake_id +
                ", vehicleModel=" + vehicleModel +
                ", vehicleModel_id=" + vehicleModel_id +
                ", milage=" + milage +
                ", vehicleType=" + vehicleType +
                ", vehicleType_id=" + vehicleType_id +
                ", vehicleStatus=" + vehicleStatus +
                ", vehicleStatus_id=" + vehicleStatus_id +
                ", remarks='" + remarks + '\'' +
                ", location=" + location +
                ", location_id=" + location_id +
                ", state=" + state +
                ", state_id=" + state_id +
                ", country=" + country +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return id.equals(vehicle.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
