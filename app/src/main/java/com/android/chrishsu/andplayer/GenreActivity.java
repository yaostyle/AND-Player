package com.android.chrishsu.andplayer;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;

public class GenreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.genre_list);

        final ArrayList<Genre> genres = new ArrayList<Genre>();

        genres.add(new Genre("Pop",
                R.mipmap.genre_pop, R.mipmap.genre_cover_pop));
        genres.add(new Genre("Hip Pop",
                R.mipmap.genre_hip_pop,
                R.mipmap.genre_cover_hippop));
        genres.add(new Genre("R&B",
                R.mipmap.genre_rnb,
                R.mipmap.genre_cover_rnb));
        genres.add(new Genre("Country",
                R.mipmap.genre_country,
                R.mipmap.genre_cover_country));
        genres.add(new Genre("Jazz",
                R.mipmap.genre_jazz,
                R.mipmap.genre_cover_jazz));
        genres.add(new Genre("Electronic",
                R.mipmap.genre_electronic,
                R.mipmap.genre_cover_elec));

        GenreAdapter adapter = new GenreAdapter(this, genres);
        final ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Genre genre = genres.get(i);
                Intent collectionIntent = new Intent(GenreActivity.this, CollectionActivity.class);
                collectionIntent.putExtra("COLLECTION_TITLE", genre.getGenreName());
                collectionIntent.putExtra("COLLECTION_COVER_IMG_ID", genre.getCoverImageId());
                startActivity(collectionIntent);
            }
        });

    }
}
