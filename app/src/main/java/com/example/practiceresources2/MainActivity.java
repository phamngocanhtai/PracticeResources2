package com.example.practiceresources2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvRestaurant;
    ArrayList<Restaurant> restaurantArrayList;
    RestaurantAdapter restaurantAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvRestaurant = findViewById(R.id.rvRestaurant);
        restaurantArrayList = new ArrayList<>();
        restaurantArrayList.addAll(Utilities.getRestaurants());
        restaurantAdapter = new RestaurantAdapter(MainActivity.this, restaurantArrayList);
        rvRestaurant.setAdapter(restaurantAdapter);
        rvRestaurant.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false));
    }
}