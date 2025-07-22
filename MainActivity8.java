package com.example.card2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity8 extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<FruitsModels> arrayList =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        recyclerView = findViewById(R.id.fruitrecyclerview);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        arrayList.add(new FruitsModels(R.drawable.mngimage1, "Mango", "₹75"));
        arrayList.add(new FruitsModels(R.drawable.cstimage2, "Custard", "₹65"));
        arrayList.add(new FruitsModels(R.drawable.appleimge1, "Apple", "₹85"));
        arrayList.add(new FruitsModels(R.drawable.grapesimage1, "Grapes", "₹65"));
        arrayList.add(new FruitsModels(R.drawable.guavaimage1, "Guava", "₹55"));
        arrayList.add(new FruitsModels(R.drawable.banimage1, "banana", "₹75"));
        arrayList.add(new FruitsModels(R.drawable.pineappleimage1, "pineapple", "₹65"));
        arrayList.add(new FruitsModels(R.drawable.orangeimage1, "Orange", "₹65"));

        FruitsRecyclerView  fruitsRecyclerView= new FruitsRecyclerView (this,arrayList);

        recyclerView.setAdapter(fruitsRecyclerView);
    }
}