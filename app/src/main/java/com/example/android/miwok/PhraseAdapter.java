package com.example.android.miwok;

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

public class PhraseAdapter extends ArrayAdapter<Phrase> {

    public PhraseAdapter(Activity context, ArrayList<Phrase> phrasees) {
        super(context, 0, phrasees);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Phrase phrase = getItem(position);

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView defaultWord = listItemView.findViewById(R.id.english);
        defaultWord.setText(phrase.getDefaultTranslation());

        TextView miwokWord = listItemView.findViewById(R.id.miwok);
        miwokWord.setText(phrase.getMiwokTranslation());

//        ImageView imageView = (ImageView) listItemView.findViewById(R.id.)
//        imageView.setImageResource();
        return listItemView;
    }
}

