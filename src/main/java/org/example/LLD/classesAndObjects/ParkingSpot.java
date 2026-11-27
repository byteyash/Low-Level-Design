package org.example.LLD.classesAndObjects;

public class ParkingSpot {
    private String id;
    private SpotType type;
    private Vehicle vehicle;

    public ParkingSpot(String id, SpotType type) {
        if(id == null || id.isEmpty()) {
            throw new IllegalArgumentException("Id cant be null or empty");
        }
        this.id = id;
        this.type = type;
        this.vehicle = null;
    }

    public boolean canFitVehicle(Vehicle vehicle) {
        return type == vehicle.getType().getSpotType();
    }

    public boolean isAvailable() {
        return vehicle == null;
    }

    public boolean park(Vehicle vehicle) {
        if(vehicle == null || !isAvailable() || !canFitVehicle(vehicle)) {
            return false;
        }
        this.vehicle = vehicle;
        return true;
    }

    public void vacateSpot() {
        vehicle = null;
    }
}
