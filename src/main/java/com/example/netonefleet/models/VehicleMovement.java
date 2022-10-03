package com.example.netonefleet.models;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Objects;

@Entity
public class VehicleMovement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "vehicle_id", insertable = false, updatable = false)
    private Vehicle vehicle;
    private int vehicle_id;
    @ManyToOne
    @JoinColumn(name = "location_id", insertable = false, updatable = false)
    private Location location;
    private int location_id;
    private Date movementDate;
    private String remarks;

    public VehicleMovement() {
    }

    public VehicleMovement(Vehicle vehicle, int vehicle_id, Location location, int location_id, Date movementDate, String remarks) {
        this.vehicle = vehicle;
        this.vehicle_id = vehicle_id;
        this.location = location;
        this.location_id = location_id;
        this.movementDate = movementDate;
        this.remarks = remarks;
    }

    public int getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public int getLocation_id() {
        return location_id;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }

    public Date getMovementDate() {
        return movementDate;
    }

    public void setMovementDate(Date movementDate) {
        this.movementDate = movementDate;
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

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "VehicleMovement{" +
                "id=" + id +
                ", vehicle=" + vehicle +
                ", vehicle_id=" + vehicle_id +
                ", location=" + location +
                ", location_id=" + location_id +
                ", movementDate=" + movementDate +
                ", remarks='" + remarks + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VehicleMovement that = (VehicleMovement) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
