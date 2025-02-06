package com.belgianwaffles.vehicletracker;

public class CurrentLocationDisplay implements Callback {

    public CurrentLocationDisplay() {}
    
    @Override
    public void call(Vector2d param) {
        System.out.println("Current location: " + param);
    }
}
