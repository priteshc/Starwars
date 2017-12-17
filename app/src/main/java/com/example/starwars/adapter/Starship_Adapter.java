package com.example.starwars.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.starwars.R;
import com.example.starwars.holder.Starship_Holder;
import com.example.starwars.holder.Vehicles_Holder;
import com.example.starwars.model.StarshiP;
import com.example.starwars.model.VehiclesP;

import java.util.List;

/**
 * Created by pritesh on 5/24/2017.
 */

public class Starship_Adapter extends RecyclerView.Adapter<Starship_Holder> {

    Context mContext;
    List<StarshiP> list;


    private int lastPosition = -1;



    public Starship_Adapter(Context c, List<StarshiP> list ) {

        mContext = c;
        this.list = list;


    }

    @Override
    public Starship_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.starshipcard, parent, false);

        return new Starship_Holder(itemView);
    }

    @Override
    public void onBindViewHolder(Starship_Holder holder, final int position) {


        holder.name.setText(list.get(position).getName());
        holder.model.setText(list.get(position).getModel());
        holder.manf.setText(list.get(position).getManufacturer());
        holder.star.setText(list.get(position).getStarshipClass());


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
