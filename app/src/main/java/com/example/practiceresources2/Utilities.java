package com.example.practiceresources2;

import java.util.ArrayList;

public class Utilities {
    public static ArrayList<Restaurant> getRestaurants() {
        ArrayList<Restaurant> tmp = new ArrayList<>();
        tmp.add(new Restaurant(R.drawable.bg1,
                "Mayfield Bakery & Cafe",
                "Chinese, American",
                4.3, "200+", 25, 0));
        tmp.add(new Restaurant(R.drawable.bg2,
                "Cafe Brichor's",
                "Chinese, American",
                4.3, "200+", 25, 0));
        tmp.add(new Restaurant(R.drawable.bg3,
                "McDonald's",
                "Chinese, American",
                4.3, "200+", 25, 0));
        tmp.add(new Restaurant(R.drawable.bg1,
                "Mayfield Bakery & Cafe",
                "Chinese, American",
                4.3, "200+", 25, 0));
        tmp.add(new Restaurant(R.drawable.bg2,
                "Cafe Brichor's",
                "Chinese, American",
                4.3, "200+", 25, 0));
        tmp.add(new Restaurant(R.drawable.bg3,
                "McDonald's",
                "Chinese, American",
                4.3, "200+", 25, 0));
        return tmp;
    }
}
