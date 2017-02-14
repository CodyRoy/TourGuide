package com.example.cr554.tourguide;

/**
 * Created by cr554 on 2/14/2017.
 * Class to hold information about a given restaurant
 */

public class Restaurant {
    private String mRating;
    private String mName;
    private String mTypeOfFood;
    private String mAddress;

    public Restaurant(String i, String restaurantName, String food, String streetAddress){
        //should use setters?
        mRating = i;
        mName = restaurantName;
        mTypeOfFood = food;
        mAddress = streetAddress;
    }

    public String getmRating() {
        return mRating;
    }

    public String getmName() {
        return mName;
    }

    public String getmTypeOfFood() {
        return mTypeOfFood;
    }

    public String getmAddress(){
        return mAddress;
    }

}
