package com.android.chrishsu.andplayer;
/*
    Song class to store song info
 */
public class Song {
    // Init Vars
    private String mSongTitle;
    private String mSongArtist;
    private String mSongAlbum;
    private String mSongDuration;

    // Song constructors to take 4 params: title, artist, album, duration
    public Song (String title, String artist, String album, String duration) {
        this.mSongTitle = title;
        this.mSongArtist = artist;
        this.mSongAlbum = album;
        this.mSongDuration = duration;
    }

    // Getter for title
    public String getSongTitle() {
        return this.mSongTitle;
    }

    // Getter for artist
    public String getSongArtist() {
        return this.mSongArtist;
    }

    // Getter for album
    public String getSongAlbum() {
        return this.mSongAlbum;
    }

    // Getter for duration
    public String getSongDuration() {
        return this.mSongDuration;
    }
}