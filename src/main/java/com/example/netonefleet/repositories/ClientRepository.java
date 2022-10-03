package com.example.netonefleet.repositories;

import com.example.netonefleet.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
