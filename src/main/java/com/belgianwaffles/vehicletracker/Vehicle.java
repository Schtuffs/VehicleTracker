package com.belgianwaffles.vehicletracker;

import java.util.ArrayList;

public class Vehicle implements Observable {
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
	
	// Changes position, then calls callbacks
	public void changeLocation(Vector2d newPosition) {
		this.mPosition = newPosition;
		this.callCallbacks();
	}
	
	// Returns the position
	public Vector2d getPosition() {
		return new Vector2d(this.mPosition);
	}

	@Override
	public void addCallback(Callback param) {
		param.onSet(this.mPosition);
		this.mCallbacks.add(param);
	}

	@Override
	public void callCallbacks() {
		// Check for no callbacks
		if (this.mCallbacks.size() == 0) {
			System.out.println("No callbacks");
			return;
		}

		// Loop through callbacks
		for (Callback callback : this.mCallbacks) {
			callback.call(this.mPosition);
		}
	}
	
	@Override
	public void removeCallback() {
		this.mCallbacks.clear();
	}

	@Override
	public void removeCallback(Callback callback) {
		this.mCallbacks.remove(callback);
	}
}
