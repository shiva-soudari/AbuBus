package com.retrofit;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.models.availtrips.FareDetails;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import se.akerfeldt.okhttp.signpost.OkHttpOAuthConsumer;
import se.akerfeldt.okhttp.signpost.SigningInterceptor;

public class RetrofitApiClient {

    public static final String BASE_URL = "http://api.seatseller.travel/";//sources

    //static Gson gson = new GsonBuilder().registerTypeAdapter(AvailableTrip.class, new LocationsDeserializer()).create();
    //static Type myOtherClassListType = new TypeToken<List<FareDetails>>() {}.getType();
    //static Gson gson = new GsonBuilder().registerTypeAdapter(myOtherClassListType, new MyOtherClassTypeAdapter()).create();

    public static Retrofit retGet() {

        String CONSUMER_KEY = "qB2fLD4ct8fedpMtdMWgkwNUFmSdC3";
        String CONSUMER_SECRET = "H2ZVKCEGL6tkOehC0SCd259yoEyyry";

        String token = "";
        String secret = "";

        OkHttpOAuthConsumer consumer = new OkHttpOAuthConsumer(CONSUMER_KEY, CONSUMER_SECRET);
        consumer.setTokenWithSecret(token, secret);

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new SigningInterceptor(consumer))
                .addInterceptor(interceptor)
                .build();

        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())//gson
                .build();
    }

    /*public static Retrofit getTripsRet()
    {
        Gson gson = new GsonBuilder().registerTypeAdapter(FareList.class, new FareDetailsDeserializer()).create();

        String CONSUMER_KEY = "qB2fLD4ct8fedpMtdMWgkwNUFmSdC3";
        String CONSUMER_SECRET = "H2ZVKCEGL6tkOehC0SCd259yoEyyry";

        String token = "";
        String secret = "";
        OkHttpOAuthConsumer consumer = new OkHttpOAuthConsumer(CONSUMER_KEY, CONSUMER_SECRET);
        consumer.setTokenWithSecret(token, secret);

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new SigningInterceptor(consumer))
                .addInterceptor(interceptor)
                .build();

        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

    }*/

    private static class MyOtherClassTypeAdapter implements JsonDeserializer<List<FareDetails>> {
        public List<FareDetails> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext ctx) {
            List<FareDetails> vals = new ArrayList<FareDetails>();
            if (json.isJsonArray()) {
                for (JsonElement e : json.getAsJsonArray()) {
                    vals.add((FareDetails) ctx.deserialize(e, FareDetails.class));
                }
            } else if (json.isJsonObject()) {
                vals.add((FareDetails) ctx.deserialize(json, FareDetails.class));
            } else {
                throw new RuntimeException("Unexpected JSON type: " + json.getClass());
            }
            return vals;
        }
    }

}