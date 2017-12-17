package com.example.starwars.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.starwars.R;


/**
 * Created by pritesh on 5/24/2017.
 */

public class Starship_Holder extends RecyclerView.ViewHolder {

    public TextView name,model,manf,star;
    public  LinearLayout continer;


    public Starship_Holder(View itemView) {
        super(itemView);

        name = (TextView) itemView.findViewById(R.id.name);
        model = (TextView) itemView.findViewById(R.id.model);
        manf = (TextView) itemView.findViewById(R.id.manf);
        star = (TextView) itemView.findViewById(R.id.star);

       continer = itemView.findViewById(R.id.container);





    }
}
