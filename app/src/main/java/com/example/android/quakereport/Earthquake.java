package com.example.android.quakereport;

/**
 * Created by avishai on 9/6/2017.
 */

public class Earthquake {

    private double mMagnitude;
    private String mPlace;
    private long mTimeInMilliseconds;
    private String mUrl;

    public Earthquake(double magnitude, String place, long timeInMilliseconds, String url) {
        this.mTimeInMilliseconds = timeInMilliseconds;
        this.mMagnitude = magnitude;
        this.mPlace = place;
        this.mUrl = url;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

//    public String getDate() {
//        return mDate;
//    }

    public String getPlace() {
        return mPlace;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getUrl(){
        return mUrl;
    }




}
