package com.belgianwaffles.vehicletracker;

public class Main {
    // Default sizes
    private static final int RADIUS    = 3;
    private static final int POS_X     = 6;
    private static final int POS_Y     = 6;
    
    public static void main(String[] args) {

        // Create a new vehicle starting at (0, 0) the starting point
        Vehicle vehicle = new Vehicle(new Vector2d(0,0));
        
        // Add callbacks
        vehicle.addCallback(new CurrentLocationDisplay());
        vehicle.addCallback(new DangerZoneDisplay(new DangerZone(RADIUS, new Vector2d(POS_X, POS_Y))));
        vehicle.addCallback(new TotalTravelledDistanceDisplay());
        
        // All position changes in diagram
        vehicle.changeLocation(new Vector2d(2, 2));
        vehicle.changeLocation(new Vector2d(2, 4));
        vehicle.changeLocation(new Vector2d(4, 6));
        vehicle.changeLocation(new Vector2d(6, 8));
        vehicle.changeLocation(new Vector2d(8, 10));
    }
}
