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
import com.example.starwars.holder.Planet_Holder;
import com.example.starwars.model.FlimP;
import com.example.starwars.model.PlanetP;

import java.util.List;

/**
 * Created by pritesh on 5/24/2017.
 */

public class Flim_Adapter extends RecyclerView.Adapter<Flim_Holder> {

    Context mContext;
    List<FlimP> list;


    private int lastPosition = -1;



    public Flim_Adapter(Context c, List<FlimP> list ) {

        mContext = c;
        this.list = list;


    }

    @Override
    public Flim_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.flimcard, parent, false);

        return new Flim_Holder(itemView);
    }

    @Override
    public void onBindViewHolder(Flim_Holder holder, final int position) {


        holder.title.setText(list.get(position).getTitle());
        holder.producer.setText(list.get(position).getProducer());
        holder.director.setText(list.get(position).getDirector());
        holder.release.setText(list.get(position).getReleaseDate());


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
