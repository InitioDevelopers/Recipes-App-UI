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
import com.example.recipesapp.Model.BreakfirstDatamodel;
import com.example.recipesapp.R;

import java.util.ArrayList;

public class BreakfirstAdapter extends RecyclerView.Adapter<BreakfirstAdapter.ViewHolder> {
     private HomeActivity homeActivity;
    private final ArrayList<BreakfirstDatamodel> mData;

    // data is passed into the constructor
    public BreakfirstAdapter(ArrayList<BreakfirstDatamodel> data, HomeActivity homeActivity) {
        this.mData = data;
        this.homeActivity=homeActivity;
    }

    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.row_data_breackfast, parent, false);
        BreakfirstAdapter.ViewHolder viewHolder = new BreakfirstAdapter.ViewHolder(listItem);
        return viewHolder;
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(BreakfirstAdapter.ViewHolder holder, int position) {
        BreakfirstDatamodel animal = mData.get(position);
        holder.textviewWhatsForBreackFastName1.setText(animal.getItemName());
        holder.textviewKcal.setText(animal.getKcal());
     //   holder.textviewChafeName.setText(animal.getChefsName());
        holder.textvieTime.setText(animal.getTime());
        holder.imageviewItem.setImageResource(mData.get(position).getItemImage());
     //   holder.imageLogo.setImageResource(mData.get(position).getChefImagelogo());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(homeActivity, PizzaActivity.class);
                i.putExtra("kacl",animal.getKcal());
                i.putExtra("itemImage",animal.getItemImage());
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
        TextView textviewWhatsForBreackFastName1,textviewKcal,textvieTime,textviewChafeName;
        ImageView imageviewItem,imageLogo;


        ViewHolder(View itemView) {
            super(itemView);
            textviewWhatsForBreackFastName1 = itemView.findViewById(R.id.textViewWhatsForBreackFastName1);
            imageviewItem=itemView.findViewById(R.id.imageViewItem);
            imageLogo=itemView.findViewById(R.id.imageViewLogo);
          textviewChafeName=itemView.findViewById(R.id.textViewChafeName);
            textviewKcal = itemView.findViewById(R.id.textViewKcal);
            textvieTime=itemView.findViewById(R.id.textViewTime);

        }
    }
}
