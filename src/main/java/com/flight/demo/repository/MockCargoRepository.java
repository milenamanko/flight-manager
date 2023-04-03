package com.flight.demo.repository;

import com.flight.demo.entity.Payload;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MockCargoRepository {

    public List<Payload> findAllByFlightId(Long flightId) {
        return List.of();
    }
}
