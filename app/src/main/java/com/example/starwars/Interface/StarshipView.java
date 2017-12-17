package com.example.starwars.Interface;

import com.example.starwars.model.StarshiP;
import com.example.starwars.model.VehiclesP;

import java.util.List;

/**
 * Created by pritesh on 10/2/2017.
 */

public interface StarshipView {


    void showStErrorMeassage();

    void showStLoginSuccessMsg(List<StarshiP> starshiPList);

    void showprogress();

    void hideprogress();


}
