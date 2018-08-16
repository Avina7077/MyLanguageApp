package com.example.android.mylanguagesapp;

/**
 * Created by MICHAEL on 11/08/2018.
 */

public class Lingo {
    private String mIgboTranslation;
    private String mdefaultTranslation;

    private int _ID;

    public Lingo(String IgboTranslation, String defaultTranslation, int _ID)
    {
        mdefaultTranslation = IgboTranslation;
        mIgboTranslation = defaultTranslation;
        this._ID=_ID;
    }

    public String getTheIgboTranslation(){ return mIgboTranslation;}


    public String getTheDefaultTranslation(){return mdefaultTranslation;}


    public int getTheIdValue()
    {
            return _ID;
    }
}