package com.example.cr554.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by cr554 on 2/15/2017.
 */

class EventAdapter extends ArrayAdapter<EventMilford>{

    EventAdapter (Activity context, ArrayList<EventMilford> events){
        super(context, 0, events);
    }

    public View getView (int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.event_list_item, parent, false);
        }
        EventMilford currentEvent = getItem(position);

        ImageView imageView = (ImageView)listItemView.findViewById(R.id.eventImg);
        imageView.setImageResource(currentEvent.getmImg());

        TextView nameTextView = (TextView)listItemView.findViewById(R.id.eventName);
        nameTextView.setText(currentEvent.getmName());

        TextView locationTextView = (TextView)listItemView.findViewById(R.id.eventLocation);
        locationTextView.setText(currentEvent.getmLocation());

        return listItemView;
    }
}
