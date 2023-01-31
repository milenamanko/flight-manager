package com.flight.demo.entity;

import jakarta.persistence.OneToMany;
import org.springframework.data.annotation.Id;

import java.util.List;

public class CargoEntity {

    @Id
    private Long flightId;

    @OneToMany
    List<Baggage> baggage;

    @OneToMany
    List<Cargo> cargo;

    public CargoEntity(List<Baggage> baggage, List<Cargo> cargo) {
        this.baggage = baggage;
        this.cargo = cargo;
    }

    public Long getFlightId() {
        return flightId;
    }

    public void setFlightId(Long flightId) {
        this.flightId = flightId;
    }

    public List<Baggage> getBaggage() {
        return baggage;
    }

    public void setBaggage(List<Baggage> baggage) {
        this.baggage = baggage;
    }

    public List<Cargo> getCargo() {
        return cargo;
    }

    public void setCargo(List<Cargo> cargo) {
        this.cargo = cargo;
    }
}
