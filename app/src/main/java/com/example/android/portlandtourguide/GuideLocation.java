package com.example.android.portlandtourguide;

public class GuideLocation {
    private final String mCity = "Portland";
    private final String mState = "Oregon";
    private String mName;
    private String mAddress;
    private int mImageResourceId;
    private final int NO_IMAGE_ID = -1;

    public GuideLocation(String name, String address) {
        mName = name;
        mAddress = address;
        mImageResourceId = NO_IMAGE_ID;
    }

    public GuideLocation(String name, String address, int imageResourceId) {
        mName = name;
        mAddress = address;
        mImageResourceId = imageResourceId;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }

    public String getAddress() {
        return mAddress + ", " + mCity + ", " + mState;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_ID;
    }
}