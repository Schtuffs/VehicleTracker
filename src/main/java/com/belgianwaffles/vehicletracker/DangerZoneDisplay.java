package com.belgianwaffles.vehicletracker;

public class DangerZoneDisplay implements Callback {

	DangerZone dz;
	
	public DangerZoneDisplay() {
		this.dz = new DangerZone();
	}
	
	public DangerZoneDisplay(DangerZone dangerZone) {
		
		this.dz = dangerZone;
		
	}
	
	
	@Override
	public void call(Vector2d param) {
		
		// display alarm if vehicle is in the danger zone
		if (dz.inDangerZone(param)) {
			System.out.println("Vehicle in DANGER ZONE");
		}
		
	}

}
