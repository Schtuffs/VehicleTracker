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
	/**
	 * Changes the position od the vehicle
	 * @param Vector2dnewPosition
	 */
	public void changeLocation(Vector2d newPosition) {
		this.mPosition = newPosition;
		this.callCallbacks();
	}
	
	/**
	 * Returns the position
	 * @return the current position
	 */
	public Vector2d getPosition() {
		return new Vector2d(this.mPosition);
	}

	/**
	 * Adds a callback to be executed when the position of the vehicle changes.
	 * The callback is immediately called with the current position.
	 * @param param the callback to add
	 */
	@Override
	public void addCallback(Callback param) {
		param.onSet(this.mPosition);
		this.mCallbacks.add(param);
	}

	/**
	 * Executes all callbacks with the current position.
	 */
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
	
	/**
	 * Removes all callbacks from the list of callbacks to be executed on position changes.
	 */
	@Override
	public void removeCallback() {
		this.mCallbacks.clear();
	}

	/**
	 * Removes a single callback from the list of callbacks to be executed on position changes.
	 * @param callback the callback to remove
	 */
	@Override
	public void removeCallback(Callback callback) {
		this.mCallbacks.remove(callback);
	}
}
