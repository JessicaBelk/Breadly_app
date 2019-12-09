package com.example.breadlylogin;

import com.example.breadlylogin.POJO.Example;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

public interface RetrofitMaps {

    /*
     * Retrofit get annotation with our URL
     * And our method that will return us details of student.
     */
    @GET("api/place/nearbysearch/json?sensor=true&key=AIzaSyBbHv6XR0IJmDPnBj3wBEVQk_Y6Is7aZ6I")
    Call<Example> getNearbyPlaces(@Query("type") String type, @Query("location") String location, @Query("radius") int radius);

}
