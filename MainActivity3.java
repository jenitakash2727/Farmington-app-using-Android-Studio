package com.example.card2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    ViewPager viewPager;
    ImageView imageView;
    TextView tv2,kilo,kilorupees,kiloffer,gram,gramrupees,gramoffer;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        imageView=findViewById(R.id.imageview);
        tv2=findViewById(R.id.tv2);
        kilo=findViewById(R.id.kilo);
        kilorupees=findViewById(R.id.kilorupees);
        kiloffer=findViewById(R.id.kilooffer);
        gram=findViewById(R.id.gram);
        gramrupees=findViewById(R.id.gramrupees);
        gramoffer=findViewById(R.id.gramoffer);
        btn=findViewById(R.id.paybtn2);

        viewPager=(ViewPager)findViewById(R.id.main3myviewpager);
        Main3ViewPageAdapter main3ViewPageAdapter =new Main3ViewPageAdapter(this);
        viewPager.setAdapter(main3ViewPageAdapter);

    }
}