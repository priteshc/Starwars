package com.example.starwars.Interface;

import com.example.starwars.model.PlanetP;
import com.example.starwars.model.ResultP;

import java.util.List;

/**
 * Created by pritesh on 10/2/2017.
 */

public interface PlanetView {


    void showPErrorMeassage();

    void showPLoginSuccessMsg(List<PlanetP> planetPList);

    void showprogress();

    void hideprogress();


}
