package com.example.cr554.tourguide;

/**
 * Created by cr554 on 2/14/2017.
 * Class to hold information about a given restaurant
 */

class Restaurant {
    private String mRating;
    private String mName;
    private String mTypeOfFood;
    private String mAddress;

    Restaurant(String i, String restaurantName, String food, String streetAddress){
        //should use setters?
        mRating = i;
        mName = restaurantName;
        mTypeOfFood = food;
        mAddress = streetAddress;
    }

    String getmRating() {
        return mRating;
    }

    String getmName() {
        return mName;
    }

    String getmTypeOfFood() {
        return mTypeOfFood;
    }

    String getmAddress(){
        return mAddress;
    }

}
