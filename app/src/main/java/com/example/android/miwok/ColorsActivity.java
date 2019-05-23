package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);


        ArrayList<Word> colors = new ArrayList<Word>();
        colors.add(new Word("red","weṭeṭṭi"));
        colors.add(new Word("green","chokokki"));
        colors.add(new Word("brown","ṭakaakki"));
        colors.add(new Word("gray","ṭopoppi"));
        colors.add(new Word("black","kululli"));
        colors.add(new Word("white","kelelli"));
        colors.add(new Word("dusty yellow","ṭopiisә"));
        colors.add(new Word("mustard yellow","chiwiiṭә"));

        WordAdapter colorAdapter = new WordAdapter(this, colors);

        ListView listView = findViewById(R.id.colors);

        listView.setAdapter(colorAdapter);
    }
}