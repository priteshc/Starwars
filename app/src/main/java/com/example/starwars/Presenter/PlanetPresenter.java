package com.example.starwars.Presenter;


import com.example.starwars.Interface.PeopleView;
import com.example.starwars.Interface.PlanetView;
import com.example.starwars.backtask.RetrofitBuild;
import com.example.starwars.model.Peoplepojo;
import com.example.starwars.model.Planetpojo;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by pritesh on 10/2/2017.
 */

public class PlanetPresenter {


    private PlanetView planetView;

    private RetrofitBuild retrofitBuild;


    public PlanetPresenter(PlanetView planetView) {

        this.planetView = planetView;

        retrofitBuild = new RetrofitBuild();

    }


    public void getPList(){

        planetView.showprogress();

        Call<Planetpojo> pojoCall = retrofitBuild.allApi().getPeople();


        pojoCall.enqueue(new Callback<Planetpojo>() {
            @Override
            public void onResponse(Call<Planetpojo> call, Response<Planetpojo> response) {

                planetView.hideprogress();


                if(response.body().getResults().size() >0){


                    planetView.showPLoginSuccessMsg(response.body().getResults());

                }
                else {


                    planetView.showPErrorMeassage();

                }




            }

            @Override
            public void onFailure(Call<Planetpojo> call, Throwable t) {

                planetView.hideprogress();

                planetView.showPErrorMeassage();

            }
        });


    }


}
