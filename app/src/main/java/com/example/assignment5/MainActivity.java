package com.example.assignment5;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);


        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<Product> productList = new ArrayList<>();

        productList.add(new Product("Golden Horizon", 1.99));
        productList.add(new Product("Twinkle wrap", 0.99));
        productList.add(new Product("Seren Stream", 2.49));
        productList.add(new Product("Infinity Spark", 3.49));
        productList.add(new Product("Gleaming Halo", 1.49));
        productList.add(new Product("Aurora Circle", 2.65));
        productList.add(new Product("Mystic Chimes", 2.99));

        adapter = new ProductAdapter(productList);
        recyclerView.setAdapter(adapter);
    }
}