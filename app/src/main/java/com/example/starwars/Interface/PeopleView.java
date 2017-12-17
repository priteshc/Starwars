package com.example.starwars.Interface;

import com.example.starwars.model.ResultP;

import java.util.List;

/**
 * Created by pritesh on 10/2/2017.
 */

public interface PeopleView {


    void showErrorMeassage();

    void showLoginSuccessMsg(List<ResultP> resultPList);

    void showprogress();

    void hideprogress();


}
