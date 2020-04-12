package com.example.coronax;

public class CovidCountry {
    String mCovidCountry,mCases, mTodayCases, mDeaths, mTodayDeaths, mRecovered, mActive, mCritical;

    public CovidCountry(String mCovidCountry, String mCases) {
        this.mCovidCountry = mCovidCountry;
        this.mCases = mCases;
    }

    public String getmCovidCountry() {
        return mCovidCountry;
    }

    public String getmCases() {
        return mCases;
    }
}
