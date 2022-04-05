package com.example.recipesapp.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import com.example.recipesapp.Activity.HomeActivity;
import com.example.recipesapp.Activity.PizzaActivity;
import com.example.recipesapp.Model.TrandingNowDataModel;
import com.example.recipesapp.R;

import java.util.ArrayList;

public class TrendingAdapter extends RecyclerView.Adapter<TrendingAdapter.ViewHolder>  {
    private HomeActivity homeActivity;
    private final ArrayList<TrandingNowDataModel> mData;

    // data is passed into the constructor
    public TrendingAdapter(ArrayList<TrandingNowDataModel> data, HomeActivity homeActivity) {
        this.mData = data;
        this.homeActivity=homeActivity;
    }

    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.row_data_tranding, parent, false);
        TrendingAdapter.ViewHolder viewHolder = new TrendingAdapter.ViewHolder(listItem);
        return viewHolder;
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(TrendingAdapter.ViewHolder holder, int position) {
        TrandingNowDataModel animal = mData.get(position);
        holder.textviewName.setText(animal.getItemName());
        holder.textviewKcal.setText(animal.getKcal());
        holder.textvieTime.setText(animal.getTime());
        holder.imageviewPizza.setImageResource(mData.get(position).getImageItem());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(homeActivity,PizzaActivity.class);
                i.putExtra("kacl",animal.getKcal());
                i.putExtra("itemImage",animal.getImageItem());
                i.putExtra("itemName",animal.getItemName());
                i.putExtra("Time",animal.getTime());
                homeActivity.startActivity(i);
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
        TextView textviewName,textviewKcal,textvieTime;
        ImageView imageviewPizza;


        ViewHolder(View itemView) {
            super(itemView);
            textviewName = itemView.findViewById(R.id.textViewName);
            imageviewPizza=itemView.findViewById(R.id.imageViewPizza);
            textviewKcal = itemView.findViewById(R.id.textViewKcal);
            textvieTime=itemView.findViewById(R.id.textViewTime);
        }
    }
}
