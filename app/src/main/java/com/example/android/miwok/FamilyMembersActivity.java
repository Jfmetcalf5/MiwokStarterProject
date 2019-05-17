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


        ArrayList<FamilyMember> familyMembers = new ArrayList<FamilyMember>();
        familyMembers.add(new FamilyMember("father","әpә"));
        familyMembers.add(new FamilyMember("mother","әṭa"));
        familyMembers.add(new FamilyMember("son","angsi"));
        familyMembers.add(new FamilyMember("daughter","tune"));
        familyMembers.add(new FamilyMember("older brother","taachi"));
        familyMembers.add(new FamilyMember("younger brother","chalitti"));
        familyMembers.add(new FamilyMember("older sister","tete"));
        familyMembers.add(new FamilyMember("younger sister","kolliti"));
        familyMembers.add(new FamilyMember("grandmother","ama"));
        familyMembers.add(new FamilyMember("grandfather","paapa"));

        FamilyMemberAdapter familyMemberAdapter = new FamilyMemberAdapter(this, familyMembers);

        ListView listView = findViewById(R.id.family_members);

        listView.setAdapter(familyMemberAdapter);
    }
}