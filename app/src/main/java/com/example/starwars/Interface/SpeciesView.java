package com.example.starwars.Interface;

import com.example.starwars.model.FlimP;
import com.example.starwars.model.SpeciesP;

import java.util.List;

/**
 * Created by pritesh on 10/2/2017.
 */

public interface SpeciesView {


    void showSErrorMeassage();

    void showSLoginSuccessMsg(List<SpeciesP> speciesPList);

    void showprogress();

    void hideprogress();


}
