package com.example.android.mylanguagesapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);


        ArrayList<Lingo> lingoArray = new ArrayList<Lingo>();
        lingoArray.add(new Lingo ("ofu","one"));
        lingoArray.add(new Lingo("Abou","two"));
        lingoArray.add(new Lingo("Ato","three"));
        lingoArray.add(new Lingo("Ano","four"));
        lingoArray.add(new Lingo("Ise","five"));
        lingoArray.add(new Lingo("Isi","six"));
        lingoArray.add(new Lingo("Asa","seven"));
        lingoArray.add(new Lingo("Asato","eight"));
        lingoArray.add(new Lingo("Itenani","nine"));
        lingoArray.add(new Lingo("Iri","ten"));


        LingaAdapter ling = new LingaAdapter(this, lingoArray);
        ListView lstV = (ListView) findViewById(R.id.phrases_list);


        lstV.setAdapter(ling);

    }
}
