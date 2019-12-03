package com.models.availtrips;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class availalabletrip {
    @SerializedName("availableTrips")
    private ArrayList<responce> responces;

    public ArrayList<responce> getResponces() {
        return responces;
    }

    public void setResponces(ArrayList<responce> responces) {
        this.responces = responces;
    }
}
