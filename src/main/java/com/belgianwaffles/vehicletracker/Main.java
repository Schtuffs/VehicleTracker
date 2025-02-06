package com.belgianwaffles.vehicletracker;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.addCallback(new CurrentLocationDisplay());
        
        // All position changes in diagram
        vehicle.changePosition(new Vector2d(2, 2));
        vehicle.changePosition(new Vector2d(2, 4));
        vehicle.changePosition(new Vector2d(4, 6));
        vehicle.changePosition(new Vector2d(6, 8));
        vehicle.changePosition(new Vector2d(8, 10));
    }
}
