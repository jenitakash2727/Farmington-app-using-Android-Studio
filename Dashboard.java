package com.example.card2;


import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class Dashboard extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    BottomNavigationView bottomNavigationView;

    NavigationView navigationView;
    Toolbar toolbar;
    Menu menu;
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        drawerLayout=findViewById(R.id.drawer_layout);
        navigationView=findViewById(R.id.navigation_layout);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        menu=navigationView.getMenu();
        navigationView.getHeaderView(0);
        navigationView.bringToFront();

        ActionBarDrawerToggle actionBarDrawerToggle= new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_open,R.string.navigato_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        navigationView.setCheckedItem(R.id.nav_home);


        bottomNavigationView=findViewById(R.id.bottom_navigator);
        bottomNavigationView.setSelectedItemId(R.id.dashboard);



        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected( MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.dashboard:
                        return true;

                    case R.id.home:
                        startActivity(new Intent(getApplication(),MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;



                }
                return false;
            }
        });









    }


    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        switch (item.getItemId()){

            case R.id.nav_home:
            drawerLayout.closeDrawer(GravityCompat.START);
            break;
            case R.id.nav_logout:
                startActivity(new Intent(Dashboard.this,SignUpPage.class));
                break;
            case R.id.nav_frtimage:
                startActivity(new Intent(Dashboard.this,MainActivity8.class));
                break;


        }
        return  false;


    }



    }
