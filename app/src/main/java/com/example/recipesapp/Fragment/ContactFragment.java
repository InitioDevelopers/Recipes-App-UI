package com.example.recipesapp.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recipesapp.Model.ContactDetailDataModel;
import com.example.recipesapp.R;
import com.example.recipesapp.adapter.ContactDetailAdapter;

import java.util.ArrayList;


public class ContactFragment extends Fragment {
    public ArrayList<ContactDetailDataModel> dataModels = new ArrayList<>();;
    RecyclerView recycleViewContactDetails;
    private ContactDetailAdapter contactDetailAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contact, container, false);
        recycleViewContactDetails = (RecyclerView) view.findViewById(R.id.recycleViewContactDetails);
        addDataBreackFirst();
        return view;
    }

    private void addDataBreackFirst() {
        dataModels.clear();
        ContactDetailDataModel BreakfirstDatamodel1 = new ContactDetailDataModel();
        BreakfirstDatamodel1.setId(1);
        BreakfirstDatamodel1.setName("joins");
        BreakfirstDatamodel1.setEmail("joins@gemail.com");
        BreakfirstDatamodel1.setNumber(R.drawable.chef1);
        dataModels.add(BreakfirstDatamodel1);

        ContactDetailDataModel BreakfirstDatamodel2 = new ContactDetailDataModel();
        BreakfirstDatamodel2.setId(2);
        BreakfirstDatamodel2.setName("James");
        BreakfirstDatamodel2.setEmail("James@gemail.com");
        BreakfirstDatamodel2.setNumber(R.drawable.chef2);
        dataModels.add(BreakfirstDatamodel2);

        ContactDetailDataModel BreakfirstDatamodel3 = new ContactDetailDataModel();
        BreakfirstDatamodel3.setId(3);
        BreakfirstDatamodel3.setName("Robert");
        BreakfirstDatamodel3.setEmail("Robert@gemail.com");
        BreakfirstDatamodel3.setNumber(R.drawable.chef3);
        dataModels.add(BreakfirstDatamodel3);

        ContactDetailDataModel BreakfirstDatamodel4 = new ContactDetailDataModel();
        BreakfirstDatamodel4.setId(4);
        BreakfirstDatamodel4.setName("William");
        BreakfirstDatamodel4.setEmail("William@gemail.com");
        BreakfirstDatamodel4.setNumber(R.drawable.chef1);
        dataModels.add(BreakfirstDatamodel4);

        ContactDetailDataModel BreakfirstDatamodel5 = new ContactDetailDataModel();
        BreakfirstDatamodel5.setId(5);
        BreakfirstDatamodel5.setName("Michael");
        BreakfirstDatamodel5.setEmail("Michael@gemail.com");
        BreakfirstDatamodel5.setNumber(R.drawable.chef3);
        dataModels.add(BreakfirstDatamodel5);

        ContactDetailDataModel BreakfirstDatamodel6 = new ContactDetailDataModel();
        BreakfirstDatamodel6.setId(6);
        BreakfirstDatamodel6.setName("David");
        BreakfirstDatamodel6.setEmail("David@gemail.com");
        BreakfirstDatamodel6.setNumber(R.drawable.chef2);
        dataModels.add(BreakfirstDatamodel6);

        ContactDetailDataModel BreakfirstDatamodel7 = new ContactDetailDataModel();
        BreakfirstDatamodel7.setId(7);
        BreakfirstDatamodel7.setName("Richard");
        BreakfirstDatamodel7.setEmail("Richard@gemail.com");
        BreakfirstDatamodel7.setNumber(R.drawable.chef1);
        dataModels.add(BreakfirstDatamodel7);


        ContactDetailAdapter adapterBreakfirst = new ContactDetailAdapter(dataModels, getActivity());
        recycleViewContactDetails.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        recycleViewContactDetails.setAdapter(adapterBreakfirst);
    }
}
