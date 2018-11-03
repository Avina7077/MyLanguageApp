package com.example.android.mylanguagesapp;

import android.support.v7.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class ColorActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_color);


        final ArrayList<Lingo> lingoArray = new ArrayList<Lingo>();
        lingoArray.add(new Lingo ("ofu","one", R.drawable.color_black, R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Abou","two",R.drawable.color_brown, R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Ato","three",R.drawable.color_dusty_yellow, R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Ano","four",R.drawable.color_gray, R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Ise","five",R.drawable.color_green, R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Isi","six",R.drawable.color_mustard_yellow, R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Asa","seven",R.drawable.color_red, R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Asato","eight",R.drawable.color_white, R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Itenani","nine",R.drawable.color_black, R.raw.midnite_same_i_ah_one));
        lingoArray.add(new Lingo("Iri","ten",R.drawable.color_black, R.raw.midnite_same_i_ah_one));

        LingaAdapter ling = new LingaAdapter(this, lingoArray, R.color.category_colors);

        ListView lstV = (ListView) findViewById(R.id.LisT_view_Colors);

        lstV.setAdapter(ling);

        lstV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Lingo lingoo = lingoArray.get(position);
                releaseMediaPlayer();
                mediaPlayer= MediaPlayer.create(ColorActivity.this,lingoo.getAudioId());
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