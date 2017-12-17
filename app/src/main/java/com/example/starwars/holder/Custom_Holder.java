package com.example.starwars.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.starwars.R;


/**
 * Created by pritesh on 5/24/2017.
 */

public class Custom_Holder extends RecyclerView.ViewHolder {

    public LinearLayout container;
    public TextView name;


    public Custom_Holder(View itemView) {
        super(itemView);

        name = (TextView) itemView.findViewById(R.id.tv);

        container=(LinearLayout)itemView.findViewById(R.id.li);





    }
}
