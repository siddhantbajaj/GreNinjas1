package com.example.siddhant.greninjas;

import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ABC on 26-07-2016.
 */
public class FbClient {
    public static GreInterface service;

    public static GreInterface  getService() {
        if(service==null)
        {
            service= new Retrofit.Builder().baseUrl("https://graph.facebook.com").addConverterFactory(GsonConverterFactory.create(new GsonBuilder().serializeNulls().create())).build().create(GreInterface.class);
        }
        return service;
    }
}
