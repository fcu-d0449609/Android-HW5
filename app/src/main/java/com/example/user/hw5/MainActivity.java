package com.example.user.hw5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<AlbumItem> albumlist = new ArrayList<AlbumItem>();

        albumlist.add(new AlbumItem("Boston",R.drawable.a,"95","Kings",R.drawable.c,"116"));
        albumlist.add(new AlbumItem("Raptors",R.drawable.b,"94","Spyas",R.drawable.d,"121"));
        AlbumArrayAdapter adapter = new AlbumArrayAdapter(this,albumlist);

        ListView nba = (ListView)findViewById(R.id.nba);
        nba.setAdapter((ListAdapter) adapter);
    }
}
