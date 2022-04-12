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
import com.example.recipesapp.Model.BookMarkDataModel;
import com.example.recipesapp.R;

import java.util.ArrayList;

public class BookMarkAdapter extends RecyclerView.Adapter<BookMarkAdapter.ViewHolder> {
    private Activity homeActivity;
    private final ArrayList<BookMarkDataModel> mData;

    // data is passed into the constructor
    public BookMarkAdapter(ArrayList<BookMarkDataModel> data, Activity homeActivity) {
        this.mData = data;
        this.homeActivity=homeActivity;
    }

    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.row_data_bookmark, parent, false);
        BookMarkAdapter.ViewHolder viewHolder = new BookMarkAdapter.ViewHolder(listItem);
        return viewHolder;
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(BookMarkAdapter.ViewHolder holder, int position) {
        BookMarkDataModel animal = mData.get(position);
        holder.textviewName.setText(animal.getItemName());
        holder.textviewKcal.setText(animal.getKcal());
        holder.textvieTime.setText(animal.getTime());
        holder.imageviewPizza.setImageResource(mData.get(position).getImageItem());
        //   holder.imageLogo.setImageResource(mData.get(position).getChefImagelogo());

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
