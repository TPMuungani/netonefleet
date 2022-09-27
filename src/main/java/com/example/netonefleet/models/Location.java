package com.example.netonefleet.models;

import javax.persistence.*;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
    private int country_id;
    private String city;
    @ManyToOne
    @JoinColumn(name = "state_id")
    private State state;
    private int state_id;
    private String address;
    private String description;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Location() {
    }

    public Location(Long id, Country country, int country_id, String city, State state, int state_id, String address, String description) {
        super();
        this.id = id;
        this.country = country;
        this.country_id = country_id;
        this.city = city;
        this.state = state;
        this.state_id = state_id;
        this.address = address;
        this.description = description;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getState_id() {
        return state_id;
    }

    public void setState_id(int state_id) {
        this.state_id = state_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
