package com.example.starwars.Presenter;


import com.example.starwars.Interface.StarshipView;
import com.example.starwars.Interface.VehiclesView;
import com.example.starwars.backtask.RetrofitBuild;
import com.example.starwars.model.Starshipspojo;
import com.example.starwars.model.Vehiclespojo;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by pritesh on 10/2/2017.
 */

public class StarshipPresenter {


    private StarshipView starshipView;

    private RetrofitBuild retrofitBuild;


    public StarshipPresenter(StarshipView starshipView) {

        this.starshipView = starshipView;

        retrofitBuild = new RetrofitBuild();

    }


    public void getSList(){

        starshipView.showprogress();

        Call<Starshipspojo> pojoCall = retrofitBuild.allApi().getStarship();


        pojoCall.enqueue(new Callback<Starshipspojo>() {
            @Override
            public void onResponse(Call<Starshipspojo> call, Response<Starshipspojo> response) {

                starshipView.hideprogress();


                if(response.body().getResults().size() >0){


                    starshipView.showStLoginSuccessMsg(response.body().getResults());

                }
                else {


                    starshipView.showStErrorMeassage();

                }




            }

            @Override
            public void onFailure(Call<Starshipspojo> call, Throwable t) {

                starshipView.hideprogress();

                starshipView.showStErrorMeassage();

            }
        });


    }


}
