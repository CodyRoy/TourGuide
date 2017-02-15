package com.example.cr554.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

//TODO: create adapter, populate array, create event milford class

public class EventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        //make + populate array
        ArrayList<EventMilford> events = new ArrayList<>();
        events.add(new EventMilford(R.drawable.eisenhower,"Eisenhower State Park", "780 North Street"));
        events.add(new EventMilford(R.drawable.silver_sands_300,"Silver Sands Beach","The Coast"));
        events.add(new EventMilford(R.drawable.walnut,"Walnut Beach", "A little below Silver Sands"));
        events.add(new EventMilford(R.drawable.woodmont,"Woodmont Beach", "A Little above Silver Sands"));


        //create + set adapter
        EventAdapter eventAdapter = new EventAdapter(this,events);

        ListView listView = (ListView) findViewById(R.id.activity_event);
        listView.setAdapter(eventAdapter);
    }
}
