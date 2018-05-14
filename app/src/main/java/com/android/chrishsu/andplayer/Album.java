package com.android.chrishsu.andplayer;

public class Album {
    private String mName;
    private String mArtist;
    private int mImageId;

    public Album (String name, String artist,  int imageId) {
        this.mName = name;
        this.mArtist = artist;
        this.mImageId = imageId;
    }

    public String getName() {
        return this.mName;
    }

    public String getArtist() {
        return this.mArtist;
    }

    public int getImageId() {
        return this.mImageId;
    }
}
