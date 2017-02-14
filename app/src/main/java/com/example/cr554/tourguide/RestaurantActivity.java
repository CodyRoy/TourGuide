package com.example.cr554.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        //make an array list of Restaurants
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("4","StoneBridge","Seafood","50 Daniel Street"));
        restaurants.add(new Restaurant("4", "Rainbow Gardens", "American", "117 Broad Street"));
        restaurants.add(new Restaurant("5", "MoMo Sushi", "Sushi", "17 Turnpike Square"));
        restaurants.add(new Restaurant("5", "Bobbette's Take Out Bistro", "Deli", "93 Boston Post Rd"));
        //rep
        restaurants.add(new Restaurant("4","StoneBridge","Seafood","50 Daniel Street"));
        restaurants.add(new Restaurant("4", "Rainbow Gardens", "American", "117 Broad Street"));
        restaurants.add(new Restaurant("5", "MoMo Sushi", "Sushi", "17 Turnpike Square"));
        restaurants.add(new Restaurant("5", "Bobbette's Take Out Bistro", "Deli", "93 Boston Post Rd"));
        //rep
        restaurants.add(new Restaurant("4","StoneBridge","Seafood","50 Daniel Street"));
        restaurants.add(new Restaurant("4", "Rainbow Gardens", "American", "117 Broad Street"));
        restaurants.add(new Restaurant("5", "MoMo Sushi", "Sushi", "17 Turnpike Square"));
        restaurants.add(new Restaurant("5", "Bobbette's Take Out Bistro", "Deli", "93 Boston Post Rd"));

        RestaurantAdapter restaurantAdapter = new RestaurantAdapter(this, restaurants);

        ListView listView = (ListView) findViewById(R.id.listViewRestaurant);
        listView.setAdapter(restaurantAdapter);


        //Restaurant r = new Restaurant;
        //restaurants.add(r);
    }
}
