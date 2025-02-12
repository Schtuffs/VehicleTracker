package com.belgianwaffles.vehicletracker;

public class CurrentLocationDisplay implements Callback {

    public CurrentLocationDisplay() {}
    
    /**
     * Outputs the current location.
     * @param param the current location as a Vector2d
     */
    @Override
    public void onSet(Object obj) {
    	
    }
    
    @Override
    public void call(Vector2d param) {
        System.out.println("Current location: " + param);
    }
}
