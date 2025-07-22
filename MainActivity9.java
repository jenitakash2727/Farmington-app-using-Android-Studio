package com.example.card2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity9 extends AppCompatActivity {
    ViewPager viewPager;
    ImageView imageView;
    TextView tv2,kilo,kilorupees,kiloffer,gram,gramrupees,gramoffer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        viewPager=(ViewPager)findViewById(R.id.m9viewpager);
        imageView=findViewById(R.id.mngimg);
        tv2=findViewById(R.id.tv2);
        kilo=findViewById(R.id.kilo);
        kilorupees=findViewById(R.id.kilorupees);
        kiloffer=findViewById(R.id.kilooffer);
        gram=findViewById(R.id.gram);
        gramrupees=findViewById(R.id.gramrupees);
        gramoffer=findViewById(R.id.gramoffer);
        MangoViewPageAdapter mangoViewPageAdapter=new MangoViewPageAdapter(this);
        viewPager.setAdapter(mangoViewPageAdapter);




    }
}