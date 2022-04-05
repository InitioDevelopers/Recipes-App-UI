package com.example.recipesapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.recipesapp.Activity.CookingActivity;
import com.example.recipesapp.Model.CookingDatamodel;
import com.example.recipesapp.R;

import java.util.ArrayList;

public class CookingAdapter extends RecyclerView.Adapter<CookingAdapter.ViewHolder> {
    private CookingActivity cookingActivity;
    private final ArrayList<CookingDatamodel> mData;

    // data is passed into the constructor
    public CookingAdapter(ArrayList<CookingDatamodel> data, CookingActivity cookingActivity) {
        this.mData = data;
        this.cookingActivity=cookingActivity;
    }

    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.row_data_cooking, parent, false);
        CookingAdapter.ViewHolder viewHolder = new CookingAdapter.ViewHolder(listItem);
        return viewHolder;
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(CookingAdapter.ViewHolder holder, int position) {
        CookingDatamodel animal = mData.get(position);
        holder.textviewNumber.setText(animal.getNumber());
        holder.textviewDetails.setText(animal.getData());
        holder.imageviewImages01.setImageResource(mData.get(position).getImage01());
        holder.imageviewImages02.setImageResource(mData.get(position).getImage02());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
         /*       Intent i=new Intent(homeActivity.class);
                i.putExtra("userId",animal.getId());
                i.putExtra("userName",animal.getName());
                i.putExtra("userEmail",animal.getEmail());
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
        TextView textviewNumber,textviewDetails,textviewImages01,textviewImages02;
        ImageView imageviewImages01,imageviewImages02;

        ViewHolder(View itemView) {
            super(itemView);
            textviewNumber = itemView.findViewById(R.id.textViewNumber);
            textviewDetails = itemView.findViewById(R.id.textViewDetails);
            imageviewImages01 = itemView.findViewById(R.id.imageViewImages01);
            imageviewImages02 = itemView.findViewById(R.id.imageViewImages02);


        }
    }
}
