package com.example.starwars.Interface;

import com.example.starwars.model.FlimP;
import com.example.starwars.model.PlanetP;

import java.util.List;

/**
 * Created by pritesh on 10/2/2017.
 */

public interface FlimView {


    void showFErrorMeassage();

    void showFLoginSuccessMsg(List<FlimP> flimPList);

    void showprogress();

    void hideprogress();


}
