package com.example.android.mylanguagesapp;

import android.support.v7.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class FamilyActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    MediaPlayer.OnCompletionListener mCompletionListener=new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);


        final ArrayList<Lingo> lingoArray = new ArrayList<Lingo>();
        lingoArray.add(new Lingo ("Nnanyi","Father", R.drawable.family_father, R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Nneanyi","Mother",R.drawable.family_mother, R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Nwa Nwoke","Son",R.drawable.family_son, R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Nwa Nwanyi","Daughter",R.drawable.family_daughter, R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Nwanne Nwoke nke Obele","Junior Brother",R.drawable.family_younger_brother, R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Nwanne Nwani nke Obele","Junior Sister",R.drawable.family_younger_sister, R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Nwanne Nwoke nke torom","seven",R.drawable.family_older_brother, R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Nwanne Nwani nke torom","eight",R.drawable.family_older_sister, R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Nnam Ochie","GrandFather",R.drawable.family_grandfather, R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Nnem Ochie","GrandFather",R.drawable.family_grandmother, R.raw.midnite_same_i_ah_one));

        LingaAdapter ling = new LingaAdapter(this, lingoArray, R.color.category_family);

        ListView lstV =  findViewById(R.id.family_list);

        lstV.setAdapter(ling);

        lstV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Lingo lingoo = lingoArray.get(position);
                releaseMediaPlayer();
                mediaPlayer= MediaPlayer.create(FamilyActivity.this,lingoo.getAudioId());
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(mCompletionListener);
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }
    public void releaseMediaPlayer() {
        if (mediaPlayer != null)
            mediaPlayer.release();

        mediaPlayer = null;

    }

}