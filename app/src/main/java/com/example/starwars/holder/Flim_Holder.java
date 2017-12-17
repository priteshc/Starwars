package com.example.starwars.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.starwars.R;


/**
 * Created by pritesh on 5/24/2017.
 */

public class Flim_Holder extends RecyclerView.ViewHolder {

    public TextView title,director,producer,release;
    public  LinearLayout continer;


    public Flim_Holder(View itemView) {
        super(itemView);

        title = (TextView) itemView.findViewById(R.id.title);
        director = (TextView) itemView.findViewById(R.id.director);
        producer = (TextView) itemView.findViewById(R.id.producer);
        release = (TextView) itemView.findViewById(R.id.release);

       continer = itemView.findViewById(R.id.container);





    }
}
