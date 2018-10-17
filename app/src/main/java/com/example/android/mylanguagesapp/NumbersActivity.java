package com.example.android.mylanguagesapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    String ACTIVITY_MONITOR = " com.example.android.mylanguagesapp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


        ArrayList<Lingo> lingoArray = new ArrayList<Lingo>();
        lingoArray.add(new Lingo("ofu","one", R.drawable.number_one));
        lingoArray.add(new Lingo("Abou", "two", R.drawable.number_two));
        lingoArray.add(new Lingo("Ato", "three", R.drawable.number_three));
        lingoArray.add(new Lingo("Ano", "four", R.drawable.number_four));
        lingoArray.add(new Lingo("Ise", "five", R.drawable.number_five));
        lingoArray.add(new Lingo("Isi", "six", R.drawable.number_six));
        lingoArray.add(new Lingo("Asa", "seven", R.drawable.number_seven));
        lingoArray.add(new Lingo("Asato", "eight", R.drawable.number_eight));
        lingoArray.add(new Lingo("Itenani", "nine", R.drawable.number_nine));
        lingoArray.add(new Lingo("Iri", "ten", R.drawable.number_ten));


        LingaAdapter ling = new LingaAdapter(this, lingoArray);

        Log.d(ACTIVITY_MONITOR, "MONITORING THE NUMBERS ACTIITY");
        ListView lstV = (ListView) findViewById(R.id.List_view_Numbers);

        lstV.setAdapter(ling);



        //TextView textView = findViewById(R.id.TxT1)
    }
}