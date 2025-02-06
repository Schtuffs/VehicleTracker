package com.belgianwaffles.vehicletracker;
public class Vector2D {

    private double mX, mY;

    public Vector2D(double x, double y) {
        this.mX = x;
        this.mY = y;
    }

    public void SetX(double x) {
        this.mX = x;
    }

    public double GetX() {
        return this.mX;
    }
    
    public void SetY(double y) {
        this.mY = y;
    }

    public double GetY() {
        return this.mY;
    }
}
