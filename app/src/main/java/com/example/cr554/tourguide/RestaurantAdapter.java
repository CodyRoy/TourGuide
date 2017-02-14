package com.example.cr554.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by cr554 on 2/14/2017.
 * adapter to dynamically load the items in the list
 */

public class RestaurantAdapter extends ArrayAdapter<Restaurant> {
    public RestaurantAdapter(Activity context, ArrayList<Restaurant> restaurants){
        super(context, 0,restaurants);
    }
    @Override
    public View getView (int position, View convertView, ViewGroup parent){

        View listItemView = convertView;
        if(listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.restaurant_list_item, parent, false);
        }
        Restaurant currentRestaurant= getItem(position);

        TextView ratingTextView = (TextView) listItemView.findViewById(R.id.rating);
        ratingTextView.setText(currentRestaurant.getRating());

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.restaurantName);
        nameTextView.setText(currentRestaurant.getName());

        TextView foodTextView = (TextView) listItemView.findViewById(R.id.typeOfFood);
        foodTextView.setText(currentRestaurant.getTypeOfFood());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.streetAddress);
        addressTextView.setText(currentRestaurant.getAddress());

        return listItemView;
    }
}
