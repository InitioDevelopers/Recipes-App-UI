package com.example.recipesapp.adapter;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import com.example.recipesapp.Activity.PizzaActivity;
import com.example.recipesapp.Model.PizzaDatamodel;
import com.example.recipesapp.Model.TrandingNowDataModel;
import com.example.recipesapp.R;

import java.util.ArrayList;

public class PizzaAdapter extends RecyclerView.Adapter<PizzaAdapter.ViewHolder> {
    private Activity pizzaActivity;
    private final ArrayList<PizzaDatamodel> mData;

    // data is passed into the constructor
    public PizzaAdapter(ArrayList<PizzaDatamodel> data, Activity pizzaActivity) {
        this.mData = data;
        this.pizzaActivity=pizzaActivity;
    }

    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.row_data_ingrediant, parent, false);
        PizzaAdapter.ViewHolder viewHolder = new PizzaAdapter.ViewHolder(listItem);
        return viewHolder;
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(PizzaAdapter.ViewHolder holder, int position) {
        holder.ImageViewiewLogo.setImageResource(mData.get(position).getIngridiants());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
    // total number of rows
    @Override
    public int getItemCount() {
        return mData.size();
    }

    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ImageViewiewLogo;


        ViewHolder(View itemView) {
            super(itemView);
            ImageViewiewLogo = itemView.findViewById(R.id.ImageViewiewLogo);

        }
    }
}
