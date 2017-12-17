package com.example.starwars.Interface;

import com.example.starwars.model.SpeciesP;
import com.example.starwars.model.VehiclesP;

import java.util.List;

/**
 * Created by pritesh on 10/2/2017.
 */

public interface VehiclesView {


    void showVErrorMeassage();

    void showVLoginSuccessMsg(List<VehiclesP> vehiclesPList);

    void showprogress();

    void hideprogress();


}
