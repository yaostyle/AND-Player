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

public class GenreAdapter extends ArrayAdapter<Genre>{

    public GenreAdapter(@NonNull Context context, ArrayList<Genre> genres) {
        super(context, 0, genres);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Genre currentGenre = getItem(position);

        TextView albumName = (TextView) listItemView.findViewById(R.id.album_name);
        albumName.setText(currentGenre.getGenreName());

        ImageView albumImage = (ImageView) listItemView.findViewById(R.id.album_image);
        albumImage.setImageResource(currentGenre.getImageId());

        return listItemView;

    }
}
