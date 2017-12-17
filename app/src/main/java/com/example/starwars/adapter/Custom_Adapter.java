package com.example.starwars.adapter;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.widget.RecyclerView;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;


import com.example.starwars.DisplayActivity;
import com.example.starwars.R;
import com.example.starwars.holder.Custom_Holder;
import com.example.starwars.model.Mainpojo;

import java.util.List;

/**
 * Created by pritesh on 5/24/2017.
 */

public class Custom_Adapter extends RecyclerView.Adapter<Custom_Holder> {

    Context mContext;
    List<Mainpojo> list;

    SharedPreferences preferences;




    public Custom_Adapter(Context c, List<Mainpojo> list ) {

        mContext = c;
        this.list = list;


    }

    @Override
    public Custom_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.customview, parent, false);

        return new Custom_Holder(itemView);
    }

    @Override
    public void onBindViewHolder(Custom_Holder holder, final int position) {


        holder.name.setText(list.get(position).getTitle());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                 Intent intent = new Intent(mContext, DisplayActivity.class);
                     intent.putExtra("name",list.get(position).getTitle());
                    mContext.startActivity(intent);



            }
        });




    }



    @Override
    public int getItemCount() {
        return list.size();
    }
}
