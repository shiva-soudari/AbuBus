package com.models.availtrips;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public  class responce {
    @SerializedName("mTicketEnabled")
    private String mTicketEnabled;
    @SerializedName("zeroCancellationTime")
    private String zeroCancellationTime;
    @SerializedName("viaRoutes")
    private String viaRoutes;
    @SerializedName("vehicleType")
    private String vehicleType;
    @SerializedName("travels")
    private String travels;
    @SerializedName("tatkalTime")
    private String tatkalTime;
    @SerializedName("source")
    private String source;
    @SerializedName("sleeper")
    private String sleeper;
    @SerializedName("singleLadies")
    private String singleLadies;
    @SerializedName("selfInventory")
    private String selfInventory;
    @SerializedName("seater")
    private String seater;
    @SerializedName("rtc")
    private String rtc;
    @SerializedName("routeId")
    private String routeId;
    @SerializedName("primaryPaxCancellable")
    private String primaryPaxCancellable;
    @SerializedName("partnerBaseCommission")
    private String partnerBaseCommission;
    @SerializedName("partialCancellationAllowed")
    private String partialCancellationAllowed;
    @SerializedName("otgPolicy")
    private String otgPolicy;
    @SerializedName("otgEnabled")
    private String otgEnabled;
    @SerializedName("operator")
    private String operator;
    @SerializedName("nonAC")
    private String nonAC;
    @SerializedName("maxSeatsPerTicket")
    private String maxSeatsPerTicket;
    @SerializedName("liveTrackingAvailable")
    private String liveTrackingAvailable;
    @SerializedName("idProofRequired")
    private String idProofRequired;
    @SerializedName("id")
    private String id;
    @SerializedName("gdsCommission")
    private String gdsCommission;
    @SerializedName("flatComApplicable")
    private String flatComApplicable;
    @SerializedName("dropPointMandatory")
    private String dropPointMandatory;
    @SerializedName("doj")
    private String doj;
    @SerializedName("destination")
    private String destination;
    @SerializedName("departureTime")
    private String departureTime;
    @SerializedName("cancellationPolicy")
    private String cancellationPolicy;
    @SerializedName("busTypeId")
    private String busTypeId;
    @SerializedName("busType")
    private String busType;
    @SerializedName("busServiceId")
    private String busServiceId;
    @SerializedName("busRoutes")
    private String busRoutes;
    @SerializedName("busImageCount")
    private String busImageCount;
    @SerializedName("bpDpSeatLayout")
    private String bpDpSeatLayout;
    @SerializedName("bookable")
    private String bookable;
    @SerializedName("avlWindowSeats")
    private String avlWindowSeats;
    @SerializedName("availableSeats")
    private String availableSeats;
    @SerializedName("availSrCitizen")
    private String availSrCitizen;
    @SerializedName("availCatCard")
    private String availCatCard;
    @SerializedName("arrivalTime")
    private String arrivalTime;
    @SerializedName("AC")
    private String AC;

    @SerializedName("fareDetails")
    private Object fareDetails;

    private FareDetails objfareDetails;

    private ArrayList<FareDetails> arradetails;

    public FareDetails getObjfareDetails() {
        return objfareDetails;
    }

    public void setObjfareDetails(FareDetails objfareDetails) {
        this.objfareDetails = objfareDetails;
    }

    public ArrayList<FareDetails> getArradetails() {
        return arradetails;
    }

    public void setArradetails(ArrayList<FareDetails> arradetails) {
        this.arradetails = arradetails;
    }

    public String getmTicketEnabled() {
        return mTicketEnabled;
    }

    public void setmTicketEnabled(String mTicketEnabled) {
        this.mTicketEnabled = mTicketEnabled;
    }

    public Object getFareDetails() {
        return fareDetails;
    }

    public void setFareDetails(Object fareDetails) {
        this.fareDetails = fareDetails;
    }

    public String getMTicketEnabled() {
        return mTicketEnabled;
    }

    public void setMTicketEnabled(String mTicketEnabled) {
        this.mTicketEnabled = mTicketEnabled;
    }

    public String getZeroCancellationTime() {
        return zeroCancellationTime;
    }

    public void setZeroCancellationTime(String zeroCancellationTime) {
        this.zeroCancellationTime = zeroCancellationTime;
    }

    public String getViaRoutes() {
        return viaRoutes;
    }

    public void setViaRoutes(String viaRoutes) {
        this.viaRoutes = viaRoutes;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getTravels() {
        return travels;
    }

    public void setTravels(String travels) {
        this.travels = travels;
    }

    public String getTatkalTime() {
        return tatkalTime;
    }

    public void setTatkalTime(String tatkalTime) {
        this.tatkalTime = tatkalTime;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSleeper() {
        return sleeper;
    }

    public void setSleeper(String sleeper) {
        this.sleeper = sleeper;
    }

    public String getSingleLadies() {
        return singleLadies;
    }

    public void setSingleLadies(String singleLadies) {
        this.singleLadies = singleLadies;
    }

    public String getSelfInventory() {
        return selfInventory;
    }

    public void setSelfInventory(String selfInventory) {
        this.selfInventory = selfInventory;
    }

    public String getSeater() {
        return seater;
    }

    public void setSeater(String seater) {
        this.seater = seater;
    }

    public String getRtc() {
        return rtc;
    }

    public void setRtc(String rtc) {
        this.rtc = rtc;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getPrimaryPaxCancellable() {
        return primaryPaxCancellable;
    }

    public void setPrimaryPaxCancellable(String primaryPaxCancellable) {
        this.primaryPaxCancellable = primaryPaxCancellable;
    }

    public String getPartnerBaseCommission() {
        return partnerBaseCommission;
    }

    public void setPartnerBaseCommission(String partnerBaseCommission) {
        this.partnerBaseCommission = partnerBaseCommission;
    }

    public String getPartialCancellationAllowed() {
        return partialCancellationAllowed;
    }

    public void setPartialCancellationAllowed(String partialCancellationAllowed) {
        this.partialCancellationAllowed = partialCancellationAllowed;
    }

    public String getOtgPolicy() {
        return otgPolicy;
    }

    public void setOtgPolicy(String otgPolicy) {
        this.otgPolicy = otgPolicy;
    }

    public String getOtgEnabled() {
        return otgEnabled;
    }

    public void setOtgEnabled(String otgEnabled) {
        this.otgEnabled = otgEnabled;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getNonAC() {
        return nonAC;
    }

    public void setNonAC(String nonAC) {
        this.nonAC = nonAC;
    }

    public String getMaxSeatsPerTicket() {
        return maxSeatsPerTicket;
    }

    public void setMaxSeatsPerTicket(String maxSeatsPerTicket) {
        this.maxSeatsPerTicket = maxSeatsPerTicket;
    }

    public String getLiveTrackingAvailable() {
        return liveTrackingAvailable;
    }

    public void setLiveTrackingAvailable(String liveTrackingAvailable) {
        this.liveTrackingAvailable = liveTrackingAvailable;
    }

    public String getIdProofRequired() {
        return idProofRequired;
    }

    public void setIdProofRequired(String idProofRequired) {
        this.idProofRequired = idProofRequired;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGdsCommission() {
        return gdsCommission;
    }

    public void setGdsCommission(String gdsCommission) {
        this.gdsCommission = gdsCommission;
    }

    public String getFlatComApplicable() {
        return flatComApplicable;
    }

    public void setFlatComApplicable(String flatComApplicable) {
        this.flatComApplicable = flatComApplicable;
    }

    public String getDropPointMandatory() {
        return dropPointMandatory;
    }

    public void setDropPointMandatory(String dropPointMandatory) {
        this.dropPointMandatory = dropPointMandatory;
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getCancellationPolicy() {
        return cancellationPolicy;
    }

    public void setCancellationPolicy(String cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }

    public String getBusTypeId() {
        return busTypeId;
    }

    public void setBusTypeId(String busTypeId) {
        this.busTypeId = busTypeId;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public String getBusServiceId() {
        return busServiceId;
    }

    public void setBusServiceId(String busServiceId) {
        this.busServiceId = busServiceId;
    }

    public String getBusRoutes() {
        return busRoutes;
    }

    public void setBusRoutes(String busRoutes) {
        this.busRoutes = busRoutes;
    }

    public String getBusImageCount() {
        return busImageCount;
    }

    public void setBusImageCount(String busImageCount) {
        this.busImageCount = busImageCount;
    }

    public String getBpDpSeatLayout() {
        return bpDpSeatLayout;
    }

    public void setBpDpSeatLayout(String bpDpSeatLayout) {
        this.bpDpSeatLayout = bpDpSeatLayout;
    }

    public String getBookable() {
        return bookable;
    }

    public void setBookable(String bookable) {
        this.bookable = bookable;
    }

    public String getAvlWindowSeats() {
        return avlWindowSeats;
    }

    public void setAvlWindowSeats(String avlWindowSeats) {
        this.avlWindowSeats = avlWindowSeats;
    }

    public String getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(String availableSeats) {
        this.availableSeats = availableSeats;
    }

    public String getAvailSrCitizen() {
        return availSrCitizen;
    }

    public void setAvailSrCitizen(String availSrCitizen) {
        this.availSrCitizen = availSrCitizen;
    }

    public String getAvailCatCard() {
        return availCatCard;
    }

    public void setAvailCatCard(String availCatCard) {
        this.availCatCard = availCatCard;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getAC() {
        return AC;
    }

    public void setAC(String AC) {
        this.AC = AC;
    }
}

