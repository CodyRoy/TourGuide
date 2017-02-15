package com.example.cr554.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView restaurantTextView = (TextView) findViewById(R.id.restaurant);
        restaurantTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent restaurantIntent = new Intent(MainActivity.this,RestaurantActivity.class);

                startActivity(restaurantIntent);
            }
        });

        TextView parkTextView = (TextView) findViewById(R.id.park);
        parkTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent parkIntent = new Intent(MainActivity.this, ParkActivity.class);
                startActivity(parkIntent);
            }
        });

        TextView eventTextView = (TextView) findViewById(R.id.event);
        eventTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eventIntent = new Intent(MainActivity.this, EventActivity.class);
                startActivity(eventIntent);
            }
        });
    }
}
