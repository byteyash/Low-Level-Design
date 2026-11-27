package org.example.LLD.classesAndObjects;

public class Vehicle {
    private String id;
    private VehicleType type;

    public Vehicle(String id, VehicleType type) {
        if(id == null || id.isEmpty()) {
            throw new IllegalArgumentException("Vehicle id can not be null");
        }
        this.id = id;
        this.type = type;
    }

    public VehicleType getType() {
        return type;
    }
}
