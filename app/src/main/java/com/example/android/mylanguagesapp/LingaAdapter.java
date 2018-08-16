package com.example.android.mylanguagesapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by MICHAEL on 13/08/2018.
 */

public class LingaAdapter extends ArrayAdapter<Lingo> {


    public LingaAdapter(Activity context, ArrayList<Lingo> lingoArray) {
        super(context, 0, lingoArray);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //return super.getView(position, convertView, parent);

            Lingo lingoView = getItem(position);

            View listItemView = convertView;

            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view, parent);
            }

            TextView textView1 = listItemView.findViewById(R.id.TxT1);
            textView1.setText(lingoView.getTheIgboTranslation());

            TextView textView2 = listItemView.findViewById(R.id.TxT2);
            textView2.setText(lingoView.getTheDefaultTranslation());

            ImageView imageView = listItemView.findViewById(R.id.ImageVV);
            imageView.setImageResource(lingoView.getTheIdValue());
            return listItemView;
        }
    }


