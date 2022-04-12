package com.example.recipesapp.Activity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.recipesapp.Model.CookingDatamodel;
import com.example.recipesapp.R;
import com.example.recipesapp.adapter.CookingAdapter;
import java.util.ArrayList;

public class CookingActivity extends AppCompatActivity {
    RecyclerView RecycleCooking;
    private int userId;
    private ArrayList <CookingDatamodel>arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cooking);
        ImageView imageViewButtonBack=findViewById(R.id.imageViewButtonBack);
         imageViewButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        RecycleCooking=(RecyclerView)findViewById(R.id.recycleViewAllsteps);

        TextView textviewItemName=findViewById(R.id.textViewItemName);

        data();

        try{
            userId=getIntent().getExtras().getInt("Breakfirst");
            String itemName=getIntent().getExtras().getString("itemName");
            textviewItemName.setText(itemName);
        }catch (Exception e){
            e.printStackTrace();
        }
      /*  try {
            userId=getIntent().getExtras().getInt("userIdPizza");
            String itemImage01=getIntent().getExtras().getString("ingrediant");
            String itemImage02=getIntent().getExtras().getString("ingrediant");
        }catch (Exception e){
            e.printStackTrace();
        }*/
    }
    public void data(){
        arrayList.clear();
        CookingDatamodel cookingDatamodel01 = new CookingDatamodel();
        cookingDatamodel01.setId(1);
        cookingDatamodel01.setData("Prepare all ingredients. Wash basil and tomato");
        cookingDatamodel01.setImage01(R.drawable.tomato);
        cookingDatamodel01.setImage02(R.drawable.onion);
        cookingDatamodel01.setNumber("01");
        arrayList.add(cookingDatamodel01);


        CookingDatamodel cookingDatamodel02 = new CookingDatamodel();
        cookingDatamodel02.setId(2);
        cookingDatamodel02.setData("Mix one glass of water with 500g of flour.");
        cookingDatamodel02.setImage01(R.drawable.pepsican);
        cookingDatamodel02.setImage02(R.drawable.glassofwater);
        cookingDatamodel02.setNumber("02");
        arrayList.add(cookingDatamodel02);


        CookingDatamodel cookingDatamodel03 = new CookingDatamodel();
        cookingDatamodel03.setId(3);
        cookingDatamodel03.setData("Mix dough with your hands for like 20 minutes. It has to be soft.");
        cookingDatamodel03.setNumber("03");
        arrayList.add(cookingDatamodel03);

        CookingDatamodel cookingDatamodel04 = new CookingDatamodel();
        cookingDatamodel04.setId(4);
        cookingDatamodel04.setData("Put the dough in the bowl and add some olive oil.");
        cookingDatamodel04.setImage01(R.drawable.oilbottel);
        cookingDatamodel04.setNumber("04");
        arrayList.add(cookingDatamodel04);



        CookingAdapter cookingAdapter = new CookingAdapter(arrayList,CookingActivity.this);
        RecycleCooking.setLayoutManager(new LinearLayoutManager(this));
        RecycleCooking.setAdapter(cookingAdapter);

    }
}