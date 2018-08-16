package com.example.android.mylanguagesapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    String RENDER_ISSUES= "AndroidalTest";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(RENDER_ISSUES , "lets see what happes here");

    }
    public void colorButton(View view)
    {
        Intent intent;
        intent = new Intent(MainActivity.this, ColorActivity.class);
        startActivity(intent);
    }

    public void NumbersButton(View view)
    {
        Intent intent1;
        intent1 = new Intent(MainActivity.this, NumbersActivity.class);
        startActivity(intent1);
    }
}