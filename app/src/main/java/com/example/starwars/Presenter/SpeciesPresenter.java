package com.example.starwars.Presenter;


import com.example.starwars.Interface.FlimView;
import com.example.starwars.Interface.SpeciesView;
import com.example.starwars.backtask.RetrofitBuild;
import com.example.starwars.model.Flimpojo;
import com.example.starwars.model.Speciespojo;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by pritesh on 10/2/2017.
 */

public class SpeciesPresenter {


    private SpeciesView speciesView;

    private RetrofitBuild retrofitBuild;


    public SpeciesPresenter(SpeciesView speciesView) {

        this.speciesView = speciesView;

        retrofitBuild = new RetrofitBuild();

    }


    public void getSList(){

        speciesView.showprogress();

        Call<Speciespojo> pojoCall = retrofitBuild.allApi().getSpecies();


        pojoCall.enqueue(new Callback<Speciespojo>() {
            @Override
            public void onResponse(Call<Speciespojo> call, Response<Speciespojo> response) {

                speciesView.hideprogress();


                if(response.body().getResults().size() >0){


                    speciesView.showSLoginSuccessMsg(response.body().getResults());

                }
                else {


                    speciesView.showSErrorMeassage();

                }




            }

            @Override
            public void onFailure(Call<Speciespojo> call, Throwable t) {

                speciesView.hideprogress();

                speciesView.showSErrorMeassage();

            }
        });


    }


}
