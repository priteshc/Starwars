package com.example.starwars;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import com.example.starwars.adapter.Custom_Adapter;
import com.example.starwars.model.Mainpojo;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BottomSheetBehavior bottomSheetBehavior;

    GridView simpleGrid;

    List<Mainpojo> rowItems = new ArrayList<>();

    public static final   String[] titles = new String[] { "People", "Planets", "Flims", "Species", "Vehicles",
            "Starships"};


    public RecyclerView recyclerView1;
    private RecyclerView.LayoutManager mLayoutManager;
    private Custom_Adapter custom_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        bottomSheetBehavior = BottomSheetBehavior.from(findViewById(R.id.bottomSheetLayout));

/*
        simpleGrid = (GridView) findViewById(R.id.simpleGridView); // init GridView

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, numbers);

        simpleGrid.setAdapter(adapter);
*/


    /*      bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);

        bottomSheetBehavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {


            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {


            }
        });
*/

        recyclerView1 = (RecyclerView)findViewById(R.id.recycler_view1);


        for (int i = 0; i < titles.length; i++) {
            Mainpojo item = new Mainpojo(titles[i]);
            rowItems.add(item);
        }


        mLayoutManager = new GridLayoutManager(MainActivity.this,2);

        recyclerView1.setLayoutManager(mLayoutManager);

        custom_adapter = new Custom_Adapter(MainActivity.this,rowItems);


        recyclerView1.setAdapter(custom_adapter);




    }
}
