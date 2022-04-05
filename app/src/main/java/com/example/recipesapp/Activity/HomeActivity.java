package com.example.recipesapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recipesapp.Model.BreakfirstDatamodel;
import com.example.recipesapp.Model.ChefsDatamodel;
import com.example.recipesapp.Model.TrandingNowDataModel;
import com.example.recipesapp.R;
import com.example.recipesapp.adapter.BreakfirstAdapter;
import com.example.recipesapp.adapter.ChefsAdapter;
import com.example.recipesapp.adapter.TrendingAdapter;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    RecyclerView recycleBreakFirst, recyclePopulatChefs, recycleTrendingNow;
    private ArrayList<BreakfirstDatamodel> arrayListBreakfirst = new ArrayList<>();
    private ArrayList<ChefsDatamodel> arrayListChefs = new ArrayList<>();
    private ArrayList<TrandingNowDataModel> arrayListTrending = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        setContentView(R.layout.activity_home);

        recycleBreakFirst = (RecyclerView) findViewById(R.id.recycleViewBreakFirst);
        recyclePopulatChefs = (RecyclerView) findViewById(R.id.recycleViewPopulatChefs);
        recycleTrendingNow = (RecyclerView) findViewById(R.id.recycleViewTrendingNow);
        addDataChefs();
        addDataBreackFirst();
        addDataTranding();
    }

    private void addDataBreackFirst() {
        arrayListBreakfirst.clear();
        BreakfirstDatamodel BreakfirstDatamodel1 = new BreakfirstDatamodel();
        BreakfirstDatamodel1.setId(1);
        BreakfirstDatamodel1.setItemName("Acai Bowl");
        BreakfirstDatamodel1.setKcal("322 kacl");
        BreakfirstDatamodel1.setItemImage(R.drawable.image_acai_bowl);
        BreakfirstDatamodel1.setChefImagelogo(R.drawable.lego);
        BreakfirstDatamodel1.setTime("15 mints");
        BreakfirstDatamodel1.setChefsName("Tom Shelby");
        arrayListBreakfirst.add(BreakfirstDatamodel1);

        BreakfirstDatamodel BreakfirstDatamodel2 = new BreakfirstDatamodel();
        BreakfirstDatamodel2.setId(2);
        BreakfirstDatamodel2.setItemName("Pancakes");
        BreakfirstDatamodel2.setKcal("411 kacl");
        BreakfirstDatamodel2.setItemImage(R.drawable.panvcakes);
        BreakfirstDatamodel2.setChefImagelogo(R.drawable.lego1);
        BreakfirstDatamodel2.setTime("25 mints");
        BreakfirstDatamodel2.setChefsName("Ivy Smith");
        arrayListBreakfirst.add(BreakfirstDatamodel2);

        BreakfirstDatamodel BreakfirstDatamodel3 = new BreakfirstDatamodel();
        BreakfirstDatamodel3.setId(3);
        BreakfirstDatamodel3.setItemName("Tomato Soup");
        BreakfirstDatamodel3.setTime("10 minits");
        BreakfirstDatamodel3.setItemImage(R.drawable.tomatosoup);
        BreakfirstDatamodel3.setChefImagelogo(R.drawable.cowboy);
        BreakfirstDatamodel3.setKcal("500 kacl");
        BreakfirstDatamodel3.setChefsName("Shera Paji");
        arrayListBreakfirst.add(BreakfirstDatamodel3);
        BreakfirstAdapter adapterBreakfirst = new BreakfirstAdapter(arrayListBreakfirst, HomeActivity.this);
        recycleBreakFirst.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recycleBreakFirst.setAdapter(adapterBreakfirst);
    }

    private void addDataChefs() {
        arrayListChefs.clear();
        ChefsDatamodel ChefsDatamodel1 = new ChefsDatamodel();
        ChefsDatamodel1.setId(1);
        ChefsDatamodel1.setChefsName("Tom Shelby");
        ChefsDatamodel1.setChefsImage(R.drawable.lego);
        arrayListChefs.add(ChefsDatamodel1);

        ChefsDatamodel ChefsDatamodel2 = new ChefsDatamodel();
        ChefsDatamodel2.setId(2);
        ChefsDatamodel2.setChefsName("Ivy Smith");
        ChefsDatamodel2.setChefsImage(R.drawable.lego1);
        arrayListChefs.add(ChefsDatamodel2);

        ChefsDatamodel ChefsDatamodel3 = new ChefsDatamodel();
        ChefsDatamodel3.setId(3);
        ChefsDatamodel3.setChefsName("Shera Paji");
        ChefsDatamodel3.setChefsImage(R.drawable.cowboy);
        arrayListChefs.add(ChefsDatamodel3);

        ChefsAdapter adapterChefs = new ChefsAdapter(arrayListChefs, HomeActivity.this);
        recyclePopulatChefs.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclePopulatChefs.setAdapter(adapterChefs);

    }

    private void addDataTranding() {
        arrayListTrending.clear();
        TrandingNowDataModel TrandingNowDataModel1 = new TrandingNowDataModel();
        TrandingNowDataModel1.setId(1);
        TrandingNowDataModel1.setItemName("Pizza");
        TrandingNowDataModel1.setImageItem(R.drawable.pizza);
        TrandingNowDataModel1.setKcal("631 kacl");
        TrandingNowDataModel1.setTime("45 mints");
        arrayListTrending.add(TrandingNowDataModel1);

        TrandingNowDataModel TrandingNowDataModel2 = new TrandingNowDataModel();
        TrandingNowDataModel2.setId(2);
        TrandingNowDataModel2.setItemName("Noodles");
        TrandingNowDataModel2.setImageItem(R.drawable.noodels);
        TrandingNowDataModel2.setKcal("411 kacl");
        TrandingNowDataModel2.setTime("25 mints");
        arrayListTrending.add(TrandingNowDataModel2);

        TrendingAdapter adapterTrending = new TrendingAdapter(arrayListTrending, HomeActivity.this);
        recycleTrendingNow.setLayoutManager(new GridLayoutManager(this, 2));
        recycleTrendingNow.setNestedScrollingEnabled(false);
        recycleTrendingNow.setAdapter(adapterTrending);

    }
}
