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


    /**
     * returns the distance between self and the given vector
     * @param vector
     * @return the distance
     */
    public double distance(Vector2d vector) {
        return Math.sqrt(Math.pow((this.getX() - vector.getX()),2) + Math.pow(this.getY() - vector.getY(), 2));
    }

    /**
     * Sets the x-coordinate of this vector.
     * 
     * @param x the new x-coordinate value
     */

    public void setX(double x) {
        this.mX = x;
    }

    /**
     * Gets the x-coordinate of this vector.
     * 
     * @return the current x-coordinate value
     */
    public double getX() {
        return this.mX;
    }
    
    /**
     * Sets the y-coordinate of this vector.
     * 
     * @param y the new y-coordinate value
     */
    public void setY(double y) {
        this.mY = y;
    }

    /**
     * Gets the y-coordinate of this vector.
     * 
     * @return the current y-coordinate value
     */
    public double getY() {
        return this.mY;
    }

    /**
     * Converts the vector to a string representation, in the form of "(x, y)".
     * 
     * @return a string representation of the vector
     */
    @Override
    public String toString() {
        return "(" + this.mX + ", " + this.mY + ")";
    }
}
