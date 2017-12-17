package com.example.starwars.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.starwars.R;


/**
 * Created by pritesh on 5/24/2017.
 */

public class People_Holder extends RecyclerView.ViewHolder {

    public TextView name,height,mass;
    public  LinearLayout continer;


    public People_Holder(View itemView) {
        super(itemView);

        name = (TextView) itemView.findViewById(R.id.name);
        height = (TextView) itemView.findViewById(R.id.height);
        mass = (TextView) itemView.findViewById(R.id.mass);

       continer = itemView.findViewById(R.id.container);





    }
}
