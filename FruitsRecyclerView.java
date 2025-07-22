package com.example.card2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FruitsRecyclerView extends RecyclerView.Adapter<FruitsRecyclerView.ViewHolder> {
    Context context;
    ArrayList<FruitsModels> arrayList = new ArrayList<>();

    public FruitsRecyclerView(Context context, ArrayList<FruitsModels> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.fruits_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.imageView.setImageResource(arrayList.get(position).getImage());
        holder.textView1.setText(arrayList.get(position).getName());
        holder.textView2.setText(arrayList.get(position).getHistory());
        switch (position){
            case 0:
                holder.cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(context,MainActivity9.class);
                        context.startActivity(intent);
                    }
                });
        }



    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView1, textView2;
        CardView cardView;
        Button button;
        public ViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageview);
            textView1 = itemView.findViewById(R.id.textview);
            textView2 = itemView.findViewById(R.id.textview2);
            cardView = itemView.findViewById(R.id.cardview);
            button=itemView.findViewById(R.id.payadd2);

        }
    }
}
