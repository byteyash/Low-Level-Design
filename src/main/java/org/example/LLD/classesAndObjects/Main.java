package org.example.LLD.classesAndObjects;

public class Main {
    public static void main(String[] args) {
        ParkingSpot spotA = new ParkingSpot("A-01", SpotType.SMALL);
        ParkingSpot spotC = new ParkingSpot("C-01", SpotType.MID);
        System.out.println("Created Parking spot A-01");
//        try {
//            ParkingSpot spotB = new ParkingSpot("", SpotType.MID);
//            System.out.println("Created spot with an empty Id");
//        } catch (Exception e) {
//            throw new IllegalArgumentException("Id cant be empty for spot");
//        }

        Vehicle car = new Vehicle("C1", VehicleType.CAR);
        Vehicle bike = new Vehicle("B1", VehicleType.BIKE);

        System.out.println("Park car in A-01: " + (spotA.park(car) ? "accepted" : "rejected"));
        System.out.println("Park car in C-01: " + (spotC.park(car) ? "accepted" : "rejected"));
        System.out.println("Park bike in A-01: " + (spotC.park(car) ? "accepted" : "rejected"));


    }
}
