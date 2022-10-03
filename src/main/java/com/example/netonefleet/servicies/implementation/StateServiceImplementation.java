package com.example.netonefleet.servicies.implementation;

import com.example.netonefleet.models.State;
import com.example.netonefleet.repositories.StateRepository;
import com.example.netonefleet.servicies.StateService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateServiceImplementation implements StateService {

    private StateRepository stateRepository;

    public StateServiceImplementation(StateRepository stateRepository) {
        this.stateRepository = stateRepository;
    }

    @Override
    public List<State> getAllStates() {
        return stateRepository.findAll();
    }
}
