package com.abubus;

import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.JsonObject;
import com.models.availtrips.AvailableTrip;
import com.models.availtrips.Data;
import com.retrofit.ApiInterface;
import com.retrofit.ParsingClass;
import com.retrofit.RetrofitApiClient;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.HashMap;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AvailTripsActivity extends AppCompatActivity {

    String resuult_ = "";

    public ArrayList<Data> fares;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        fares = new ArrayList<>();
        getAvailTripsData();

    }

    public void getAvailTripsData() {

        final ApiInterface service = RetrofitApiClient.retGet().create(ApiInterface.class);

        HashMap<String,String> params=new HashMap<>();
        params.put("source","3");
        params.put("destination","6");
        params.put("doj","2019-12-05");

        Call<JsonObject> call = service.getAvailTrips(params);
        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response)
            {
                if (response.isSuccessful() && response.body() != null) {
                    JsonObject data = response.body();

                    String totalData = data.toString();

                    System.out.println("Total_Data:===="+totalData);
                    Log.i("Length","Total_Data:====="+totalData);

                    try {
                        JSONObject jsonObject =  new JSONObject(totalData == null ? "" :totalData);
                        resuult_ = jsonObject.getString("availableTrips");

                        System.out.println("After_Sending_Data:===="+resuult_);
                        Log.i("Length","After_Sending_Data:===="+resuult_);

                        ParsingClass parsingClass=new ParsingClass();
                        parsingClass.getAvailTrips(resuult_);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    catch (NullPointerException e) {
                        // TODO: handle exception
                    }catch (IllegalStateException e) {
                        // TODO: handle exception
                    }catch (IllegalArgumentException e) {
                        // TODO: handle exception
                    }catch (NetworkOnMainThreadException e) {
                        // TODO: handle exception
                    }catch (RuntimeException e) {
                        // TODO: handle exception
                    }

                    //getModuleData(resuult_);
                    //System.out.println("Total_Data:===="+data);

                }
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                call.cancel();
                //System.out.println("======="+t.getMessage());
                Toast.makeText(AvailTripsActivity.this, "Please check your network connection and internet permission", Toast.LENGTH_LONG).show();
            }
        });

    }


   private void getModuleData(String Response) {

        int i,j, l;
        String fare_amount;

        try {
            ArrayList<Data> selectestmodule_lst = new ArrayList<>();
            selectestmodule_lst.clear();
            JSONArray array = new JSONArray(Response);

            System.out.println("The_Array_Size_is:---"+array.toString());

            for (i = 0; i < array.length(); i++) {
                Data data = new Data();

                JSONObject jsonObject = array.getJSONObject(i);

                data.ac = jsonObject.getString("AC");
                data.arrivaltime = jsonObject.getString("arrivalTime");
                data.availCatCard = jsonObject.getString("availCatCard");
                data.availSrCitizen = jsonObject.getString("availSrCitizen");
                data.availableSeats = jsonObject.getString("availableSeats");
                data.avlWindowSeats = jsonObject.getString("avlWindowSeats");

                //

                Log.d("Data_1:======",data.arrivaltime+"\n");

                //Fares

                try {
                    JSONArray fares_array = jsonObject.getJSONArray("fares");
                    for (int k = 0; k <fares_array.length(); k ++){

                        JSONObject fares_obj= (JSONObject) fares_array.get(k );
                        AvailableTrip availableTrip = new AvailableTrip();

                        System.out.println("array_fares_data"+fares_obj.toString());

                    }

                }catch (Exception e){

                    data.fares = jsonObject.getString("fares");

                    String animals = data.fares.toString();
                    String[] animalsArray = animals.split(",");

                    for(l = 0; l<animalsArray.length; l++){

                        data = new Data();
                        data.fares_strings = animalsArray[l];

                    }

                    fare_amount = convertStringArraytoString(animalsArray,",");

                    //trip.setFares(obj.getString(fare_amount));

                    System.out.println("string_fares_data----"+fare_amount);

                }


                /*data.bookable = jsonObject.getString("bookable");
                data.bpDpSeatLayout = jsonObject.getString("bpDpSeatLayout");
                data.busImageCount = jsonObject.getString("busImageCount");
                data.busRoutes = jsonObject.getString("busRoutes");
                data.busType = jsonObject.getString("busType");
                data.busTypeId = jsonObject.getString("busTypeId");
                data.cancellationPolicy = jsonObject.getString("cancellationPolicy");
                data.departureTime = jsonObject.getString("departureTime");
                data.destination = jsonObject.getString("destination");
                data.doj = jsonObject.getString("doj");
                data.dropPointMandatory = jsonObject.getString("dropPointMandatory");

                //

                Log.d("Data_2:======",data.bookable+"\n");

                data.flatComApplicable = jsonObject.getString("flatComApplicable");
                data.gdsCommission = jsonObject.getString("gdsCommission");
                data.id = jsonObject.getString("id");
                data.idProofRequired = jsonObject.getString("idProofRequired");
                data.liveTrackingAvailable = jsonObject.getString("liveTrackingAvailable");
                data.maxSeatsPerTicket = jsonObject.getString("maxSeatsPerTicket");
                data.nonAC = jsonObject.getString("nonAC");
                data.operator = jsonObject.getString("operator");
                data.otgEnabled = jsonObject.getString("otgEnabled");
                data.partialCancellationAllowed = jsonObject.getString("partialCancellationAllowed");
                data.partnerBaseCommission = jsonObject.getString("partnerBaseCommission");
                data.primaryPaxCancellable = jsonObject.getString("primaryPaxCancellable");

                //

                Log.d("Data_3:======",data.flatComApplicable+"\n");

                data.routeId = jsonObject.getString("routeId");
                data.rtc = jsonObject.getString("rtc");
                data.seater = jsonObject.getString("seater");
                data.selfInventory = jsonObject.getString("selfInventory");
                data.singleLadies = jsonObject.getString("singleLadies");
                data.sleeper = jsonObject.getString("sleeper");
                data.source = jsonObject.getString("source");
                data.tatkalTime = jsonObject.getString("tatkalTime");
                data.travels = jsonObject.getString("travels");
                data.vehicleType = jsonObject.getString("vehicleType");
                data.zeroCancellationTime = jsonObject.getString("zeroCancellationTime");
                data.mTicketEnabled = jsonObject.getString("mTicketEnabled");

                Log.d("Data_4:======",data.routeId+"\n");*/

                JSONArray boardingTimes = jsonObject.getJSONArray("boardingTimes");

                Log.i("Length","Lenght_of_the_boardingTimes:--------"+boardingTimes.length());

                selectestmodule_lst.add(data);
                Log.i("String","String:----"+selectestmodule_lst.get(i).ac+"\n");

            }

        } catch (Exception e) {
            Log.i("data:", "data:-----" +e);
        }

        //Log.i("Items====="+selectestmodule_lst)
    }

    private static String convertStringArraytoString(String[] faresarray, String delimeter){

        StringBuilder sb = new StringBuilder();
        for(String str : faresarray)
            sb.append(str).append(delimeter);
        return sb.substring(0,sb.length()-1);

    }

}
