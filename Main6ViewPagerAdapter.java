package com.example.card2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class Main6ViewPagerAdapter extends PagerAdapter {

    private Context context;
    private Integer[] images={R.drawable.image5,R.drawable.cbgeimage2,R.drawable.cbgimage3};
    private LayoutInflater layoutInflater;

    public Main6ViewPagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject( View view,  Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.main6_layout,null);

        ImageView imageView=(ImageView)view.findViewById(R.id.cabbiageimg);
        imageView.setImageResource(images[position]);

        ViewPager viewPager=(ViewPager)container;
        viewPager.addView(view);
        return  view;
    }

    @Override
    public void destroyItem( ViewGroup container, int position, Object object) {
        ViewPager viewPager=(ViewPager)container;
        View view=(View)object;
        viewPager.removeView(view);
    }
}
