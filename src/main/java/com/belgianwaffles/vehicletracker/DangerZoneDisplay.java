package com.belgianwaffles.vehicletracker;

public class DangerZoneDisplay implements Callback {

	DangerZone dz;
	
	public DangerZoneDisplay() {
		this.dz = new DangerZone();
	}
	
	public DangerZoneDisplay(DangerZone dangerZone) {
		
		this.dz = dangerZone;
		
	}
	
	/**
	 * Empty onSet implementation to keep the compiler happy.
	 * 
	 * @param obj
	 */
	@Override
	public void onSet(Object obj) {
		
	}
	
	
	/**
	 * Displays an alarm if the vehicle is in the danger zone.
	 * 
	 * @param param the current location as a Vector2d
	 */
	@Override
	public void call(Vector2d param) {
		
		// display alarm if vehicle is in the danger zone
		if (dz.inDangerZone(param)) {
			System.out.println("Vehicle in DANGER ZONE");
		}
		
	}

}
