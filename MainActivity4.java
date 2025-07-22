package com.example.card2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    ViewPager viewPager;
    ImageView imageView;
    TextView tv2,kilo,kilorupees,kiloffer,gram,gramrupees,gramoffer;
    Button btn;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        viewPager=(ViewPager)findViewById(R.id.main2myviewpager);
        imageView=findViewById(R.id.beetrootimg);
        tv2=findViewById(R.id.tv2);
        kilo=findViewById(R.id.kilo);
        kilorupees=findViewById(R.id.kilorupees);
        kiloffer=findViewById(R.id.kilooffer);
        gram=findViewById(R.id.gram);
        gramrupees=findViewById(R.id.gramrupees);
        gramoffer=findViewById(R.id.gramoffer);
        viewPager=(ViewPager)findViewById(R.id.myviewpager);
        btn=findViewById(R.id.paybtn3);
        Main4ViewPagerAdapter main4ViewPagerAdapter=new Main4ViewPagerAdapter(this);
        viewPager.setAdapter(main4ViewPagerAdapter);
    }
}