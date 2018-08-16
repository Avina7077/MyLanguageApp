package com.example.android.mylanguagesapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


    //TextView textView = findViewById(R.id.TxT1)
    ArrayList<Lingo> lingoArray = new ArrayList<Lingo>();
    lingoArray.add(new Lingo ("ofu","one",1));
    lingoArray.add(new Lingo("Abou","two",2));
    lingoArray.add(new Lingo("Ato","three",3));
    lingoArray.add(new Lingo("Ano","four",4));
    lingoArray.add(new Lingo("Ise","five",5));
    lingoArray.add(new Lingo("Isi","six",6));
    lingoArray.add(new Lingo("Asa","seven",7));
    lingoArray.add(new Lingo("Asato","eight",8));
    lingoArray.add(new Lingo("Itenani","nine",9));
    lingoArray.add(new Lingo("Iri","ten",10));


    LingaAdapter ling = new LingaAdapter(this, lingoArray);

    ListView lstV = (ListView) findViewById(R.id.List_view_Numbers);

lstV.setAdapter(ling);
    }
}