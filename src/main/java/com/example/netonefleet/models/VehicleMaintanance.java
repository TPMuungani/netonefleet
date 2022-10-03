package com.example.netonefleet.models;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class VehicleMaintanance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "vehicle_id", insertable = false, updatable = false)
    private Vehicle vehicle;
    private int vehicle_id;
    private Date startDate;
    private Date endStart;
    private double price;
    @ManyToOne
    @JoinColumn(name = "supplier_id", insertable = false, updatable = false)
    private Supplier supplier;
    private int supplier_id;
    private String remarks;

    public VehicleMaintanance() {
    }

    public VehicleMaintanance(Vehicle vehicle, int vehicle_id, Date startDate, Date endStart, double price, Supplier supplier, int supplier_id, String remarks) {
        this.vehicle = vehicle;
        this.vehicle_id = vehicle_id;
        this.startDate = startDate;
        this.endStart = endStart;
        this.price = price;
        this.supplier = supplier;
        this.supplier_id = supplier_id;
        this.remarks = remarks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndStart() {
        return endStart;
    }

    public void setEndStart(Date endStart) {
        this.endStart = endStart;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(int supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return "VehicleMaintanance{" +
                "id=" + id +
                ", vehicle=" + vehicle +
                ", vehicle_id=" + vehicle_id +
                ", startDate=" + startDate +
                ", endStart=" + endStart +
                ", price=" + price +
                ", supplier=" + supplier +
                ", supplier_id=" + supplier_id +
                ", remarks='" + remarks + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VehicleMaintanance that = (VehicleMaintanance) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
