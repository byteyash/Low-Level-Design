package org.example.LLD.classesAndObjects;

public enum VehicleType {
    CAR(SpotType.MID),
    BIKE(SpotType.SMALL);

    private SpotType spotType;

    VehicleType(SpotType spotType) {
        this.spotType = spotType;
    }

    public SpotType getSpotType() {
        return spotType;
    }
}
