
package com.models.availtrips;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BoardingTime {

    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("bpId")
    @Expose
    private String bpId;
    @SerializedName("bpName")
    @Expose
    private String bpName;
    @SerializedName("contactNumber")
    @Expose
    private String contactNumber;
    @SerializedName("landmark")
    @Expose
    private String landmark;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("prime")
    @Expose
    private String prime;
    @SerializedName("time")
    @Expose
    private String time;

    public String getAddress(String address) {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBpId(String bpId) {
        return this.bpId;
    }

    public void setBpId(String bpId) {
        this.bpId = bpId;
    }

    public String getBpName() {
        return bpName;
    }

    public void setBpName(String bpName) {
        this.bpName = bpName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPrime() {
        return prime;
    }

    public void setPrime(String prime) {
        this.prime = prime;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
