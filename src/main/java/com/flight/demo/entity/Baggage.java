package com.flight.demo.entity;

import org.springframework.data.annotation.Id;

public class Baggage {

    @Id
    private Long id;

    private int weight;

    private WeightUnit weightUnit;

    private int pieces;

    public Baggage(int weight, WeightUnit weightUnit, int pieces) {
        this.weight = weight;
        this.weightUnit = weightUnit;
        this.pieces = pieces;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public WeightUnit getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(WeightUnit weightUnit) {
        this.weightUnit = weightUnit;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }
}
