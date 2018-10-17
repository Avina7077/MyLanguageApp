package com.example.android.mylanguagesapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<Lingo> lingoArray = new ArrayList<Lingo>();
        lingoArray.add(new Lingo ("Paapa","Father",R.drawable.family_father));
        lingoArray.add(new Lingo("Mama","Mother",R.drawable.family_mother));
        lingoArray.add(new Lingo("Nwanne Nwoke  Ukwu","Senior Brother",R.drawable.family_older_brother));
        lingoArray.add(new Lingo("Nwanne Nwanyi Ukwu","Senor Sister",R.drawable.family_older_sister));
        lingoArray.add(new Lingo("Nwanne Nwoke Nta","Junior Brother",R.drawable.family_younger_brother));
        lingoArray.add(new Lingo("Nwanne Nwanyi Nta","Junior Sister",R.drawable.family_younger_sister));
        lingoArray.add(new Lingo("Nwa Nwoke","Son",R.drawable.family_son));
        lingoArray.add(new Lingo("Nwa Nwanyi","Daughter",R.drawable.family_daughter));
        lingoArray.add(new Lingo("Nnam Ukwu","Grand Father",R.drawable.family_grandfather));
        lingoArray.add(new Lingo("Nnem Ukwu","Grand MOther",R.drawable.family_grandmother));


        LingaAdapter ling = new LingaAdapter(this, lingoArray);

        ListView lstV = (ListView) findViewById(R.id.family_list);

        lstV.setAdapter(ling);

    }
}
