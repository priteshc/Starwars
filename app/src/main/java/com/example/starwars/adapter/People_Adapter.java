package com.example.starwars.adapter;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.starwars.DisplayActivity;
import com.example.starwars.R;
import com.example.starwars.holder.Custom_Holder;
import com.example.starwars.holder.People_Holder;
import com.example.starwars.model.Mainpojo;
import com.example.starwars.model.Peoplepojo;
import com.example.starwars.model.ResultP;

import java.util.List;

/**
 * Created by pritesh on 5/24/2017.
 */

public class People_Adapter extends RecyclerView.Adapter<People_Holder> {

    Context mContext;
    List<ResultP> list;


    private int lastPosition = -1;



    public People_Adapter(Context c, List<ResultP> list ) {

        mContext = c;
        this.list = list;


    }

    @Override
    public People_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.peoplecard, parent, false);

        return new People_Holder(itemView);
    }

    @Override
    public void onBindViewHolder(People_Holder holder, final int position) {


        holder.name.setText(list.get(position).getName());
        holder.height.setText(list.get(position).getHeight());
        holder.mass.setText(list.get(position).getMass());

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
