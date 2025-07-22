package com.example.card2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {

    ViewPager viewPager;
    ImageView imageView;
    TextView tv2,kilo,kilorupees,kiloffer,gram,gramrupees,gramoffer;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        viewPager=(ViewPager)findViewById(R.id.myviewpager6);
        imageView=findViewById(R.id.cabbiageimg);
        tv2=findViewById(R.id.tv2);
        kilo=findViewById(R.id.kilo);
        kilorupees=findViewById(R.id.kilorupees);
        kiloffer=findViewById(R.id.kilooffer);
        gram=findViewById(R.id.gram);
        gramrupees=findViewById(R.id.gramrupees);
        gramoffer=findViewById(R.id.gramoffer);
        button=findViewById(R.id.paybtn5);

        Main6ViewPagerAdapter main6ViewPagerAdapter=new Main6ViewPagerAdapter(this);
        viewPager.setAdapter(main6ViewPagerAdapter);
    }
}