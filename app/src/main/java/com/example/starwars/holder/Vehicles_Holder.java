package com.example.starwars.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.starwars.R;


/**
 * Created by pritesh on 5/24/2017.
 */

public class Vehicles_Holder extends RecyclerView.ViewHolder {

    public TextView name,model,manf,vehi;
    public  LinearLayout continer;


    public Vehicles_Holder(View itemView) {
        super(itemView);

        name = (TextView) itemView.findViewById(R.id.name);
        model = (TextView) itemView.findViewById(R.id.model);
        manf = (TextView) itemView.findViewById(R.id.manf);
        vehi = (TextView) itemView.findViewById(R.id.vehi);

       continer = itemView.findViewById(R.id.container);





    }
}
