package com.belgianwaffles.vehicletracker;

/**
 * A callback interface.
 *
 * @author Kyle
 */
public interface Callback {
    

	/**
	 * @param obj
	 */
	public void onSet(Object obj);

    /**
     * Executes the callback with the provided Vector2d parameter.
     *
     * @param param a Vector2d parameter to be passed to the callback
     */
    public void call(Vector2d param);
}
