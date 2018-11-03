package com.example.android.mylanguagesapp;

import android.support.v7.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;



import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    String ACTIVITY_MONITOR = " com.example.android.mylanguagesapp";
    MediaPlayer mediaPlayer;
    MediaPlayer.OnCompletionListener mCompletionListener =new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);


        final ArrayList<Lingo> lingoArray = new ArrayList<Lingo>();
        lingoArray.add(new Lingo("ofu","one",R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Abou", "two",R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Ato", "three",R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Ano", "four",R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Ise", "five",R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Isi", "six",R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Asa", "seven",R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Asato", "eight",R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Itenani", "nine",R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Iri", "ten",R.raw.midnite_same_i_ah_one));


        LingaAdapter ling = new LingaAdapter(this, lingoArray,R.color.category_phrases);

        Log.d(ACTIVITY_MONITOR, "MONITORING THE NUMBERS ACTIITY");
        ListView lstV = (ListView) findViewById(R.id.phrases_list);

        lstV.setAdapter(ling);
        lstV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Lingo lingoo = lingoArray.get(position);
                releaseMediaPlayer();
                mediaPlayer= MediaPlayer.create( PhrasesActivity.this ,lingoo.getAudioId());
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