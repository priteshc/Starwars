package com.example.starwars.Presenter;


import com.example.starwars.Interface.PeopleView;
import com.example.starwars.backtask.RetrofitBuild;
import com.example.starwars.model.Peoplepojo;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by pritesh on 10/2/2017.
 */

public class PeoplePresenter {


    private PeopleView peopleView;

    private RetrofitBuild retrofitBuild;


    public PeoplePresenter(PeopleView peopleView) {

        this.peopleView = peopleView;

        retrofitBuild = new RetrofitBuild();

    }


    public void getList(){

        peopleView.showprogress();

        Call<Peoplepojo> pojoCall = retrofitBuild.allApi().getList();


        pojoCall.enqueue(new Callback<Peoplepojo>() {
            @Override
            public void onResponse(Call<Peoplepojo> call, Response<Peoplepojo> response) {

                peopleView.hideprogress();


                if(response.body().getResults().size() >0){


                    peopleView.showLoginSuccessMsg(response.body().getResults());

                }
                else {


                    peopleView.showErrorMeassage();

                }




            }

            @Override
            public void onFailure(Call<Peoplepojo> call, Throwable t) {

                peopleView.hideprogress();

                peopleView.showErrorMeassage();

            }
        });


    }


}
