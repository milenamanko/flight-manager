package com.flight.demo.repository;

import com.flight.demo.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Long, Flight> {
}
