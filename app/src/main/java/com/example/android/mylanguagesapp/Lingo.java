package com.example.android.mylanguagesapp;

/**
 * Created by MICHAEL on 11/08/2018.
 */

public class Lingo {

    private String mIgboTranslation;
    private String mdefaultTranslation;

    private int mImageId = NO_IMAGE;


    private static final int NO_IMAGE = -1;

    public Lingo(String IgboTranslation, String defaultTranslation) {
        mdefaultTranslation = IgboTranslation;
        mIgboTranslation = defaultTranslation;

    }

    public Lingo(String IgboTranslation, String defaultTranslation, int imgView) {
        mdefaultTranslation = IgboTranslation;
        mIgboTranslation = defaultTranslation;
        this.mImageId = imgView;
    }

    public String getTheIgboTranslation() {
        return mIgboTranslation;
    }


    public String getTheDefaultTranslation() {
        return mdefaultTranslation;
    }


    public int getTheIdValue() {
        return mImageId;
    }


    public boolean hasImage() {

        return (mImageId != NO_IMAGE);
    }

}
