package com.example.cr554.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class ParkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_park);

        //make+populate a list of parks
        ArrayList<Park> parks = new ArrayList<>();
        parks.add(new Park(R.drawable.eisenhower,"Eisenhower State Park", "780 North Street"));

        //create +set the adapter
        ParkAdapter parkAdapter = new ParkAdapter(this, parks);

        ListView listView = (ListView) findViewById(R.id.activity_park);
        listView.setAdapter(parkAdapter);
    }
}
