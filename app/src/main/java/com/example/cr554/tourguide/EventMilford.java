package com.example.cr554.tourguide;

/**
 * Created by cr554 on 2/15/2017.
 */
class EventMilford {
    private int mImg;
    private String mName;
    private String mLocation;

     int getmImg() {
        return mImg;
    }

     String getmLocation() {
        return mLocation;
    }

     String getmName() {
        return mName;
    }

     EventMilford(int vImg, String vName, String vLoacation){
        mImg=vImg;
        mName=vName;
        mLocation=vLoacation;
    }
}
