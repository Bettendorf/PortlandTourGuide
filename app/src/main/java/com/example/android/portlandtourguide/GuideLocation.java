package com.example.android.portlandtourguide;

public class GuideLocation {
    private String mName;
    private String mAddress;
    private String mDescription;
    private int mImageResourceId;
    private final int NO_IMAGE_ID = -1;

    public GuideLocation(String name, String address, String description, int imageResourceId) {
        mName = name;
        mAddress = address;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    public String getName() {
        return mName;
    }

    public String getAddress() {
        return mAddress;
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