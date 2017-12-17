package com.example.starwars.Presenter;


import com.example.starwars.Interface.FlimView;
import com.example.starwars.Interface.PlanetView;
import com.example.starwars.backtask.RetrofitBuild;
import com.example.starwars.model.Flimpojo;
import com.example.starwars.model.Planetpojo;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by pritesh on 10/2/2017.
 */

public class FlimPresenter {


    private FlimView flimView;

    private RetrofitBuild retrofitBuild;


    public FlimPresenter(FlimView flimView) {

        this.flimView = flimView;

        retrofitBuild = new RetrofitBuild();

    }


    public void getFList(){

        flimView.showprogress();

        Call<Flimpojo> pojoCall = retrofitBuild.allApi().getFlim();


        pojoCall.enqueue(new Callback<Flimpojo>() {
            @Override
            public void onResponse(Call<Flimpojo> call, Response<Flimpojo> response) {

                flimView.hideprogress();


                if(response.body().getResults().size() >0){


                    flimView.showFLoginSuccessMsg(response.body().getResults());

                }
                else {


                    flimView.showFErrorMeassage();

                }




            }

            @Override
            public void onFailure(Call<Flimpojo> call, Throwable t) {

                flimView.hideprogress();

                flimView.showFErrorMeassage();

            }
        });


    }


}
