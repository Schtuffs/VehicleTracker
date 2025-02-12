package com.belgianwaffles.vehicletracker;

/**
 * Represents a circular danger zone with a specified radius and center point.
 * 
 * This class provides methods to check if a given point is within the danger zone,
 * as well as to set and get the radius and center point of the zone.
 * 
 * @author Andrew
 */
public class DangerZone {
	
	/**
	 * Radius of the danger zone
	 */
	double radius;

	/**
	 * Center of the danger zone
	 */
	Vector2d center;
	
	/**
	 * Default constructor
	 */
	public DangerZone() {
		radius = 0;
		center = new Vector2d(0, 0);
	}
	
	/**
	 * @param r
	 * @param centerPoint
	 */
	public DangerZone(double r, Vector2d centerPoint) {
		
		this.radius = r;
		this.center = centerPoint;
		
	}
	
	/**
	 * Checks to see if the given vector is in the danger zone.
	 * @param vector
	 * @return
	 */
	public boolean inDangerZone(Vector2d vector) {
		
		// returns true if the distance between the given point and the center of the danger zone is less then the radius
		// (means point is within the danger zone)
		if (this.center.distance(vector) <= this.radius) {
			return true;
		}
		
		// other wise return false the point is not in the danger zone 
		return false;
	}
	
/**
 * Sets the radius of the danger zone.
 * @param r the new radius value
 */

	public void setRadius(double r) {
		this.radius = r;
	}
	
	/**
	 * Sets the center of the danger zone to the given vector.
	 * @param centerPoint the new center of the danger zone
	 */
	public void setCenter(Vector2d centerPoint) {
		this.center = centerPoint;
	}
	
	/**
	 * Gets the radius of the danger zone.
	 * @return the radius of the danger zone
	 */
	public double getRadius() {
		return this.radius;
	}
	
	/**
	 * Gets the center point of the danger zone.
	 * @return the center of the danger zone as a Vector2d
	 */
	public Vector2d getCenter() {
		return this.center;
	}

}
