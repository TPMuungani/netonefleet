package com.example.netonefleet;

import com.example.netonefleet.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NetonefleetApplication implements CommandLineRunner {

    public static void main(String[] args) {

        SpringApplication.run(NetonefleetApplication.class, args);
    }

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public void run(String... args) throws Exception {

    }
}
