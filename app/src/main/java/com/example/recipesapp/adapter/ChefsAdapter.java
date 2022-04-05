package com.example.recipesapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.recipesapp.Activity.HomeActivity;
import com.example.recipesapp.Model.ChefsDatamodel;
import com.example.recipesapp.R;

import java.util.ArrayList;

public class ChefsAdapter extends RecyclerView.Adapter<ChefsAdapter.ViewHolder> {
    private HomeActivity homeActivity;
    private final ArrayList<ChefsDatamodel> mData;

    // data is passed into the constructor
    public ChefsAdapter(ArrayList<ChefsDatamodel> data, HomeActivity homeActivity) {
        this.mData = data;
        this.homeActivity=homeActivity;
    }

    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.row_data_chefe, parent, false);
        ChefsAdapter.ViewHolder viewHolder = new ChefsAdapter.ViewHolder(listItem);
        return viewHolder;
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(ChefsAdapter.ViewHolder holder, int position) {
        ChefsDatamodel animal = mData.get(position);
        holder.textviewName.setText(animal.getChefsName());
        holder.imageLogoChefs.setImageResource(mData.get(position).getChefsImage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
          /*      Intent i=new Intent(homeActivity, PizzaActivity.class);
                i.putExtra("Chef Id",animal.getId());
                i.putExtra("Chef Name",animal.getChefsName());
                i.putExtra("Chef logo",animal.getChefsImage());
                homeActivity.startActivity(i);*/
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
        TextView textviewName;
        ImageView imageLogoChefs;


        ViewHolder(View itemView) {
            super(itemView);
            textviewName = itemView.findViewById(R.id.textViewName);
            imageLogoChefs = itemView.findViewById(R.id.imageViewLogoChefs);
        }
    }
}
