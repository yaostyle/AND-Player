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
/*
    GenreActivity
 */
public class GenreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the custom layout by id: genre_list
        setContentView(R.layout.genre_list);

        // Create a ArrayList<Genre>
        final ArrayList<Genre> genres = new ArrayList<Genre>();
        // Adding genre's data
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

        // Create a GenreAdapter
        GenreAdapter adapter = new GenreAdapter(this, genres);

        // Get the ListView by id: list
        final ListView listView = (ListView) findViewById(R.id.list);

        // Set the adapter to listView
        listView.setAdapter(adapter);

        /*
            Create a ClickListener and set a explicit intent with Extra vars
         */
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Get the current genre
                Genre genre = genres.get(i);

                // Create new Intent
                Intent collectionIntent = new Intent(GenreActivity.this, CollectionActivity.class);

                // Adding Extra info: COLLECTION_TITLE for the genre title,
                // COLLECTION_COVER_IMG_ID for the cover image resource ID
                collectionIntent.putExtra("COLLECTION_TITLE", genre.getGenreName());
                collectionIntent.putExtra("COLLECTION_COVER_IMG_ID", genre.getCoverImageId());

                // Start intent activity
                startActivity(collectionIntent);
            }
        });

    }
}
