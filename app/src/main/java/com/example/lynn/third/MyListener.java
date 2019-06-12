package com.example.lynn.third;

import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ImageView;

import static com.example.lynn.third.MainActivity.*;

public class MyListener implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        ImageView source = (ImageView)view;

        int drawable = Integer.parseInt(source.getTag().toString());

        if (first == null && ready) {
            first = source;

            first.setImageDrawable(ContextCompat.getDrawable(source.getContext(),drawable));


        } else if (ready) {
            second = source;

            second.setImageDrawable(ContextCompat.getDrawable(source.getContext(),drawable));

            ready = false;

        }

    }

}
