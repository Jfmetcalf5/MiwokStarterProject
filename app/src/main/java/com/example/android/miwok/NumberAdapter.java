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

public class NumberAdapter extends ArrayAdapter<Number> {

    public NumberAdapter(Activity context, ArrayList<Number> numbers) {
        super(context, 0, numbers);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Number number = getItem(position);

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView defaultWord = listItemView.findViewById(R.id.english);
        defaultWord.setText(number.getDefaultTranslation());

        TextView miwokWord = listItemView.findViewById(R.id.miwok);
        miwokWord.setText(number.getMiwokTranslation());

//        ImageView imageView = (ImageView) listItemView.findViewById(R.id.)
//        imageView.setImageResource();
        return listItemView;
    }
}
