package com.example.recipesapp.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.recipesapp.Model.BookMarkDataModel;
import com.example.recipesapp.Model.BookMarkDataModel;
import com.example.recipesapp.Model.BookMarkDataModel;
import com.example.recipesapp.R;
import com.example.recipesapp.adapter.BookMarkAdapter;
import com.example.recipesapp.adapter.ContactDetailAdapter;
import com.example.recipesapp.adapter.TrendingAdapter;

import java.util.ArrayList;

public class BookMarkFragment extends Fragment {
    public ArrayList<BookMarkDataModel> dataModels = new ArrayList<>();;
    RecyclerView recycleViewBookMark;
    private ContactDetailAdapter contactDetailAdapter;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_book_mark, container, false);
        recycleViewBookMark = (RecyclerView) view.findViewById(R.id.recycleViewBookMark);
        addDataTranding();
        return view;
    }

    private void addDataTranding() {
        dataModels.clear();
        BookMarkDataModel TrandingNowDataModel1 = new BookMarkDataModel();
        TrandingNowDataModel1.setId(1);
        TrandingNowDataModel1.setItemName("Pizza");
        TrandingNowDataModel1.setImageItem(R.drawable.pizza);
        TrandingNowDataModel1.setKcal("631 kacl");
        TrandingNowDataModel1.setTime("45 mints");
        dataModels.add(TrandingNowDataModel1);

        BookMarkDataModel TrandingNowDataModel2 = new BookMarkDataModel();
        TrandingNowDataModel2.setId(2);
        TrandingNowDataModel2.setItemName("Noodles");
        TrandingNowDataModel2.setImageItem(R.drawable.noodels);
        TrandingNowDataModel2.setKcal("411 kacl");
        TrandingNowDataModel2.setTime("15 mints");
        dataModels.add(TrandingNowDataModel2);

        BookMarkDataModel TrandingNowDataModel3 = new BookMarkDataModel();
        TrandingNowDataModel3.setId(3);
        TrandingNowDataModel3.setItemName("Pancake");
        TrandingNowDataModel3.setImageItem(R.drawable.panvcakes);
        TrandingNowDataModel3.setKcal("311 kacl");
        TrandingNowDataModel3.setTime("40 mints");
        dataModels.add(TrandingNowDataModel3);

        BookMarkDataModel TrandingNowDataModel4 = new BookMarkDataModel();
        TrandingNowDataModel4.setId(4);
        TrandingNowDataModel4.setItemName("Acai bowl");
        TrandingNowDataModel4.setImageItem(R.drawable.image_acai_bowl);
        TrandingNowDataModel4.setKcal("210 kacl");
        TrandingNowDataModel4.setTime("12 mints");
        dataModels.add(TrandingNowDataModel4);

        BookMarkDataModel TrandingNowDataModel5 = new BookMarkDataModel();
        TrandingNowDataModel5.setId(5);
        TrandingNowDataModel5.setItemName("Tomato soup");
        TrandingNowDataModel5.setImageItem(R.drawable.tomatosoup);
        TrandingNowDataModel5.setKcal("111 kacl");
        TrandingNowDataModel5.setTime("10 mints");
        dataModels.add(TrandingNowDataModel5);

        BookMarkDataModel TrandingNowDataModel6 = new BookMarkDataModel();
        TrandingNowDataModel6.setId(6);
        TrandingNowDataModel6.setItemName("Pancake");
        TrandingNowDataModel6.setImageItem(R.drawable.panvcakes);
        TrandingNowDataModel6.setKcal("691 kacl");
        TrandingNowDataModel6.setTime("25 mints");
        dataModels.add(TrandingNowDataModel6);

        BookMarkAdapter adapterTrending = new BookMarkAdapter(dataModels, getActivity());
        recycleViewBookMark.setLayoutManager(new GridLayoutManager(getContext(), 2));
        recycleViewBookMark.setNestedScrollingEnabled(false);
        recycleViewBookMark.setAdapter(adapterTrending);

    }
}