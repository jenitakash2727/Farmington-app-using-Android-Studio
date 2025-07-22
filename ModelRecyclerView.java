package com.example.card2;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ModelRecyclerView extends RecyclerView.Adapter<ModelRecyclerView.ViewHolder> {

    Context context;
    ArrayList<Model> arrayList = new ArrayList<>();

    public ModelRecyclerView(Context context, ArrayList<Model> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.card_view, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.imageView.setImageResource(arrayList.get(position).getImage());
        holder.textView1.setText(arrayList.get(position).getName());
        holder.textView2.setText(arrayList.get(position).getHistory());
        switch (position) {
            case 0:
                holder.cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(context, MainActivity2.class);
                        context.startActivity(intent);
                    }
                });
                break;
            case 1:
                holder.cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(context, MainActivity3.class);
                        context.startActivity(intent);

                    }
                });
                break;
            case 2:
                holder.cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(context, MainActivity4.class);
                        context.startActivity(intent);

                    }
                });
                break;
            case 3:
                holder.cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(context, MainActivity5.class);
                        context.startActivity(intent);

                    }
                });
                break;
            case 4:
                holder.cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(context, MainActivity6.class);
                        context.startActivity(intent);

                    }
                });
                break;


        }

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
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
            button=itemView.findViewById(R.id.payadd);



        }
    }
}
