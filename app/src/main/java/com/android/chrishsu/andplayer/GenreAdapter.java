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
/*
    GenreAdapter
 */
public class GenreAdapter extends ArrayAdapter<Genre>{
    // Create GenreAdapter constructor
    public GenreAdapter(@NonNull Context context, ArrayList<Genre> genres) {
        super(context, 0, genres);
    }

    /*
        Override getView method
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Create a view
        View listItemView = convertView;

        // If the view is null, inflate it by id: list_item
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the current genre by the position id
        Genre currentGenre = getItem(position);

        // Set the name to the view
        TextView albumName = (TextView) listItemView.findViewById(R.id.album_name);
        albumName.setText(currentGenre.getGenreName());

        // Set the image resource ID to the view
        ImageView albumImage = (ImageView) listItemView.findViewById(R.id.album_image);
        albumImage.setImageResource(currentGenre.getImageId());

        // return the view
        return listItemView;
    }
}
