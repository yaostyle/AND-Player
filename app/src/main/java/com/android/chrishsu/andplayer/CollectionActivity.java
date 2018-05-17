package com.android.chrishsu.andplayer;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Set;

/*
    CollectionActivity
 */
public class CollectionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Adding back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection);

        /*
           Retrieving Intent Extras
         */
        // Retrieving collection title from Intent Extras: COLLECTION_TITLE
        String collection_title = getIntent().getStringExtra("COLLECTION_TITLE");

        // Set the current Activity title as COLLECTION_TITLE
        setTitle("Collection: " + collection_title);

        // Retrieving cover image's resource id from Intent Extras: COLLECTION_COVER_IMG_ID
        int collection_image_resource_id = getIntent().getIntExtra("COLLECTION_COVER_IMG_ID", -1);

        /*
           Set the cover images to the resource ID
         */
        // First, find the corresponding layout id
        ImageView collection_cover_image = (ImageView) findViewById(R.id.colct_cover_image);

        // Set the resource ID
        collection_cover_image.setImageResource((int) collection_image_resource_id);

        // Make the image darker by filtering with PorterDuff function with MULTIPLY mode
        collection_cover_image.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY);

        // Set the text on top of cover image
        TextView colct_textview = (TextView) findViewById(R.id.colct_cover_title);
        colct_textview.setText(collection_title);

        /*
           Init corresponding song's ArrayList data by collection_title
         */
        if (collection_title.equals("Hip Pop")) {
            hippopSongsInit();
        } else if (collection_title.equals("Pop")) {
            popSongsInit();
        } else if (collection_title.equals("R&B")) {
            rnbSongsInit();
        } else if (collection_title.equals("Country")) {
            countrySongsInit();
        } else if (collection_title.equals("Jazz")) {
            jazzSongsInit();
        } else if (collection_title.equals("Electronic")) {
            electronicSongsInit();
        }
    }

    /*
       Function to init songs in [Electronic] category
     */
    public void electronicSongsInit() {
        // Init ArrayList<Song>
        final ArrayList<Song> songs = new ArrayList<Song>();

        // Adding songs data
        songs.add(new Song("Mind Control",
                "Chris Lorenzo",
                "Insomniac Records",
                "2:16"));
        songs.add(new Song("Earthquake",
                "Hardwell, Harrison",
                "Earthquake",
                "2:57"));
        songs.add(new Song("Sweet Dreams",
                "Breathe Carolina",
                "Sweet Dreams",
                "2:39"));
        songs.add(new Song("Rain",
                "ARTY",
                "Rain",
                "3:22"));
        songs.add(new Song("Alone",
                "Halsey",
                "3:19",
                ""));
        songs.add(new Song("Game Over",
                "Martin Garrix",
                "2:35",
                ""));
        songs.add(new Song("One Kiss",
                "Calvin Harris",
                "One Kiss",
                "3:34"));
        songs.add(new Song("Flames",
                "David Guetta",
                "Flames",
                "6:08"));
        songs.add(new Song("Therapy",
                "Armin van Buuren",
                "A State of Trance",
                "3:04"));

        // Attach songs data to the Adapter
        attachAdapter(songs);
    }

    /*
       Function to init songs in [Jazz] category
     */
    public void jazzSongsInit() {
        // Init ArrayList<Song>
        final ArrayList<Song> songs = new ArrayList<Song>();

        // Adding songs data
        songs.add(new Song("After You've Gone",
                "Eddie Henderson",
                "After You've Gone",
                "7:04"));
        songs.add(new Song("Draw Me Nearer",
                "Joey Alexander",
                "Eclipse",
                "4:42"));
        songs.add(new Song("I Miss You",
                "Emil Brandqvist Trio",
                "Within a Dream",
                "4:18"));
        songs.add(new Song("The Winter of My Discontent",
                "Renee Rosnes",
                "Beloved of the Sky",
                "7:20"));
        songs.add(new Song("Naima",
                "Tommy Flanagan",
                "Giant Steps",
                "5:02"));
        songs.add(new Song("Sad Tune",
                "European Jazz Trio",
                "West Village",
                "6:15"));
        songs.add(new Song("That's All",
                "Jimmy Forrest",
                "Pick Yourself Up",
                "4:52"));
        songs.add(new Song("Atonement",
                "Trio X of Sweden",
                "Atonement",
                "4:02"));
        songs.add(new Song("I Miss You",
                "Emil Brandqvist Trio",
                "I Miss You",
                "4:18"));

        // Attach songs data to the Adapter
        attachAdapter(songs);
    }

    /*
        Function to init songs in [Country] category
     */
    public void countrySongsInit() {
        // Init ArrayList<Song>
        final ArrayList<Song> songs = new ArrayList<Song>();

        // Adding songs data
        songs.add(new Song("Downtown's Dead",
                "Sam Hunt",
                "Downtown's Dead",
                "3:33"));
        songs.add(new Song("I Got You",
                "Josh Mirenda",
                "Josh Mirenda",
                "2:50"));
        songs.add(new Song("Happens Like That",
                "Granger Smith",
                "Happens Like That",
                "2:51"));
        songs.add(new Song("Slower",
                "Filmore",
                "Slower",
                "2:52"));
        songs.add(new Song("Marry Me",
                "Thomas Rhett",
                "Life Changes",
                "3:25"));
        songs.add(new Song("Singles You Up",
                "Jordan Davis",
                "Singles You Up",
                "3:02"));
        songs.add(new Song("She Ain't In It",
                "Jon Pardi",
                "California Sunrise",
                "3:18"));
        songs.add(new Song("Most People Are Good",
                "Luke Bryan",
                "What Makes You Country",
                "3:41"));
        songs.add(new Song("You Make It Easy",
                "Jason Aldean",
                "You Make It Easy",
                "3:16"));

        // Attach songs data to the Adapter
        attachAdapter(songs);
    }

    /*
        Function to init songs in [R&B] category
     */
    public void rnbSongsInit() {
        // Init ArrayList<Song>
        final ArrayList<Song> songs = new ArrayList<Song>();

        // Adding songs data
        songs.add(new Song("Love Lies",
                "Khalid, Normani",
                "Love Lies",
                "3:21"));
        songs.add(new Song("I Sip",
                "Tory Lanez",
                "I Sip",
                "3:16"));
        songs.add(new Song("Happy Without Me",
                "Chloe x Halle",
                "The Kids Are Alright",
                "3:26"));
        songs.add(new Song("Come through and Chill",
                "Miguel, J.Cole",
                "Come Through and Chill",
                "5:22"));
        songs.add(new Song("Boo'd Up",
                "Ella Mai",
                "READY",
                "4:16"));
        songs.add(new Song("Love Me Right",
                "Amber Mark",
                "Love Me Right",
                "4:51"));
        songs.add(new Song("Cutting Ties",
                "6LACK",
                "Cutting Ties",
                "4:21"));
        songs.add(new Song("Sativa",
                "Jhene Aiko",
                "Spotify Singles",
                "4:29"));
        songs.add(new Song("I Like That",
                "Janelle Monae",
                "I Like That",
                "3:20"));
        songs.add(new Song("Hurt To Look",
                "Swae Lee",
                "Hurt To Look",
                "4:16"));

        // Attach songs data to the Adapter  
        attachAdapter(songs);
    }

    /*
        Function to init songs in [Pop] category
     */
    public void popSongsInit() {
        // Init ArrayList<Song>
        final ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("This Is America",
                "Childish Gambino",
                "This Is America",
                "3:46"));
        songs.add(new Song("Youngblood",
                "5 Seconds of Summer",
                "Youngblood",
                "3:23"));
        songs.add(new Song("OTW",
                "Khalid, 6LACK, Ty Dolla $gin",
                "OTW",
                "4:23"));
        songs.add(new Song("One Kiss",
                "Calvin Harris",
                "One Kiss",
                "3:34"));
        songs.add(new Song("Better Now",
                "Post Malone",
                "beerbongs",
                "3:51"));
        songs.add(new Song("Playinwitme",
                "KYLE, Kehlani",
                "Playinwitme",
                "3:13"));
        songs.add(new Song("Somebody",
                "the Chainsmokers",
                "Sick Boy",
                "3:43"));
        songs.add(new Song("Nice For What",
                "Drake",
                "Nice For What",
                "3:30"));
        songs.add(new Song("No Tears Left To Cry",
                "Ariana Grande",
                "No Tears Left To Cry",
                "3:25"));
        songs.add(new Song("lovely",
                "Billie Ellish, Khalid",
                "lovely",
                "3:20"));

        // Attach songs data to the Adapter
        attachAdapter(songs);
    }

    /*
        Function to init songs in [HipPop] category
     */
    public void hippopSongsInit() {
        // Init ArrayList<Song>
        final ArrayList<Song> songs = new ArrayList<Song>();

        // Adding songs data
        songs.add(new Song("Yes Indeed",
                "Lil Baby, Drake",
                "Yes Indeed",
                "2:22"));
        songs.add(new Song("Wine",
                "Jay Rock",
                "Wine",
                "3:34"));
        songs.add(new Song("Watch",
                "Travis Scott",
                "Watch",
                "2:22"));
        songs.add(new Song("Yes Indeed",
                "Lil Baby, Drake",
                "Yes Indeed",
                "2:22"));
        songs.add(new Song("Nice For What",
                "Drake",
                "Nice For What",
                "3:30"));
        songs.add(new Song("Walk It Talk It",
                "Migos, Drake",
                "Culture II",
                "4:36"));
        songs.add(new Song("Shoota",
                "PLayboi Carti",
                "Die Lit",
                "2:33"));
        songs.add(new Song("Look Alive",
                "BlockBoy JB, Drake",
                "Look Alive",
                "3:01"));
        songs.add(new Song("Jettski Grizzley",
                "Tee Grizzley",
                "Activated",
                "2:43"));
        songs.add(new Song("1942",
                "G-Eazy, You Gotta",
                "beerbongs",
                "3:33"));

        // Attach songs data to the Adapter
        attachAdapter(songs);
    }

    /*
        Function to attach songs and create adapter
     */
    public void attachAdapter(final ArrayList<Song> songs){
        // Create new adapter
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the view id by song_list
        ListView listView = (ListView) findViewById(R.id.song_list);

        // Attach adapter to the view
        listView.setAdapter(adapter);

        /*
            Create ClickListener when click on each song, then display a toast message
         */
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Get the current song
                Song song = songs.get(i);

                // Make a toast, but not showing yet
                Toast toast = Toast.makeText(CollectionActivity.this,
                        "Now playing: "+song.getSongTitle(),
                        Toast.LENGTH_SHORT);

                // Create a toast's view so we can change its properties
                View toastView = toast.getView();

                // Change the background to white color and using PorterDuff with SRC_IN mode
                toastView.getBackground().setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_IN);

                // Get a toast's text view
                TextView textView = (TextView) toastView.findViewById(android.R.id.message);

                // Change its shadow layer to transparent
                textView.setShadowLayer(0, 0, 0, Color.TRANSPARENT);

                // Set the text to dark-gray color
                textView.setTextColor(Color.DKGRAY);
                
                // Now, display the toast message
                toast.show();
            }
        });
    }
}
