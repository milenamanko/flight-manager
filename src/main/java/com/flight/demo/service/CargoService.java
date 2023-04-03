package com.flight.demo.service;

import com.flight.demo.entity.Cargo;
import com.flight.demo.repository.MockCargoRepository;
import com.flight.demo.repository.MockFlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CargoService {

    private MockFlightRepository flightRepository;

    private MockCargoRepository cargoRepository;

    public CargoService(MockFlightRepository flightRepository, MockCargoRepository cargoRepository) {
        this.flightRepository = flightRepository;
        this.cargoRepository = cargoRepository;
    }

    public Integer getCargoWeight(Long flightId) {
        return 0;

    }
}
