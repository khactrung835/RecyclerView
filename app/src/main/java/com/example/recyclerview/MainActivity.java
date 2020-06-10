package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview.Adapter.MyAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Toolbar mToolbar;
    RecyclerView mRecyclerView;
    List< Food > models;
    Food food;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = findViewById(R.id.toolbar);
        mToolbar.setTitle(getResources().getString(R.string.app_name));
        mRecyclerView = findViewById(R.id.recyclerview);
        GridLayoutManager mGridLayoutManager = new GridLayoutManager(MainActivity.this, 2);
        mRecyclerView.setLayoutManager(mGridLayoutManager);

        models = new ArrayList<>();
        food = new Food("TakoYaki",getString(R.string.description),R.drawable.yasai);
        models.add(food);
        food = new Food("TakoYaki",getString(R.string.description),R.drawable.yasai);
        models.add(food);
        food = new Food("TakoYaki",getString(R.string.description),R.drawable.yasai);
        models.add(food);
        food = new Food("TakoYaki",getString(R.string.description),R.drawable.yasai);
        models.add(food);
        food = new Food("TakoYaki",getString(R.string.description),R.drawable.yasai);
        models.add(food);
        food = new Food("TakoYaki",getString(R.string.description),R.drawable.yasai);
        models.add(food);
        food = new Food("TakoYaki",getString(R.string.description),R.drawable.yasai);
        models.add(food);
        food = new Food("TakoYaki",getString(R.string.description),R.drawable.yasai);
        models.add(food);
        food = new Food("TakoYaki",getString(R.string.description),R.drawable.yasai);
        models.add(food);
        food = new Food("TakoYaki",getString(R.string.description),R.drawable.yasai);
        models.add(food);
        food = new Food("TakoYaki",getString(R.string.description),R.drawable.yasai);
        models.add(food);

        MyAdapter myAdapter = new MyAdapter(MainActivity.this, models);
        mRecyclerView.setAdapter(myAdapter);
    }
}
