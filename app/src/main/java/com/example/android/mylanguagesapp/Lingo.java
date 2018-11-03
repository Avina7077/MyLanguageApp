package com.example.android.mylanguagesapp;

/**
 * Created by MICHAEL on 11/08/2018.
 */

public class Lingo {

    private String mIgboTranslation;
    private String mdefaultTranslation;

    private int mImageId = NO_IMAGE;
private int mAudioId;

    private static final int NO_IMAGE = -1;

    public Lingo(String IgboTranslation, String defaultTranslation, int audioId)
    {
        mdefaultTranslation = IgboTranslation;
        mIgboTranslation = defaultTranslation;
        mAudioId=audioId;

    }
    public Lingo(String IgboTranslation, String defaultTranslation, int imgView,int audioId) {
        mdefaultTranslation = IgboTranslation;
        mIgboTranslation = defaultTranslation;
        this.mImageId = imgView;

        mAudioId=audioId;
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


    public boolean hasImage() {return (mImageId != NO_IMAGE);}

    public int getAudioId(){return mAudioId;}
}
