package com.belgianwaffles.vehicletracker;

public class Main {
    public static void main(String[] args) {

        // Create a new vehicle starting at (0, 0) the starting point
        Vehicle vehicle = new Vehicle(new Vector2d(0,0));

        vehicle.addCallback(new CurrentLocationDisplay());
        vehicle.addCallback(new DangerZoneDisplay(new DangerZone(3, new Vector2d(6,6))));
        vehicle.addCallback(new TotalTravelledDistanceDisplay());
        
        // All position changes in diagram
        vehicle.changeLocation(new Vector2d(2, 2));
        vehicle.changeLocation(new Vector2d(2, 4));
        vehicle.changeLocation(new Vector2d(4, 6));
        vehicle.changeLocation(new Vector2d(6, 8));
        vehicle.changeLocation(new Vector2d(8, 10));
    }
}
