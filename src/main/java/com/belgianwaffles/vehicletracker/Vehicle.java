package com.belgianwaffles.vehicletracker;

import java.util.ArrayList;

public class Vehicle {
	private Vector2d mPosition;
	private ArrayList<Callback> mCallbacks;
	
	// Start with default vector position
	public Vehicle() {
		this(new Vector2d());
	}
	
	// Starts vehicle at given position
	public Vehicle(Vector2d startPosition) {
		this.mPosition = startPosition;
		this.mCallbacks = new ArrayList<>();
	}
	
	public void changePosition(Vector2d newPosition) {
		this.mPosition = newPosition;
		this.callCallbacks();
	}
	
	public Vector2d getPosition() {
		return this.mPosition;
	}

	public void addCallback(Callback callback) {
		this.mCallbacks.add(callback);
	}

	private void callCallbacks() {
		for (Callback callback : this.mCallbacks) {
			callback.callback(this.mPosition);
		}
	}
}
