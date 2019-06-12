package com.example.lynn.third;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ScoreView extends LinearLayout {
    private Context context;
    private int score;
    private int[] digitIds;

    public ScoreView(Context context) {
        super(context);

        this.context = context;

        this.score = score;

        digitIds = new int[]{R.drawable.zero,
                R.drawable.one,
                R.drawable.two,
                R.drawable.three,
                R.drawable.four,
                R.drawable.five,
                R.drawable.six,
                R.drawable.seven,
                R.drawable.eight,
                R.drawable.nine};
    }

    public void setScore(int score) {
        this.score = score;

        show();
    }

    public void show() {
        removeAllViews();

        char[] characters = String.valueOf(score).toCharArray();

        ImageView[] views = new ImageView[characters.length];

        for (int counter=0;counter<characters.length;counter++) {
            views[counter] = new ImageView(context);

            if (Character.isDigit(characters[counter])) {
                int digit = characters[counter] - '0';

                views[counter].setImageDrawable(ContextCompat.getDrawable(context,digitIds[digit]));
            } else
                views[counter].setImageDrawable(ContextCompat.getDrawable(context,R.drawable.minus));

            int width = 600/String.valueOf(score).length();

            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(width,width);

            views[counter].setLayoutParams(layoutParams);

            addView(views[counter]);
        }
    }
}
