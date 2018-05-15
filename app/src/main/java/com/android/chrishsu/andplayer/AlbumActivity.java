package com.android.chrishsu.andplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album_list);

        ArrayList<Album> albums = new ArrayList<Album>();
        albums.add(new Album("Album A","Artist AAA", R.mipmap.album_nice_for_what));
        AlbumAdapter adapter = new AlbumAdapter(this, albums);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
