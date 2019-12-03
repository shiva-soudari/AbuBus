package com.retrofit;

import com.google.gson.JsonObject;
import com.models.availtrips.AvaiTripsData;
import com.models.availtrips.AvailableTrip;
import com.models.availtrips.availalabletrip;
import com.models.cities.CityList;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface ApiInterface {

    @GET("/sources")
    Call<CityList> loginn();

    @GET("availabletrips?")
    Call<JsonObject> getAvailTrips(@QueryMap HashMap<String,String> params);


}

