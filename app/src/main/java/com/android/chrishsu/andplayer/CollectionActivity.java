package com.android.chrishsu.andplayer;

import android.app.ActionBar;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Adapter;
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
        }
    }

    public void jazzSongsInit() {
        final ArrayList<Song> songs = new ArrayList<Song>();
        attachAdapter(songs);
    }

    public void countrySongsInit() {
        final ArrayList<Song> songs = new ArrayList<Song>();
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

        attachAdapter(songs);
    }

    public void rnbSongsInit() {
        final ArrayList<Song> songs = new ArrayList<Song>();
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

        attachAdapter(songs);
    }

    public void popSongsInit() {
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

        attachAdapter(songs);
    }

    public void hippopSongsInit() {
        final ArrayList<Song> songs = new ArrayList<Song>();
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

        attachAdapter(songs);
    }

    public void attachAdapter(ArrayList<Song> songs){
        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.song_list);
        listView.setAdapter(adapter);
    }
}
