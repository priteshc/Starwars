package com.example.starwars.Presenter;


import com.example.starwars.Interface.SpeciesView;
import com.example.starwars.Interface.VehiclesView;
import com.example.starwars.backtask.RetrofitBuild;
import com.example.starwars.model.Speciespojo;
import com.example.starwars.model.Vehiclespojo;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by pritesh on 10/2/2017.
 */

public class VehiclesPresenter {


    private VehiclesView vehiclesView;

    private RetrofitBuild retrofitBuild;


    public VehiclesPresenter(VehiclesView vehiclesView) {

        this.vehiclesView = vehiclesView;

        retrofitBuild = new RetrofitBuild();

    }


    public void getVList(){

        vehiclesView.showprogress();

        Call<Vehiclespojo> pojoCall = retrofitBuild.allApi().getVehicles();


        pojoCall.enqueue(new Callback<Vehiclespojo>() {
            @Override
            public void onResponse(Call<Vehiclespojo> call, Response<Vehiclespojo> response) {

                vehiclesView.hideprogress();


                if(response.body().getResults().size() >0){


                    vehiclesView.showVLoginSuccessMsg(response.body().getResults());

                }
                else {


                    vehiclesView.showVErrorMeassage();

                }




            }

            @Override
            public void onFailure(Call<Vehiclespojo> call, Throwable t) {

                vehiclesView.hideprogress();

                vehiclesView.showVErrorMeassage();

            }
        });


    }


}
