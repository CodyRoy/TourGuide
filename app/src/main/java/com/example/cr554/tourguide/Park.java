package com.example.cr554.tourguide;
/**
 * Created by cr554 on 2/14/2017.\
 * a class to hold information about various parks
 */

class Park {
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

    Park(int vImg, String vName, String vLoacation){
        mImg=vImg;
        mName=vName;
        mLocation=vLoacation;
    }
}
