package com.example.siddhant.greninjas;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/**
 * Created by ABC on 26-07-2016.
 */
public interface GreInterface {
    @GET("/v2.7/me")
    Call<FacebookResponse> getName(@Query("access_token") String header1, @Query("fields")String city);
}
