package com.example.recipesapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recipesapp.Model.PizzaDatamodel;
import com.example.recipesapp.R;
import com.example.recipesapp.adapter.PizzaAdapter;

import java.util.ArrayList;

public class PizzaActivity extends AppCompatActivity {
    RecyclerView recyclePizza;
    private ArrayList<PizzaDatamodel> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);

        ImageView imageviewBack=findViewById(R.id.imageviewBack);
        imageviewBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        recyclePizza = (RecyclerView) findViewById(R.id.recycleViewIngredients);
        Button buttonSeeDiscussion = findViewById(R.id.buttonSeeDiscussion);
        buttonSeeDiscussion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Button buttonStartCooking = findViewById(R.id.buttonStartCooking);
        buttonStartCooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PizzaActivity.this, CookingActivity.class);
                startActivity(i);
            }
        });
        ImageView imageviewImages = findViewById(R.id.imageViewImages);
        ImageView imageLogo = findViewById(R.id.imageViewLogo);
        TextView textviewChafeName = findViewById(R.id.textViewChafeName);
        TextView textviewDescover = findViewById(R.id.textviewDescover);
        TextView textviewWhatsForBreackFastFire1 = findViewById(R.id.textViewWhatsForBreackFastFire1);
        TextView textviewWhatsForBreackFastTimer2 = findViewById(R.id.textViewWhatsForBreackFastTimer2);
        data();

        try {
            String kacl = getIntent().getExtras().getString("kacl");
            String itemName = getIntent().getExtras().getString("itemName");
            String Time = getIntent().getExtras().getString("Time");
            int Image = getIntent().getExtras().getInt("itemImage");
            textviewDescover.setText(itemName);
            textviewWhatsForBreackFastFire1.setText(kacl);
            textviewWhatsForBreackFastTimer2.setText(Time);
            imageviewImages.setImageResource(Image);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void data() {
        arrayList.clear();
        PizzaDatamodel PizzaDatamodel1 = new PizzaDatamodel();
        PizzaDatamodel1.setIngridiants(R.drawable.tomato);
        PizzaDatamodel1.setId(1);
        arrayList.add(PizzaDatamodel1);


        PizzaDatamodel PizzaDatamodel2 = new PizzaDatamodel();
        PizzaDatamodel2.setId(2);
        PizzaDatamodel2.setIngridiants(R.drawable.pepsican);
        arrayList.add(PizzaDatamodel2);


        PizzaDatamodel PizzaDatamodel3 = new PizzaDatamodel();
        PizzaDatamodel3.setId(3);
        PizzaDatamodel3.setIngridiants(R.drawable.oilbottel);
        arrayList.add(PizzaDatamodel3);

        PizzaDatamodel PizzaDatamodel4 = new PizzaDatamodel();
        PizzaDatamodel4.setId(4);
        PizzaDatamodel4.setIngridiants(R.drawable.onion);
        arrayList.add(PizzaDatamodel4);

        PizzaDatamodel PizzaDatamodel5 = new PizzaDatamodel();
        PizzaDatamodel5.setId(5);
        PizzaDatamodel5.setIngridiants(R.drawable.glassofwater);
        arrayList.add(PizzaDatamodel5);


        PizzaAdapter PizzaAdapter = new PizzaAdapter(arrayList, PizzaActivity.this);
        recyclePizza.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclePizza.setAdapter(PizzaAdapter);

    }

}
