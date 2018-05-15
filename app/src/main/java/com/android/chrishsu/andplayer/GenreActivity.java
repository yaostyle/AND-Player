package com.android.chrishsu.andplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class GenreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.genre_list);

        ArrayList<Genre> genres = new ArrayList<Genre>();
        genres.add(new Genre("Pop", R.mipmap.genre_pop));
        genres.add(new Genre("Hip Pop", R.mipmap.genre_hip_pop));
        genres.add(new Genre("Country", R.mipmap.genre_country));
        genres.add(new Genre("Jazz", R.mipmap.genre_jazz));
        genres.add(new Genre("Electronic", R.mipmap.genre_electronic));



        GenreAdapter adapter = new GenreAdapter(this, genres);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
