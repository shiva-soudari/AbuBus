
package com.models.availtrips;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AvailableTrip {

    @SerializedName("AC")
    @Expose
    private String aC;

    @SerializedName("arrivalTime")
    @Expose
    private String arrivalTime;
    @SerializedName("availCatCard")
    @Expose
    private String availCatCard;
    @SerializedName("availSrCitizen")
    @Expose
    private String availSrCitizen;
    @SerializedName("availableSeats")
    @Expose
    private String availableSeats;
    @SerializedName("avlWindowSeats")
    @Expose
    private String avlWindowSeats;
    @SerializedName("boardingTimes")
    @Expose
    private List<BoardingTime> boardingTimes = null;
    @SerializedName("bookable")
    @Expose
    private String bookable;
    @SerializedName("bpDpSeatLayout")
    @Expose
    private String bpDpSeatLayout;
    @SerializedName("busImageCount")
    @Expose
    private String busImageCount;
    @SerializedName("busRoutes")
    @Expose
    private String busRoutes;
    @SerializedName("busServiceId")
    @Expose
    private String busServiceId;
    @SerializedName("busType")
    @Expose
    private String busType;
    @SerializedName("busTypeId")
    @Expose
    private String busTypeId;
    @SerializedName("cancellationPolicy")
    @Expose
    private String cancellationPolicy;
    @SerializedName("departureTime")
    @Expose
    private String departureTime;
    @SerializedName("destination")
    @Expose
    private String destination;
    @SerializedName("doj")
    @Expose
    private String doj;
    @SerializedName("dropPointMandatory")
    @Expose
    private String dropPointMandatory;
    @SerializedName("droppingTimes")
    @Expose
    private List<DroppingTime> droppingTimes = null;

    @SerializedName("fareDetails")
    @Expose
    private List<FareList> fareDetails;

    @SerializedName("fares")
    @Expose
    private String fares;
    @SerializedName("flatComApplicable")
    @Expose
    private String flatComApplicable;
    @SerializedName("gdsCommission")
    @Expose
    private String gdsCommission;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("idProofRequired")
    @Expose
    private String idProofRequired;
    @SerializedName("liveTrackingAvailable")
    @Expose
    private String liveTrackingAvailable;
    @SerializedName("maxSeatsPerTicket")
    @Expose
    private String maxSeatsPerTicket;
    @SerializedName("nonAC")
    @Expose
    private String nonAC;
    @SerializedName("operator")
    @Expose
    private String operator;
    @SerializedName("otgEnabled")
    @Expose
    private String otgEnabled;
    @SerializedName("otgPolicy")
    @Expose
    private String otgPolicy;
    @SerializedName("partialCancellationAllowed")
    @Expose
    private String partialCancellationAllowed;
    @SerializedName("partnerBaseCommission")
    @Expose
    private String partnerBaseCommission;
    @SerializedName("primaryPaxCancellable")
    @Expose
    private String primaryPaxCancellable;
    @SerializedName("routeId")
    @Expose
    private String routeId;
    @SerializedName("rtc")
    @Expose
    private String rtc;
    @SerializedName("seater")
    @Expose
    private String seater;
    @SerializedName("selfInventory")
    @Expose
    private String selfInventory;
    @SerializedName("singleLadies")
    @Expose
    private String singleLadies;
    @SerializedName("sleeper")
    @Expose
    private String sleeper;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("tatkalTime")
    @Expose
    private String tatkalTime;
    @SerializedName("travels")
    @Expose
    private String travels;
    @SerializedName("vehicleType")
    @Expose
    private String vehicleType;
    @SerializedName("viaRoutes")
    @Expose
    private String viaRoutes;
    @SerializedName("zeroCancellationTime")
    @Expose
    private String zeroCancellationTime;
    @SerializedName("mTicketEnabled")
    @Expose
    private String mTicketEnabled;

    public String getAC() {
        return aC;
    }

    public void setAC(String aC) {
        this.aC = aC;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getAvailCatCard() {
        return availCatCard;
    }

    public void setAvailCatCard(String availCatCard) {
        this.availCatCard = availCatCard;
    }

    public String getAvailSrCitizen() {
        return availSrCitizen;
    }

    public void setAvailSrCitizen(String availSrCitizen) {
        this.availSrCitizen = availSrCitizen;
    }

    public String getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(String availableSeats) {
        this.availableSeats = availableSeats;
    }

    public String getAvlWindowSeats() {
        return avlWindowSeats;
    }

    public void setAvlWindowSeats(String avlWindowSeats) {
        this.avlWindowSeats = avlWindowSeats;
    }

    public List<BoardingTime> getBoardingTimes() {
        return boardingTimes;
    }

    public void setBoardingTimes(List<BoardingTime> boardingTimes) {
        this.boardingTimes = boardingTimes;
    }

    public String getBookable() {
        return bookable;
    }

    public void setBookable(String bookable) {
        this.bookable = bookable;
    }

    public String getBpDpSeatLayout() {
        return bpDpSeatLayout;
    }

    public void setBpDpSeatLayout(String bpDpSeatLayout) {
        this.bpDpSeatLayout = bpDpSeatLayout;
    }

    public String getBusImageCount() {
        return busImageCount;
    }

    public void setBusImageCount(String busImageCount) {
        this.busImageCount = busImageCount;
    }

    public String getBusRoutes() {
        return busRoutes;
    }

    public void setBusRoutes(String busRoutes) {
        this.busRoutes = busRoutes;
    }

    public String getBusServiceId() {
        return busServiceId;
    }

    public void setBusServiceId(String busServiceId) {
        this.busServiceId = busServiceId;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public String getBusTypeId() {
        return busTypeId;
    }

    public void setBusTypeId(String busTypeId) {
        this.busTypeId = busTypeId;
    }

    public String getCancellationPolicy() {
        return cancellationPolicy;
    }

    public void setCancellationPolicy(String cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }

    public String getDropPointMandatory() {
        return dropPointMandatory;
    }

    public void setDropPointMandatory(String dropPointMandatory) {
        this.dropPointMandatory = dropPointMandatory;
    }

    public List<DroppingTime> getDroppingTimes() {
        return droppingTimes;
    }

    public void setDroppingTimes(List<DroppingTime> droppingTimes) {
        this.droppingTimes = droppingTimes;
    }

    public List<FareList> getFareDetails() {
        return fareDetails;
    }

    public void setFareDetails(List<FareList> fareDetails) {
        this.fareDetails = fareDetails;
    }

    public String getFares() {
        return fares;
    }

    public void setFares(String fares) {
        this.fares = fares;
    }

    public String getFlatComApplicable() {
        return flatComApplicable;
    }

    public void setFlatComApplicable(String flatComApplicable) {
        this.flatComApplicable = flatComApplicable;
    }

    public String getGdsCommission() {
        return gdsCommission;
    }

    public void setGdsCommission(String gdsCommission) {
        this.gdsCommission = gdsCommission;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdProofRequired() {
        return idProofRequired;
    }

    public void setIdProofRequired(String idProofRequired) {
        this.idProofRequired = idProofRequired;
    }

    public String getLiveTrackingAvailable() {
        return liveTrackingAvailable;
    }

    public void setLiveTrackingAvailable(String liveTrackingAvailable) {
        this.liveTrackingAvailable = liveTrackingAvailable;
    }

    public String getMaxSeatsPerTicket() {
        return maxSeatsPerTicket;
    }

    public void setMaxSeatsPerTicket(String maxSeatsPerTicket) {
        this.maxSeatsPerTicket = maxSeatsPerTicket;
    }

    public String getNonAC() {
        return nonAC;
    }

    public void setNonAC(String nonAC) {
        this.nonAC = nonAC;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOtgEnabled() {
        return otgEnabled;
    }

    public void setOtgEnabled(String otgEnabled) {
        this.otgEnabled = otgEnabled;
    }

    public String getOtgPolicy() {
        return otgPolicy;
    }

    public void setOtgPolicy(String otgPolicy) {
        this.otgPolicy = otgPolicy;
    }

    public String getPartialCancellationAllowed() {
        return partialCancellationAllowed;
    }

    public void setPartialCancellationAllowed(String partialCancellationAllowed) {
        this.partialCancellationAllowed = partialCancellationAllowed;
    }

    public String getPartnerBaseCommission() {
        return partnerBaseCommission;
    }

    public void setPartnerBaseCommission(String partnerBaseCommission) {
        this.partnerBaseCommission = partnerBaseCommission;
    }

    public String getPrimaryPaxCancellable() {
        return primaryPaxCancellable;
    }

    public void setPrimaryPaxCancellable(String primaryPaxCancellable) {
        this.primaryPaxCancellable = primaryPaxCancellable;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getRtc() {
        return rtc;
    }

    public void setRtc(String rtc) {
        this.rtc = rtc;
    }

    public String getSeater() {
        return seater;
    }

    public void setSeater(String seater) {
        this.seater = seater;
    }

    public String getSelfInventory() {
        return selfInventory;
    }

    public void setSelfInventory(String selfInventory) {
        this.selfInventory = selfInventory;
    }

    public String getSingleLadies() {
        return singleLadies;
    }

    public void setSingleLadies(String singleLadies) {
        this.singleLadies = singleLadies;
    }

    public String getSleeper() {
        return sleeper;
    }

    public void setSleeper(String sleeper) {
        this.sleeper = sleeper;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTatkalTime() {
        return tatkalTime;
    }

    public void setTatkalTime(String tatkalTime) {
        this.tatkalTime = tatkalTime;
    }

    public String getTravels() {
        return travels;
    }

    public void setTravels(String travels) {
        this.travels = travels;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getViaRoutes() {
        return viaRoutes;
    }

    public void setViaRoutes(String viaRoutes) {
        this.viaRoutes = viaRoutes;
    }

    public String getZeroCancellationTime() {
        return zeroCancellationTime;
    }

    public void setZeroCancellationTime(String zeroCancellationTime) {
        this.zeroCancellationTime = zeroCancellationTime;
    }

    public String getMTicketEnabled() {
        return mTicketEnabled;
    }

    public void setMTicketEnabled(String mTicketEnabled) {
        this.mTicketEnabled = mTicketEnabled;
    }

}
