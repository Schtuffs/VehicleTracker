package com.belgianwaffles.vehicletracker;

public class TotalTravelledDistanceDisplay implements Callback {

    Vehicle vehicleOfObservation;
    Vector2d vehicleLocation;
    double totalDistanceTravelled;

    public TotalTravelledDistanceDisplay() {
        this.vehicleOfObservation = null;
        this.totalDistanceTravelled = 0;
        this.vehicleLocation = null;
    }

    public void registerVehicle(Vehicle vehicle) {
        this.vehicleOfObservation = vehicle;
        this.vehicleLocation = vehicle.getPosition();
    }

    @Override 
    public void call(Vector2d param) {

        // update distance travelled
        this.totalDistanceTravelled = param.distance(this.vehicleLocation) + this.totalDistanceTravelled;

        // change position so next distance can be calculated
        this.vehicleLocation = param;

        // display distance travlled
        System.out.println("Distance Travelled: " + this.totalDistanceTravelled);
    }
    
}
