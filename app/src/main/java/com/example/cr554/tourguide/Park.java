package com.example.cr554.tourguide;
/**
 * Created by cr554 on 2/14/2017.\
 * a class to hold information about various parks
 */

public class Park {
    private int mImg;
    private String mName;
    private String mLocation;

    public int getmImg() {
        return mImg;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmName() {
        return mName;
    }

    public Park(int vImg, String vName, String vLoacation){
        mImg=vImg;
        mName=vName;
        mLocation=vLoacation;
    }
}
