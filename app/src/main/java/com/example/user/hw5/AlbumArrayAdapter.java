package com.example.user.hw5;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by USER on 2017/6/4.
 */

public class AlbumArrayAdapter extends ArrayAdapter<AlbumItem>{
    Context context;
    public AlbumArrayAdapter(Context context, ArrayList<AlbumItem> items) {
        super(context,0,items);
        this.context = context;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = LayoutInflater.from(context);
        LinearLayout itemlayout = null;
        if(convertView == null){
            itemlayout = (LinearLayout)inflater.inflate(R.layout.listitem,null);
        }
        else{
            itemlayout = (LinearLayout) convertView;
        }

        AlbumItem item = (AlbumItem)getItem(position);
        TextView hostname = (TextView)itemlayout.findViewById(R.id.hostname);
        hostname.setText(item.name);
        TextView guestname = (TextView)itemlayout.findViewById(R.id.guestname);
        guestname.setText(item.name1);
        TextView hostscore = (TextView)itemlayout.findViewById(R.id.hostscore);
        hostscore.setText(item.score);
        TextView guestscore = (TextView)itemlayout.findViewById(R.id.guestscore);
        guestscore.setText(item.score1);
        ImageView Pacers = (ImageView)itemlayout.findViewById(R.id.Pacers);
        Pacers.setImageResource(item.imgid);
        ImageView Cavs = (ImageView)itemlayout.findViewById(R.id.Cavs);
        Cavs.setImageResource(item.imgid1);

        return itemlayout;
    }




}
