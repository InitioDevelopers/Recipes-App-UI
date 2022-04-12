package com.example.recipesapp.Activity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.recipesapp.Fragment.AddFragment;
import com.example.recipesapp.Fragment.BookMarkFragment;
import com.example.recipesapp.Fragment.HomeFragment;
import com.example.recipesapp.Fragment.ContactFragment;
import com.example.recipesapp.Fragment.SearchFragment;
import com.example.recipesapp.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {
    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);

        replacefragment(new HomeFragment());
        bottomNavigationView.setOnItemSelectedListener(item -> {

            switch (item.getItemId()) {
                case R.id.home:
                    replacefragment(new HomeFragment());
                    break;
                case R.id.person:
                    replacefragment(new ContactFragment());
                    break;
                case R.id.add:
                    replacefragment(new AddFragment());
                    break;
                case R.id.search:
                    replacefragment(new SearchFragment());
                    break;
                case R.id.bookMark:
                    replacefragment(new BookMarkFragment());
                    break;
            }
            return true;

        });

    }

    private void replacefragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.contanier, fragment);
        fragmentTransaction.commit();
    }
}

