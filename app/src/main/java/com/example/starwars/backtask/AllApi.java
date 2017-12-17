package com.example.starwars.backtask;


import com.example.starwars.model.Flimpojo;
import com.example.starwars.model.Peoplepojo;
import com.example.starwars.model.Planetpojo;
import com.example.starwars.model.Speciespojo;
import com.example.starwars.model.Starshipspojo;
import com.example.starwars.model.Vehiclespojo;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by pritesh on 3/27/2017.
 */

public interface AllApi {


    @GET("people/")
    Call<Peoplepojo> getList();


    @GET("planets/")
    Call<Planetpojo> getPeople();

    @GET("films/")
    Call<Flimpojo> getFlim();

    @GET("species/")
    Call<Speciespojo> getSpecies();

    @GET("vehicles/")
    Call<Vehiclespojo> getVehicles();

    @GET("starships/")
    Call<Starshipspojo> getStarship();
}
