package com.belgianwaffles.vehicletracker;
public class Vector2d {

    private double mX, mY;

    public Vector2d(Vector2d v) {
        this.mX = v.mX;
        this.mY = v.mY;
    }
    
    // Default vector position of (0, 0)
    public Vector2d() {
    	this(0, 0);
    }

	// Create vector at given position
    public Vector2d(double x, double y) {
        this.mX = x;
        this.mY = y;
    }

    public void setX(double x) {
        this.mX = x;
    }

    public double getX() {
        return this.mX;
    }
    
    public void setY(double y) {
        this.mY = y;
    }

    public double getY() {
        return this.mY;
    }

    @Override
    public String toString() {
        return "(" + this.mX + ", " + this.mY + ")";
    }
}
