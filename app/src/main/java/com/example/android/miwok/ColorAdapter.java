
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

public class ColorAdapter extends ArrayAdapter<Color> {

    public ColorAdapter(Activity context, ArrayList<Color> colors) {
        super(context, 0, colors);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Color color = getItem(position);

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView defaultWord = listItemView.findViewById(R.id.english);
        defaultWord.setText(color.getDefaultTranslation());

        TextView miwokWord = listItemView.findViewById(R.id.miwok);
        miwokWord.setText(color.getMiwokTranslation());

//        ImageView imageView = (ImageView) listItemView.findViewById(R.id.)
//        imageView.setImageResource();
        return listItemView;
    }
}