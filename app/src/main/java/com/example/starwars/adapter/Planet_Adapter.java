package com.example.starwars.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.starwars.R;
import com.example.starwars.holder.People_Holder;
import com.example.starwars.holder.Planet_Holder;
import com.example.starwars.model.PlanetP;
import com.example.starwars.model.ResultP;

import java.util.List;

/**
 * Created by pritesh on 5/24/2017.
 */

public class Planet_Adapter extends RecyclerView.Adapter<Planet_Holder> {

    Context mContext;
    List<PlanetP> list;


    private int lastPosition = -1;



    public Planet_Adapter(Context c, List<PlanetP> list ) {

        mContext = c;
        this.list = list;


    }

    @Override
    public Planet_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.planetcard, parent, false);

        return new Planet_Holder(itemView);
    }

    @Override
    public void onBindViewHolder(Planet_Holder holder, final int position) {


        holder.name.setText(list.get(position).getName());
        holder.orbit.setText(list.get(position).getOrbitalPeriod());
        holder.climate.setText(list.get(position).getClimate());
        holder.rotation.setText(list.get(position).getRotationPeriod());


        setAnimation(holder.continer, position);


    }


    private void setAnimation(View viewToAnimate, int position)
    {
        // If the bound view wasn't previously displayed on screen, it's animated
        if (position > lastPosition)
        {
            Animation animation = AnimationUtils.loadAnimation(mContext, R.anim.slideleft);
            animation.setStartOffset(position*100);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
