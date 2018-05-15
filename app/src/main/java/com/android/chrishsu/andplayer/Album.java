package com.android.chrishsu.andplayer;

/* Album Class to store albums' information */
public class Album {
    // Init Vars
    private String mName;
    private String mArtist;
    private int mImageId;

    // Album constructors to take 3 params: name, artist, & imageId
    public Album (String name, String artist,  int imageId) {
        this.mName = name;
        this.mArtist = artist;
        this.mImageId = imageId;
    }

    // Gettter for name
    public String getAlbumName() {
        return this.mName;
    }

    // Getter for artist
    public String getArtistName() {
        return this.mArtist;
    }

    // Getter for imageId
    public int getImageId() {
        return this.mImageId;
    }
}
