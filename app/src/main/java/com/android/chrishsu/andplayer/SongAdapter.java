package com.android.chrishsu.andplayer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends  ArrayAdapter<Song> {

    public SongAdapter(@NonNull Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_song, parent, false);
        }

        Song currentSong = getItem(position);

        TextView songTitle = (TextView) listItemView.findViewById(R.id.song_title);
        songTitle.setText(currentSong.getSongTitle());

        TextView songAlbum = (TextView) listItemView.findViewById(R.id.song_album);
        songAlbum.setText(currentSong.getSongAlbum());

        TextView songArtist = (TextView) listItemView.findViewById(R.id.song_artist);
        songArtist.setText(currentSong.getSongArtist());

        TextView songDuration = (TextView) listItemView.findViewById(R.id.song_duration);
        songDuration.setText(currentSong.getSongDuration());

        return listItemView;
    }
}


