package com.example.recipesapp.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.recipesapp.Model.ChefsDatamodel;
import com.example.recipesapp.Model.ContactDetailDataModel;
import com.example.recipesapp.R;

import java.util.ArrayList;

public class ContactDetailAdapter extends RecyclerView.Adapter<ContactDetailAdapter.ViewHolder>  {
    private Activity homeActivity;
    private final ArrayList<ContactDetailDataModel> mData;

    // data is passed into the constructor
    public ContactDetailAdapter(ArrayList<ContactDetailDataModel> data, Activity homeActivity) {
        this.mData = data;
        this.homeActivity=homeActivity;
    }

    // inflates the row layout from xml when needed
    @Override
    public ContactDetailAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.row_data_contact_details, parent, false);
        ContactDetailAdapter.ViewHolder viewHolder = new ContactDetailAdapter.ViewHolder(listItem);
        return viewHolder;
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(ContactDetailAdapter.ViewHolder holder, int position) {
        ContactDetailDataModel animal = mData.get(position);
        holder.textviewName.setText(animal.getName());
        holder.textViewEmail.setText(animal.getEmail());
        holder.textViewNumber.setImageResource(mData.get(position).getNumber());
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
        TextView textviewName,textViewEmail;
        ImageView textViewNumber;


        ViewHolder(View itemView) {
            super(itemView);
            textviewName = itemView.findViewById(R.id.textViewName);
            textViewEmail = itemView.findViewById(R.id.textViewEmail);
            textViewNumber = itemView.findViewById(R.id.textViewNumber);
        }
    }
}
