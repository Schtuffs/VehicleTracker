package com.belgianwaffles.vehicletracker;

public class TotalTravelledDistanceDisplay implements Callback {

    Vector2d vehicleLocation;
    double totalDistanceTravelled;

    public TotalTravelledDistanceDisplay() {
        this.totalDistanceTravelled = 0;
        this.vehicleLocation = new Vector2d();
    }
    
    @Override
    public void onSet(Object obj) {
        // Checks the type of variable being passed
        if (obj.getClass() == Vector2d.class) {
    	    this.vehicleLocation = (Vector2d)obj;
        }
    }

    @Override 
    public void call(Vector2d param) {
        // update distance traveled
        this.totalDistanceTravelled = param.distance(this.vehicleLocation) + this.totalDistanceTravelled;

        // change position so next distance can be calculated
        this.vehicleLocation = param;

        // display distance traveled
        System.out.println("Distance Travelled: " + this.totalDistanceTravelled);
    }
    
}
