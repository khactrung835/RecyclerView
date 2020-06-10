package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodActivity extends AppCompatActivity {
    Toolbar mtoolbar;
    ImageView imageView;
    TextView mDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        mtoolbar = findViewById(R.id.toolbar);
        imageView = findViewById(R.id.imageViewFood);
        mDescription = findViewById(R.id.textView_detail_Description);

        Bundle bundle =getIntent().getExtras();
        if (bundle != null) {
            mtoolbar.setTitle(bundle.getString("Title"));
            imageView.setImageResource(bundle.getInt("Image"));
            mDescription.setText(bundle.getString("Description"));
        }
    }
}
