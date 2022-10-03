package com.example.netonefleet.models;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class VehicleHire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "vehicle_id", insertable = false, updatable = false)
    private Vehicle vehicle;
    private int vehicle_id;
    private Date dateOut;
    private Date dateTimeout;
    private Date timeIn;
    private Date dateIn;
    @ManyToOne
    @JoinColumn(name = "client_id", insertable = false, updatable = false)
    private Client client;
    private int client_id;
    private double price;
    private String remarks;
    @ManyToOne
    @JoinColumn(name = "location_id", insertable = false, updatable = false)
    private Location location;
    private int location_id;

    public VehicleHire() {
    }

    public VehicleHire(Vehicle vehicle, int vehicle_id, Date dateOut, Date dateTimeout, Date timeIn, Date dateIn, Client client, int client_id, double price, String remarks, Location location, int location_id) {
        this.vehicle = vehicle;
        this.vehicle_id = vehicle_id;
        this.dateOut = dateOut;
        this.dateTimeout = dateTimeout;
        this.timeIn = timeIn;
        this.dateIn = dateIn;
        this.client = client;
        this.client_id = client_id;
        this.price = price;
        this.remarks = remarks;
        this.location = location;
        this.location_id = location_id;
    }

    public int getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public Date getDateOut() {
        return dateOut;
    }

    public void setDateOut(Date dateOut) {
        this.dateOut = dateOut;
    }

    public Date getDateTimeout() {
        return dateTimeout;
    }

    public void setDateTimeout(Date dateTimeout) {
        this.dateTimeout = dateTimeout;
    }

    public Date getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(Date timeIn) {
        this.timeIn = timeIn;
    }

    public Date getDateIn() {
        return dateIn;
    }

    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public int getLocation_id() {
        return location_id;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
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
        return "VehicleHire{" +
                "id=" + id +
                ", vehicle=" + vehicle +
                ", vehicle_id=" + vehicle_id +
                ", dateOut=" + dateOut +
                ", dateTimeout=" + dateTimeout +
                ", timeIn=" + timeIn +
                ", dateIn=" + dateIn +
                ", client=" + client +
                ", client_id=" + client_id +
                ", price=" + price +
                ", remarks='" + remarks + '\'' +
                ", location=" + location +
                ", location_id=" + location_id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VehicleHire that = (VehicleHire) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
