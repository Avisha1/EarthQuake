package com.example.android.quakereport.networking;

import android.content.AsyncTaskLoader;
import android.content.Context;

import com.example.android.quakereport.Earthquake;
import com.example.android.quakereport.QueryUtils;

import java.util.List;

/**
 * Created by avishai on 9/10/2017.
 */

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {

    /** Tag for log messages */
    private static final String LOG_TAG = EarthquakeLoader.class.getName();

    /** Query URL */
    private String mUrl;

    public EarthquakeLoader(Context context, String url) {
        super(context);
        this.mUrl = url;
    }

    @Override
    public List<Earthquake> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        List<Earthquake> result = QueryUtils.fetchEarthquakeData(mUrl);
        return result;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

}
