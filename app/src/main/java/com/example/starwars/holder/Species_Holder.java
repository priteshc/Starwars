package com.example.starwars.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.starwars.R;


/**
 * Created by pritesh on 5/24/2017.
 */

public class Species_Holder extends RecyclerView.ViewHolder {

    public TextView name,desig,clise,height;
    public  LinearLayout continer;


    public Species_Holder(View itemView) {
        super(itemView);

        name = (TextView) itemView.findViewById(R.id.name);
        desig = (TextView) itemView.findViewById(R.id.desig);
        clise = (TextView) itemView.findViewById(R.id.clise);
        height = (TextView) itemView.findViewById(R.id.height);

       continer = itemView.findViewById(R.id.container);





    }
}
