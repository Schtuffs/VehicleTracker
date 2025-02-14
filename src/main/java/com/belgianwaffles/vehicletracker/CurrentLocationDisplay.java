package com.belgianwaffles.vehicletracker;

/**
 * A display class for showing the current location of a vehicle.
 */
public class CurrentLocationDisplay implements Callback {

    /**
     * Default constructor
     */
    public CurrentLocationDisplay() {}
    
    /**
     * Outputs the current location.
     * @param param the current location as a Vector2d
     */
    @Override
    public void onSet(Object obj) {}
    
    /**
     * Outputs the current location.
     *
     * @param param the current location as a Vector2d to be displayed
     */
    @Override
    public void call(Vector2d param) {
        System.out.println("Current location: " + param);
    }
}
