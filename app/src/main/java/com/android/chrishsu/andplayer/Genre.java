package com.android.chrishsu.andplayer;
/* Genre Class to store genre' information */
public class Genre {
    // Init Vars
    private String mGenreName;
    private int mImageId;
    private int mCoverImageId;

    // Genre constructors to take 3 params: name, imageId, coverImageId
    public Genre (String name, int imageId, int coverImageId) {
        this.mGenreName = name;
        this.mImageId = imageId;
        this.mCoverImageId = coverImageId;
    }

    // Gettter for name
    public String getGenreName() {
        return this.mGenreName;
    }

    // Getter for imageId
    public int getImageId() {
        return this.mImageId;
    }

    // Getter for coverImageId
    public int getCoverImageId() {
        return this.mCoverImageId;
    }
}

