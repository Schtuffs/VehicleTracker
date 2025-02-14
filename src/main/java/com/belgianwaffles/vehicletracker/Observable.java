package com.belgianwaffles.vehicletracker;

public interface Observable {
    public void addCallback(Callback callback);
    public void callCallbacks();
    public void removeCallback();
    public void removeCallback(Callback callback);
}
