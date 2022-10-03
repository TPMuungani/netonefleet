package com.example.netonefleet.servicies.implementation;

import com.example.netonefleet.models.Client;
import com.example.netonefleet.repositories.ClientRepository;
import com.example.netonefleet.servicies.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImplementation implements ClientService {

    private ClientRepository clientRepository;

    public ClientServiceImplementation(ClientRepository clientRepository) {
        super();
        this.clientRepository = clientRepository;
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
}
