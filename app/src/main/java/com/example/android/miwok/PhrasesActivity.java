package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);


        ArrayList<Phrase> phrases = new ArrayList<Phrase>();
        phrases.add(new Phrase("Where are you going?","minto wuksus"));
        phrases.add(new Phrase("What is your name?", "tinnә oyaase'nә"));
        phrases.add(new Phrase("My name is..","oyaaset..."));
        phrases.add(new Phrase("How are you feeling?","michәksәs?"));
        phrases.add(new Phrase("I'm feeling good.","kuchi achit"));
        phrases.add(new Phrase("Are you comint?","әәnәs'aa?"));
        phrases.add(new Phrase("Yes I'm coming.","hәә’ әәnәm"));
        phrases.add(new Phrase("I'm coming.","әәnәm"));
        phrases.add(new Phrase("Let's go.","yoowutis"));
        phrases.add(new Phrase("Come here.","әnni'nem"));

        PhraseAdapter phraseAdapter = new PhraseAdapter(this, phrases);

        ListView listView = findViewById(R.id.phrases);

        listView.setAdapter(phraseAdapter);
    }
}
