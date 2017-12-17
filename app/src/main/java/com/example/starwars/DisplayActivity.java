package com.example.starwars;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.starwars.Interface.FlimView;
import com.example.starwars.Interface.PeopleView;
import com.example.starwars.Interface.PlanetView;
import com.example.starwars.Interface.SpeciesView;
import com.example.starwars.Interface.StarshipView;
import com.example.starwars.Interface.VehiclesView;
import com.example.starwars.Presenter.FlimPresenter;
import com.example.starwars.Presenter.PeoplePresenter;
import com.example.starwars.Presenter.PlanetPresenter;
import com.example.starwars.Presenter.SpeciesPresenter;
import com.example.starwars.Presenter.StarshipPresenter;
import com.example.starwars.Presenter.VehiclesPresenter;
import com.example.starwars.adapter.Flim_Adapter;
import com.example.starwars.adapter.People_Adapter;
import com.example.starwars.adapter.Planet_Adapter;
import com.example.starwars.adapter.Species_Adapter;
import com.example.starwars.adapter.Starship_Adapter;
import com.example.starwars.adapter.Vehicles_Adapter;
import com.example.starwars.model.FlimP;
import com.example.starwars.model.PlanetP;
import com.example.starwars.model.ResultP;
import com.example.starwars.model.SpeciesP;
import com.example.starwars.model.StarshiP;
import com.example.starwars.model.VehiclesP;

import java.util.List;

import cn.pedant.SweetAlert.SweetAlertDialog;

/**
 * Created by HP on 12/16/2017.
 */

public class DisplayActivity extends AppCompatActivity implements PeopleView,PlanetView,FlimView,SpeciesView,VehiclesView,StarshipView {


    private Toolbar toolbar;

    SweetAlertDialog pDialog;

    PeoplePresenter peoplePresenter;

    PlanetPresenter planetPresenter;

    FlimPresenter flimPresenter;


    Flim_Adapter flim_adapter;

    SpeciesPresenter speciesPresenter;
    Species_Adapter species_adapter;

    Planet_Adapter planet_adapter;

    People_Adapter people_adapter;
    private RecyclerView recyclerView;

    VehiclesPresenter vehiclesPresenter;
    Vehicles_Adapter vehicles_adapter;

    StarshipPresenter starshipPresenter;

    Starship_Adapter starship_adapter;

    TextView title;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.display);


        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(this.toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        title = (TextView) findViewById(R.id.toolbar_title);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view1);

        LinearLayoutManager llm = new LinearLayoutManager(DisplayActivity.this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(llm);


        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();

            }
        });

        pDialog = new SweetAlertDialog(this, SweetAlertDialog.PROGRESS_TYPE);
        pDialog.getProgressHelper().setBarColor(Color.parseColor("#181818"));
        pDialog.setTitleText("Loading");
        pDialog.setCancelable(false);




        String name = getIntent().getExtras().getString("name");


        if(name.equals("People")) {

            peoplePresenter = new PeoplePresenter(this);

            peoplePresenter.getList();

            title.setText("People");
        }

        if(name.equals("Planets")) {


            planetPresenter = new PlanetPresenter(this);

            planetPresenter.getPList();

            title.setText("Planets");


        }

        if(name.equals("Flims")) {

            flimPresenter = new FlimPresenter(this);

            flimPresenter.getFList();

            title.setText("Flims");


        }

        if(name.equals("Species")) {

            speciesPresenter = new SpeciesPresenter(this);

            speciesPresenter.getSList();

            title.setText("Species");


        }

        if(name.equals("Vehicles")) {

            vehiclesPresenter = new VehiclesPresenter(this);

            vehiclesPresenter.getVList();

            title.setText("Vehicles");


        }

        if(name.equals("Starships")) {

            starshipPresenter = new StarshipPresenter(this);

            starshipPresenter.getSList();

            title.setText("Starships");


        }


        }

    @Override
    public void showErrorMeassage() {

        Toast.makeText(DisplayActivity.this,"server error,plz try again",Toast.LENGTH_SHORT).show();


    }

    @Override
    public void showLoginSuccessMsg(List<ResultP> resultPList) {


        people_adapter = new People_Adapter(DisplayActivity.this,resultPList);

        recyclerView.setAdapter(people_adapter);

        people_adapter.notifyDataSetChanged();

    }

    @Override
    public void showPErrorMeassage() {

        Toast.makeText(DisplayActivity.this,"server error,plz try again",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showPLoginSuccessMsg(List<PlanetP> planetPList) {

        planet_adapter = new Planet_Adapter(DisplayActivity.this,planetPList);

        recyclerView.setAdapter(planet_adapter);

        planet_adapter.notifyDataSetChanged();



    }

    @Override
    public void showFErrorMeassage() {

        Toast.makeText(DisplayActivity.this,"server error,plz try again",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showFLoginSuccessMsg(List<FlimP> flimPList) {

        flim_adapter = new Flim_Adapter(DisplayActivity.this,flimPList);

        recyclerView.setAdapter(flim_adapter);
        flim_adapter.notifyDataSetChanged();

    }

    @Override
    public void showSErrorMeassage() {

        Toast.makeText(DisplayActivity.this,"server error,plz try again",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showSLoginSuccessMsg(List<SpeciesP> speciesPList) {


        species_adapter = new Species_Adapter(DisplayActivity.this,speciesPList);

        recyclerView.setAdapter(species_adapter);
        species_adapter.notifyDataSetChanged();


    }

    @Override
    public void showVErrorMeassage() {

        Toast.makeText(DisplayActivity.this,"server error,plz try again",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showVLoginSuccessMsg(List<VehiclesP> vehiclesPList) {

        vehicles_adapter = new Vehicles_Adapter(DisplayActivity.this,vehiclesPList);

        recyclerView.setAdapter(vehicles_adapter);
        vehicles_adapter.notifyDataSetChanged();


    }

    @Override
    public void showStErrorMeassage() {
        Toast.makeText(DisplayActivity.this,"server error,plz try again",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showStLoginSuccessMsg(List<StarshiP> starshiPList) {

        starship_adapter  = new Starship_Adapter(DisplayActivity.this,starshiPList);

        recyclerView.setAdapter(starship_adapter);
        starship_adapter.notifyDataSetChanged();


    }

    @Override
    public void showprogress() {

        pDialog.show();

    }

    @Override
    public void hideprogress() {

        pDialog.dismiss();
    }
}
