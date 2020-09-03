package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String n1[], n2[];
    int img[] = {R.drawable.biscuit, R.drawable.brownie, R.drawable.dessert, R.drawable.donut, R.drawable.ic_launcher_background,
    R.drawable.ic_launcher_foreground, R.drawable.muffin, R.drawable.pancake, R.drawable.salad, R.drawable.sugar};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        n1 = getResources().getStringArray(R.array.Beverage_Names);
        n2 = getResources().getStringArray(R.array.description);

    }
}
