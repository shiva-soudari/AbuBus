
package com.models.availtrips;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AvaiTripsData {

    @SerializedName("availableTrips")
    @Expose
    private List<AvailableTrip> availableTrips = null;

    public List<AvailableTrip> getAvailableTrips() {
        return availableTrips;
    }

    public void setAvailableTrips(List<AvailableTrip> availableTrips) {
        this.availableTrips = availableTrips;
    }
}
