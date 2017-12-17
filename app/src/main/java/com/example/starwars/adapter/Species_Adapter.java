package com.example.starwars.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.starwars.R;
import com.example.starwars.holder.Flim_Holder;
import com.example.starwars.holder.Species_Holder;
import com.example.starwars.model.FlimP;
import com.example.starwars.model.SpeciesP;

import java.util.List;

/**
 * Created by pritesh on 5/24/2017.
 */

public class Species_Adapter extends RecyclerView.Adapter<Species_Holder> {

    Context mContext;
    List<SpeciesP> list;


    private int lastPosition = -1;



    public Species_Adapter(Context c, List<SpeciesP> list ) {

        mContext = c;
        this.list = list;


    }

    @Override
    public Species_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.speciescard, parent, false);

        return new Species_Holder(itemView);
    }

    @Override
    public void onBindViewHolder(Species_Holder holder, final int position) {


        holder.name.setText(list.get(position).getName());
        holder.desig.setText(list.get(position).getDesignation());
        holder.clise.setText(list.get(position).getClassification());
        holder.height.setText(list.get(position).getAverageHeight());


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
