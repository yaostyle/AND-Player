package com.android.chrishsu.andplayer;

import android.app.ActionBar;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CollectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection);

        String collection_title = getIntent().getStringExtra("COLLECTION_TITLE");
        setTitle("Collection: " + collection_title);

        int collection_image_resource_id = getIntent().getIntExtra("COLLECTION_COVER_IMG_ID", -1);
        ImageView collection_cover_image = (ImageView) findViewById(R.id.colct_cover_image);
        collection_cover_image.setImageResource((int) collection_image_resource_id);
        collection_cover_image.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY);

        TextView colct_textview = (TextView) findViewById(R.id.colct_cover_title);
        colct_textview.setText(collection_title);

    }

}
