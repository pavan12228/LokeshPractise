package com.example.ravi.lokeshpractise;

import com.example.ravi.lokeshpractise.models.First;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Ravi on 13-11-2016.
 */

public interface ServiceOperations {
    @GET("movies.json")
    Call<List<First>> pavan();

    @FormUrlEncoded
    @POST("GetLoginDet")
    Call<LoginModel>   loginModelCall(@Field("Emailid") String email,@Field("Password") String pass);
}
