package com.example.recyclerview.Adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;

public class FoodAdapter extends RecyclerView.ViewHolder {
    ImageView mImage;
    TextView mTitle;
    CardView mCardView;


    FoodAdapter(View itemView) {
        super(itemView);

        mImage = itemView.findViewById(R.id.imageView);
        mTitle = itemView.findViewById(R.id.textView);
        mCardView = itemView.findViewById(R.id.cardview);
    }
}
