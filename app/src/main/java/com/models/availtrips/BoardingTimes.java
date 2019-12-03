package com.models.availtrips;

import com.google.gson.annotations.SerializedName;

public class BoardingTimes {
    @SerializedName("time")
    private String time;
    @SerializedName("prime")
    private String prime;
    @SerializedName("location")
    private String location;
    @SerializedName("landmark")
    private String landmark;
    @SerializedName("contactNumber")
    private String contactNumber;
    @SerializedName("bpName")
    private String bpName;
    @SerializedName("bpId")
    private String bpId;
    @SerializedName("address")
    private String address;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPrime() {
        return prime;
    }

    public void setPrime(String prime) {
        this.prime = prime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getBpName() {
        return bpName;
    }

    public void setBpName(String bpName) {
        this.bpName = bpName;
    }

    public String getBpId() {
        return bpId;
    }

    public void setBpId(String bpId) {
        this.bpId = bpId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
