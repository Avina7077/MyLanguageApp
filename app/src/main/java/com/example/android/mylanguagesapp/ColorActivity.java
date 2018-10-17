package com.example.android.mylanguagesapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);


        ArrayList<Lingo> lingoArray = new ArrayList<Lingo>();
        lingoArray.add(new Lingo ("ofu","one", R.drawable.color_black));
        lingoArray.add(new Lingo("Abou","two",R.drawable.color_brown));
        lingoArray.add(new Lingo("Ato","three",R.drawable.color_dusty_yellow));
        lingoArray.add(new Lingo("Ano","four",R.drawable.color_gray));
        lingoArray.add(new Lingo("Ise","five",R.drawable.color_green));
        lingoArray.add(new Lingo("Isi","six",R.drawable.color_mustard_yellow));
        lingoArray.add(new Lingo("Asa","seven",R.drawable.color_red));
        lingoArray.add(new Lingo("Asato","eight",R.drawable.color_white));
        lingoArray.add(new Lingo("Itenani","nine",R.drawable.color_black));
        lingoArray.add(new Lingo("Iri","ten",R.drawable.color_black));

        LingaAdapter ling = new LingaAdapter(this, lingoArray);

        ListView lstV = (ListView) findViewById(R.id.LisT_view_Colors);

        lstV.setAdapter(ling);

    }

}