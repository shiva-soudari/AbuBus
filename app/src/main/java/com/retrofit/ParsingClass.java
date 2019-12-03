package com.retrofit;

import android.util.Log;

import com.models.availtrips.AvailableTrip;
import com.models.availtrips.BoardingTime;
import com.models.availtrips.Data;
import com.models.availtrips.DroppingTime;
import com.models.availtrips.FareDetails;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ParsingClass {

    public static void getAvailTrips(String Response)
    {
        List<AvailableTrip> availableTrips_list =new ArrayList<>();
        List<FareDetails> fareList =new ArrayList<>();
        List<BoardingTime> boardingTimes_list =new ArrayList<>();
        List<DroppingTime> droppingTimes_list =new ArrayList<>();

        System.out.println("Json_response:------"+Response);

        String fare_amount = null;
        int m;

        JSONArray mainArray= null;

        JSONArray boardingTimes_array = null;
        JSONArray dropingTimes_array = null;
        JSONArray faredetails_array = null;
        JSONArray fares_array = null;

        JSONObject obj = null;
        JSONObject boardingTime_obj = null;
        JSONObject boardingTime_obj1 = null;
        JSONObject dropingTimes_obj = null;
        JSONObject dropingTimes_obj1 = null;
        JSONObject faredetauils_obj = null;
        JSONObject faredeatils_obj1 = null;
        JSONObject fares_obj = null;

        try {

            availableTrips_list.clear();

            mainArray = new JSONArray(Response);

            for(int i=0;i<mainArray.length();i++) {

                try {

                    //JSONObject obj= (JSONObject) mainArray.get(i);
                    obj = mainArray.getJSONObject(i);
                    AvailableTrip trip = new AvailableTrip();

                    trip.setAC(obj.getString("AC"));
                    trip.setArrivalTime(obj.getString("arrivalTime"));
                    trip.setAvailCatCard(obj.getString("availCatCard"));
                    trip.setAvailSrCitizen(obj.getString("availSrCitizen"));
                    trip.setAvailableSeats(obj.getString("availableSeats"));
                    trip.setAvlWindowSeats(obj.getString("avlWindowSeats"));

                    trip.setBookable(obj.getString("bookable"));
                    trip.setBpDpSeatLayout(obj.getString("bpDpSeatLayout"));
                    trip.setBusImageCount(obj.getString("busImageCount"));
                    trip.setBusRoutes(obj.getString("busRoutes"));
                    trip.setBusServiceId(obj.getString("busServiceId"));
                    trip.setBusType(obj.getString("busType"));
                    trip.setBusTypeId(obj.getString("busTypeId"));
                    trip.setCancellationPolicy(obj.getString("cancellationPolicy"));
                    trip.setDepartureTime(obj.getString("departureTime"));
                    trip.setDestination(obj.getString("destination"));
                    trip.setDoj(obj.getString("doj"));
                    trip.setDropPointMandatory(obj.getString("dropPointMandatory"));
                    trip.setFlatComApplicable(obj.getString("flatComApplicable"));
                    trip.setGdsCommission(obj.getString("gdsCommission"));
                    trip.setId(obj.getString("id"));
                    trip.setIdProofRequired(obj.getString("idProofRequired"));
                    trip.setLiveTrackingAvailable(obj.getString("liveTrackingAvailable"));
                    trip.setMaxSeatsPerTicket(obj.getString("maxSeatsPerTicket"));
                    trip.setNonAC(obj.getString("nonAC"));
                    trip.setOperator(obj.getString("operator"));
                    trip.setOtgEnabled(obj.getString("otgEnabled"));
                    trip.setOtgPolicy(obj.getString("otgPolicy"));
                    trip.setPartialCancellationAllowed(obj.getString("partialCancellationAllowed"));
                    trip.setPartnerBaseCommission(obj.getString("partnerBaseCommission"));
                    trip.setPrimaryPaxCancellable(obj.getString("primaryPaxCancellable"));
                    trip.setRouteId(obj.getString("routeId"));
                    trip.setRtc(obj.getString("rtc"));
                    trip.setSeater(obj.getString("seater"));
                    trip.setSelfInventory(obj.getString("selfInventory"));
                    trip.setSingleLadies(obj.getString("singleLadies"));
                    trip.setSleeper(obj.getString("sleeper"));
                    trip.setSource(obj.getString("source"));
                    trip.setTatkalTime(obj.getString("tatkalTime"));
                    trip.setTravels(obj.getString("travels"));
                    trip.setVehicleType(obj.getString("vehicleType"));
                    trip.setViaRoutes(obj.getString("viaRoutes"));
                    trip.setZeroCancellationTime(obj.getString("zeroCancellationTime"));
                    trip.setMTicketEnabled(obj.getString("mTicketEnabled"));

                    availableTrips_list.add(trip);

                }catch (Exception ex){

                }

                //Boarding_Times
                boardingTimes_list.clear();

                try {
                    boardingTimes_array = obj.getJSONArray("boardingTimes");
                    for (int j = 0; j<boardingTimes_array.length(); j++){

                        boardingTime_obj = (JSONObject) boardingTimes_array.get(j);
                        BoardingTime boardingTime = new BoardingTime();

                        boardingTime.setAddress(boardingTime_obj.getString("address"));
                        boardingTime.setBpId(boardingTime_obj.getString("bpId"));
                        boardingTime.setBpName(boardingTime_obj.getString("bpName"));
                        boardingTime.setContactNumber(boardingTime_obj.getString("contactNumber"));
                        boardingTime.setLandmark(boardingTime_obj.getString("landmark"));
                        boardingTime.setLocation(boardingTime_obj.getString("location"));
                        boardingTime.setPrime(boardingTime_obj.getString("prime"));
                        boardingTime.setTime(boardingTime_obj.getString("time"));

                        //System.out.println("BoardingTimes_Array_Size:------"+boardingTimes_array.length());

                        boardingTimes_list.add(boardingTime);

                    }
                }catch (Exception e){
                    boardingTime_obj1 = obj.getJSONObject("boardingTimes");

                    BoardingTime boardingTime = new BoardingTime();

                    boardingTime.setAddress(boardingTime_obj1.getString("address"));
                    boardingTime.setBpId(boardingTime_obj1.getString("bpId"));
                    boardingTime.setBpName(boardingTime_obj1.getString("bpName"));
                    boardingTime.setContactNumber(boardingTime_obj1.getString("contactNumber"));
                    boardingTime.setLandmark(boardingTime_obj1.getString("landmark"));
                    boardingTime.setLocation(boardingTime_obj1.getString("location"));
                    boardingTime.setPrime(boardingTime_obj1.getString("prime"));
                    boardingTime.setTime(boardingTime_obj1.getString("time"));

                    //System.out.println("BoardingTimes_Object_Size:------"+boardingTime.getContactNumber());

                    boardingTimes_list.add(boardingTime);
                }

                //Droping_Times

                try {
                    dropingTimes_array = obj.getJSONArray("droppingTimes");
                    for (int j = 0; j<dropingTimes_array.length();j++){

                        dropingTimes_obj = (JSONObject) dropingTimes_array.get(j);
                        DroppingTime droppingTime = new DroppingTime();

                        droppingTime.setAddress(dropingTimes_obj.getString("address"));
                        droppingTime.setBpId(dropingTimes_obj.getString("bpId"));
                        droppingTime.setBpName(dropingTimes_obj.getString("bpName"));
                        droppingTime.setContactNumber(dropingTimes_obj.getString("contactNumber"));
                        droppingTime.setLandmark(dropingTimes_obj.getString("landmark"));
                        droppingTime.setLocation(dropingTimes_obj.getString("location"));
                        droppingTime.setPrime(dropingTimes_obj.getString("prime"));
                        droppingTime.setTime(dropingTimes_obj.getString("time"));

                        droppingTimes_list.add(droppingTime);

                    }

                    //System.out.println("DropingTimes_Array_Size:------"+dropingTimes_array.length());

                }catch (Exception e){

                        dropingTimes_obj1 = obj.getJSONObject("droppingTimes");

                        DroppingTime droppingTime = new DroppingTime();

                        droppingTime.setAddress(dropingTimes_obj1.getString("address"));
                        droppingTime.setBpId(dropingTimes_obj1.getString("bpId"));
                        droppingTime.setBpName(dropingTimes_obj1.getString("bpName"));
                        droppingTime.setContactNumber(dropingTimes_obj1.getString("contactNumber"));
                        droppingTime.setLandmark(dropingTimes_obj1.getString("landmark"));
                        droppingTime.setLocation(dropingTimes_obj1.getString("location"));
                        droppingTime.setPrime(dropingTimes_obj1.getString("prime"));
                        droppingTime.setTime(dropingTimes_obj1.getString("time"));

                        //System.out.println("DropingTimes_Obj_Size:------"+dropingTimes_obj1.toString());

                        droppingTimes_list.add(droppingTime);

                }

                //FareDetails

                try {

                    faredetails_array = obj.getJSONArray("fareDetails");
                    for (int j = 0; j<faredetails_array.length();j++){

                        faredetauils_obj = faredetails_array.getJSONObject(j);
                        FareDetails faredetails = new FareDetails();

                        faredetails.setBankTrexAmt(faredetauils_obj.getString("bankTrexAmt"));
                        faredetails.setBaseFare(faredetauils_obj.getString("baseFare"));
                        faredetails.setBookingFee(faredetauils_obj.getString("bookingFee"));
                        faredetails.setChildFare(faredetauils_obj.getString("childFare"));
                        faredetails.setLevyFare(faredetauils_obj.getString("levyFare"));
                        faredetails.setMarkupFareAbsolute(faredetauils_obj.getString("markupFareAbsolute"));
                        faredetails.setMarkupFarePercentage(faredetauils_obj.getString("markupFarePercentage"));
                        faredetails.setOperatorServiceChargeAbsolute(faredetauils_obj.getString("operatorServiceChargeAbsolute"));
                        faredetails.setOperatorServiceChargePercentage(faredetauils_obj.getString("operatorServiceChargePercentage"));
                        faredetails.setServiceTaxAbsolute(faredetauils_obj.getString("serviceTaxAbsolute"));
                        faredetails.setServiceTaxPercentage(faredetauils_obj.getString("serviceTaxPercentage"));
                        faredetails.setSrtFee(faredetauils_obj.getString("srtFee"));
                        faredetails.setTollFee(faredetauils_obj.getString("tollFee"));
                        faredetails.setTotalFare(faredetauils_obj.getString("totalFare"));

                        //System.out.println("fareDeatails_Array_Size:------"+faredetails_array.length());

                        fareList.add(faredetails);

                    }

                }catch (Exception e){

                    try {
                        faredeatils_obj1 = obj.getJSONObject("fareDetails");

                        FareDetails faredetails = new FareDetails();

                        faredetails.setBankTrexAmt(faredeatils_obj1.getString("bankTrexAmt"));
                        faredetails.setBaseFare(faredeatils_obj1.getString("baseFare"));
                        faredetails.setBookingFee(faredeatils_obj1.getString("bookingFee"));
                        faredetails.setChildFare(faredeatils_obj1.getString("childFare"));
                        faredetails.setLevyFare(faredeatils_obj1.getString("levyFare"));
                        faredetails.setMarkupFareAbsolute(faredeatils_obj1.getString("markupFareAbsolute"));
                        faredetails.setMarkupFarePercentage(faredeatils_obj1.getString("markupFarePercentage"));
                        faredetails.setOperatorServiceChargeAbsolute(faredeatils_obj1.getString("operatorServiceChargeAbsolute"));
                        faredetails.setOperatorServiceChargePercentage(faredeatils_obj1.getString("operatorServiceChargePercentage"));
                        faredetails.setServiceTaxAbsolute(faredeatils_obj1.getString("serviceTaxAbsolute"));
                        faredetails.setServiceTaxPercentage(faredeatils_obj1.getString("serviceTaxPercentage"));
                        faredetails.setSrtFee(faredeatils_obj1.getString("srtFee"));
                        faredetails.setTollFee(faredeatils_obj1.getString("tollFee"));
                        faredetails.setTotalFare(faredeatils_obj1.getString("totalFare"));

                        //System.out.println("fareDeatails_Obj_Size:------"+faredeatils_obj1.toString());

                        fareList.add(faredetails);

                    }catch (Exception ex){

                    }

                }

                //Fares

                try {
                    fares_array = obj.getJSONArray("fares");
                    for (int k = 0; k <fares_array.length(); k ++){

                        fares_obj = (JSONObject) fares_array.get(k );
                        AvailableTrip availableTrip = new AvailableTrip();

                        System.out.println("array_fares_data:----"+fares_obj.toString());
                        Log.i("array_fares_data","array_fares_data:-----"+fares_obj.toString());

                    }

                    //System.out.println("Main_Array_Size:------"+fares_array.length());

                }catch (Exception e){

                    //JSONObject fares_str = obj.getJSONObject("fares");
                    //String data = fares_str.toString();
                    String data = obj.getString("fares");

                    String[] animalsArray = data.split(",");

                    for(m = 0; m<animalsArray.length; m++){
                        fare_amount = animalsArray[m];

                        if (fare_amount.contains("[")){
                            fare_amount = fare_amount.substring(1);
                        }else if(fare_amount.contains("]")){
                            fare_amount = fare_amount.substring(0, fare_amount.length() - 1);
                        }

                        //System.out.println("string_fares_data----"+fare_amount.toString());
                    }

                    //trip.setFares(obj.getString(fare_amount));
                }

            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

        System.out.println("Main_data:-----"+mainArray.length());
        System.out.println("BoardingTimes_Array_Size:-----"+boardingTimes_array.length());
        System.out.println("BoardingTimes_Object_Size:----"+boardingTime_obj1.toString());
        System.out.println("DropingTimes_Array_Size:----"+dropingTimes_array.length());
        System.out.println("DropingTimes_Obj_Size:----"+dropingTimes_obj1.toString());
        System.out.println("fareDeatails_Array_Size:-----"+faredetails_array.length());
        System.out.println("fareDeatails_Obj_Size:-----"+faredeatils_obj1.toString());
        System.out.println("string_fares_data:-----"+fare_amount.toString());

        System.out.println("AvailableTrips_Data:-----"+availableTrips_list.size());
        System.out.println("BoardingTimes_Data:-----"+boardingTimes_list.size());
        System.out.println("DropingTime_Data:-----"+droppingTimes_list.size());
        System.out.println("FareDatails_Data:-----"+fareList.size());

        }

}
