package com.belgianwaffles.vehicletracker;

public class DangerZone {
	
	double radius;
	Vector2d center;
	
	public DangerZone() {
		radius = 0;
		center = new Vector2d(0, 0);
	}
	
	public DangerZone(double r, Vector2d centerPoint) {
		
		this.radius = r;
		this.center = centerPoint;
		
	}
	
	// determines whether or not the given vector is in the danger zone 
	public boolean inDangerZone(Vector2d vector) {
		
		// returns true if the distance between the given point and the center of the danger zone is less then the radius
		// (means point is within the danger zone)
		if (this.center.distance(vector) <= this.radius) {
			return true;
		}
		
		// other wise return false the point is not in the danger zone 
		return false;
	}
	
	public void setRadius(double r) {
		this.radius = r;
	}
	
	public void setCenter(Vector2d centerPoint) {
		this.center = centerPoint;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public Vector2d getCenter() {
		return this.center;
	}

}
