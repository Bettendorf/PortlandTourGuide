package com.example.android.portlandtourguide;

public class GuideLocation {
    private final String mCity = "Portland";
    private final String mState = "Oregon";
    private String mName;
    private String mAddress;
    private String mDescription;
    private int mImageResourceId;
    private final int NO_IMAGE_ID = -1;

    public GuideLocation(String name, String address, String description) {
        mName = name;
        mAddress = address;
        mDescription = description;
        mImageResourceId = NO_IMAGE_ID;
    }

    public GuideLocation(String name, String address, String description, int imageResourceId) {
        mName = name;
        mAddress = address;
        mDescription = description;
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

    public String getDescription() {
        return mDescription;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_ID;
    }
}