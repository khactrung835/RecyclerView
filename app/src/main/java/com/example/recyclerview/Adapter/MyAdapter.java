package com.example.recyclerview.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.Food;
import com.example.recyclerview.FoodActivity;
import com.example.recyclerview.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<FoodAdapter> {

    private Context mContext;
    private List<Food> models;

    public MyAdapter(Context mContext, List<Food> models) {
        this.mContext = mContext;
        this.models = models;
    }
    @NonNull
    @Override
    public FoodAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_food, parent, false);
        return new FoodAdapter(mView);    }

    @Override
    public void onBindViewHolder(@NonNull final FoodAdapter holder, int position) {
        holder.mImage.setImageResource(models.get(position).getImage());
        holder.mTitle.setText(models.get(position).getName());
        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(mContext, FoodActivity.class);
                mIntent.putExtra("Title",models.get(holder.getAdapterPosition()).getName());
                mIntent.putExtra("Description",models.get(holder.getAdapterPosition()).getDescription());
                mIntent.putExtra("Image",models.get(holder.getAdapterPosition()).getImage());
                mContext.startActivity(mIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
