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

import org.w3c.dom.Text;

import java.util.ArrayList;

public class AlbumAdapter extends ArrayAdapter<Album>{

    public AlbumAdapter(@NonNull Context context, ArrayList<Album> albums) {
        super(context, 0, albums);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Album currentAlbum = getItem(position);

        TextView albumName = (TextView) listItemView.findViewById(R.id.album_name);
        albumName.setText(currentAlbum.getAlbumName());

        TextView albumArtistName = (TextView) listItemView.findViewById(R.id.album_artist_name);
        albumName.setText(currentAlbum.getArtistName());

        ImageView albumImage = (ImageView) listItemView.findViewById(R.id.album_image);
        albumImage.setImageResource(currentAlbum.getImageId());

        return listItemView;

    }
}
