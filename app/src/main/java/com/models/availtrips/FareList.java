package com.models.availtrips;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Arrays;
import java.util.List;

public class FareList
{
    public List<FareDetails> getFareDetails() {
        return fareDetails;
    }

    public void setFareDetails(List<FareDetails> fareDetails) {
        this.fareDetails = fareDetails;
    }

    @SerializedName("fareDetails")
    @Expose
    private List<FareDetails> fareDetails;

}
