package com.flight.demo.entity;

import java.util.List;

public class Cargo {

    private Long flightId;

    private List<Payload> baggage;

    private List<Payload> cargo;

    public Cargo(Long flightId, List<Payload> baggage, List<Payload> cargo) {
        this.flightId = flightId;
        this.baggage = baggage;
        this.cargo = cargo;
    }

    public Long getFlightId() {
        return flightId;
    }

    public void setFlightId(Long flightId) {
        this.flightId = flightId;
    }

    public List<Payload> getBaggage() {
        return baggage;
    }

    public void setBaggage(List<Payload> baggage) {
        this.baggage = baggage;
    }

    public List<Payload> getCargo() {
        return cargo;
    }

    public void setCargo(List<Payload> cargo) {
        this.cargo = cargo;
    }
}
