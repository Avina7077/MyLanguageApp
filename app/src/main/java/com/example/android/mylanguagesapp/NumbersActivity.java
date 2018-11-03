package com.example.android.mylanguagesapp;

import android.support.v7.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;



import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_numbers);


        final ArrayList<Lingo> lingoArray = new ArrayList<Lingo>();
        lingoArray.add(new Lingo("ofu","one", R.drawable.number_one, R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Abou", "two", R.drawable.number_two, R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Ato", "three", R.drawable.number_three, R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Ano", "four", R.drawable.number_four, R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Ise", "five", R.drawable.number_five, R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Isi", "six", R.drawable.number_six, R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Asa", "seven", R.drawable.number_seven, R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Asato", "eight", R.drawable.number_eight, R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Itenani", "nine", R.drawable.number_nine, R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Iri", "ten", R.drawable.number_ten, R.raw.midnite_same_i_ah_one));


        LingaAdapter ling = new LingaAdapter(this, lingoArray,R.color.category_numbers);

        Log.d(ACTIVITY_MONITOR, "MONITORING THE NUMBERS ACTIITY");
        ListView lstV = (ListView) findViewById(R.id.List_view_Numbers);

        lstV.setAdapter(ling);
        lstV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Lingo lingoo = lingoArray.get(position);
                releaseMediaPlayer();
                mediaPlayer= MediaPlayer.create(NumbersActivity.this,lingoo.getAudioId());
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