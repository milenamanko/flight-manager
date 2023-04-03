package com.flight.demo.entity;

public class Payload {

    private Long id;

    private Integer weight;

    private WeightUnit weightUnit;

    private Integer pieces;

    private PayloadType payloadType;

    public Payload(int weight, WeightUnit weightUnit, int pieces, PayloadType payloadType) {
        this.weight = weight;
        this.weightUnit = weightUnit;
        this.pieces = pieces;
        this.payloadType = payloadType;
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

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void setPieces(Integer pieces) {
        this.pieces = pieces;
    }

    public Integer getPieces() {
        return pieces;
    }

    public PayloadType getPayloadType() {
        return payloadType;
    }

    public void setPayloadType(PayloadType payloadType) {
        this.payloadType = payloadType;
    }
}
