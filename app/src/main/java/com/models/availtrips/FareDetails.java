
package com.models.availtrips;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FareDetails {

    @SerializedName("bankTrexAmt")
    @Expose
    private String bankTrexAmt;
    @SerializedName("baseFare")
    @Expose
    private String baseFare;
    @SerializedName("bookingFee")
    @Expose
    private String bookingFee;
    @SerializedName("childFare")
    @Expose
    private String childFare;
    @SerializedName("levyFare")
    @Expose
    private String levyFare;
    @SerializedName("markupFareAbsolute")
    @Expose
    private String markupFareAbsolute;
    @SerializedName("markupFarePercentage")
    @Expose
    private String markupFarePercentage;
    @SerializedName("operatorServiceChargeAbsolute")
    @Expose
    private String operatorServiceChargeAbsolute;
    @SerializedName("operatorServiceChargePercentage")
    @Expose
    private String operatorServiceChargePercentage;
    @SerializedName("serviceTaxAbsolute")
    @Expose
    private String serviceTaxAbsolute;
    @SerializedName("serviceTaxPercentage")
    @Expose
    private String serviceTaxPercentage;
    @SerializedName("srtFee")
    @Expose
    private String srtFee;
    @SerializedName("tollFee")
    @Expose
    private String tollFee;
    @SerializedName("totalFare")
    @Expose
    private String totalFare;

    public String getBankTrexAmt() {
        return bankTrexAmt;
    }

    public void setBankTrexAmt(String bankTrexAmt) {
        this.bankTrexAmt = bankTrexAmt;
    }

    public String getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(String baseFare) {
        this.baseFare = baseFare;
    }

    public String getBookingFee() {
        return bookingFee;
    }

    public void setBookingFee(String bookingFee) {
        this.bookingFee = bookingFee;
    }

    public String getChildFare() {
        return childFare;
    }

    public void setChildFare(String childFare) {
        this.childFare = childFare;
    }

    public String getLevyFare() {
        return levyFare;
    }

    public void setLevyFare(String levyFare) {
        this.levyFare = levyFare;
    }

    public String getMarkupFareAbsolute() {
        return markupFareAbsolute;
    }

    public void setMarkupFareAbsolute(String markupFareAbsolute) {
        this.markupFareAbsolute = markupFareAbsolute;
    }

    public String getMarkupFarePercentage() {
        return markupFarePercentage;
    }

    public void setMarkupFarePercentage(String markupFarePercentage) {
        this.markupFarePercentage = markupFarePercentage;
    }

    public String getOperatorServiceChargeAbsolute() {
        return operatorServiceChargeAbsolute;
    }

    public void setOperatorServiceChargeAbsolute(String operatorServiceChargeAbsolute) {
        this.operatorServiceChargeAbsolute = operatorServiceChargeAbsolute;
    }

    public String getOperatorServiceChargePercentage() {
        return operatorServiceChargePercentage;
    }

    public void setOperatorServiceChargePercentage(String operatorServiceChargePercentage) {
        this.operatorServiceChargePercentage = operatorServiceChargePercentage;
    }

    public String getServiceTaxAbsolute() {
        return serviceTaxAbsolute;
    }

    public void setServiceTaxAbsolute(String serviceTaxAbsolute) {
        this.serviceTaxAbsolute = serviceTaxAbsolute;
    }

    public String getServiceTaxPercentage() {
        return serviceTaxPercentage;
    }

    public void setServiceTaxPercentage(String serviceTaxPercentage) {
        this.serviceTaxPercentage = serviceTaxPercentage;
    }

    public String getSrtFee() {
        return srtFee;
    }

    public void setSrtFee(String srtFee) {
        this.srtFee = srtFee;
    }

    public String getTollFee() {
        return tollFee;
    }

    public void setTollFee(String tollFee) {
        this.tollFee = tollFee;
    }

    public String getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(String totalFare) {
        this.totalFare = totalFare;
    }

}
