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
 * park adapter. Is it possible to create a generic adapter?
 */

public class ParkAdapter extends ArrayAdapter<Park> {
    public ParkAdapter(Activity context, ArrayList<Park> parks){
        super(context, 0, parks);
    }
    @Override
    public View getView (int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.park_list_item, parent, false);
        }
        Park currentPark = getItem(position);

        ImageView imageView = (ImageView)listItemView.findViewById(R.id.img);
        imageView.setImageResource(currentPark.getmImg());

        TextView nameTextView = (TextView)listItemView.findViewById(R.id.parkName);
        nameTextView.setText(currentPark.getmName());

        TextView locationTextView = (TextView)listItemView.findViewById(R.id.parkLocation);
        locationTextView.setText(currentPark.getmLocation());

        return listItemView;
    }
}
