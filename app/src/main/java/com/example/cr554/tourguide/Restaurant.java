package com.example.cr554.tourguide;

/**
 * Created by cr554 on 2/14/2017.
 */

public class Restaurant {
    private String rating;
    private String name;
    private String typeOfFood;
    private String address;

    public Restaurant(String i, String restaurantName, String food, String streetAddress){
        //should use setters?
        rating = i;
        name = restaurantName;
        typeOfFood = food;
        address = streetAddress;
    }

    public String getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public String getAddress(){
        return address;
    }

}
