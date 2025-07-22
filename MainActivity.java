package com.example.card2;


import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;


import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity   {
    RecyclerView recyclerView;
    ArrayList<Model> arrayList =new ArrayList<>();
    BottomNavigationView bottomNavigationView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        arrayList.add(new Model(R.drawable.image1, "Tomato", "₹25"));
        arrayList.add(new Model(R.drawable.image2, "Carrot", "₹7.99"));
        arrayList.add(new Model(R.drawable.image3, "Beetroot", "₹5.67"));
        arrayList.add(new Model(R.drawable.image4, "Beans", "₹76.74"));
        arrayList.add(new Model(R.drawable.image5, "Cabbage", "₹8"));
        arrayList.add(new Model(R.drawable.image6, "Onion", "₹21"));
        arrayList.add(new Model(R.drawable.image7, "Ladiesfinger", "₹41"));
        arrayList.add(new Model(R.drawable.image8, "Brinjal", "₹7.18"));
        arrayList.add(new Model(R.drawable.image9, "Garlice", "₹89.23"));

        ModelRecyclerView modelRecyclerView = new ModelRecyclerView(this, arrayList);
        recyclerView.setAdapter(modelRecyclerView);

        bottomNavigationView = findViewById(R.id.bottom_navigator);
        bottomNavigationView.setSelectedItemId(R.id.home);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()) {


                    case R.id.dashboard:
                        startActivity(new Intent(getApplication(), Dashboard.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.home:
                        return true;
                    case R.id.about:
                        startActivity(new Intent(getApplication(), About.class));
                        overridePendingTransition(0, 0);
                        return true;


                }
                return false;
            }
        });
    }
}


