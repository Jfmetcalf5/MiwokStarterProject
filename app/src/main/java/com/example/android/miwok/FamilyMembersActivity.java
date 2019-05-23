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

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famile_members);


        ArrayList<Word> familyMembers = new ArrayList<Word>();
        familyMembers.add(new Word("father","әpә"));
        familyMembers.add(new Word("mother","әṭa"));
        familyMembers.add(new Word("son","angsi"));
        familyMembers.add(new Word("daughter","tune"));
        familyMembers.add(new Word("older brother","taachi"));
        familyMembers.add(new Word("younger brother","chalitti"));
        familyMembers.add(new Word("older sister","tete"));
        familyMembers.add(new Word("younger sister","kolliti"));
        familyMembers.add(new Word("grandmother","ama"));
        familyMembers.add(new Word("grandfather","paapa"));

        WordAdapter familyMemberAdapter = new WordAdapter(this, familyMembers);

        ListView listView = findViewById(R.id.family_members);

        listView.setAdapter(familyMemberAdapter);
    }
}