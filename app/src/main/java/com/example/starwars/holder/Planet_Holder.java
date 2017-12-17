package com.example.starwars.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.starwars.R;


/**
 * Created by pritesh on 5/24/2017.
 */

public class Planet_Holder extends RecyclerView.ViewHolder {

    public TextView name,rotation,orbit,climate;
    public  LinearLayout continer;


    public Planet_Holder(View itemView) {
        super(itemView);

        name = (TextView) itemView.findViewById(R.id.name);
        rotation = (TextView) itemView.findViewById(R.id.rotation);
        orbit = (TextView) itemView.findViewById(R.id.orbit);
        climate = (TextView) itemView.findViewById(R.id.climate);

       continer = itemView.findViewById(R.id.container);





    }
}
