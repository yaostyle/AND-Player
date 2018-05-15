package com.android.chrishsu.andplayer;
/* Genre Class to store albums' information */
public class Genre {
    // Init Vars
    private String mGenreName;
    private int mImageId;

    // Album constructors to take 3 params: name, artist, & imageId
    public Genre (String name, int imageId) {
        this.mGenreName = name;
        this.mImageId = imageId;
    }

    // Gettter for name
    public String getGenreName() {
        return this.mGenreName;
    }

    // Getter for imageId
    public int getImageId() {
        return this.mImageId;
    }
}

