package com.example.lynn.third;

import android.content.Context;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.HashMap;

import static com.example.lynn.third.MainActivity.*;

public class MyView extends RelativeLayout {

    public void scramble(int[] input) {
        for (int counter=0;counter<100;counter++) {
            int position1 = (int)(input.length*Math.random());

            int position2 = (int)(input.length*Math.random());

            int temp = input[position1];
            input[position1] = input[position2];
            input[position2] = temp;
        }
    }

    public MyView(Context context) {
        super(context);

        changeColors = new ChangeColors();

        int[] drawables = {R.drawable.bear,
                R.drawable.bird,
                R.drawable.cat,
                R.drawable.cow,
                R.drawable.eagle,
                R.drawable.elephant,
                R.drawable.lioness,
                R.drawable.llama,
                R.drawable.panda,
                R.drawable.pig,
                R.drawable.rabbit,
                R.drawable.rhino,
                R.drawable.rooster,
                R.drawable.sheep,
                R.drawable.snake,
                R.drawable.tiger,
                R.drawable.turtle,
                R.drawable.zebra,
                R.drawable.bear,
                R.drawable.bird,
                R.drawable.cat,
                R.drawable.cow,
                R.drawable.eagle,
                R.drawable.elephant,
                R.drawable.lioness,
                R.drawable.llama,
                R.drawable.panda,
                R.drawable.pig,
                R.drawable.rabbit,
                R.drawable.rhino,
                R.drawable.rooster,
                R.drawable.sheep,
                R.drawable.snake,
                R.drawable.tiger,
                R.drawable.turtle,
                R.drawable.zebra};

        names = new HashMap<>();

        names.put(R.drawable.bear,"Bear");
        names.put(R.drawable.bird,"Bird");
        names.put(R.drawable.cat,"Cat");
        names.put(R.drawable.cow,"Cow");
        names.put(R.drawable.eagle,"Eagle");
        names.put(R.drawable.elephant,"Elephant");
        names.put(R.drawable.lioness,"Lioness");
        names.put(R.drawable.llama,"Llama");
        names.put(R.drawable.panda,"Panda");
        names.put(R.drawable.pig,"Pig");
        names.put(R.drawable.rabbit,"Rabbit");
        names.put(R.drawable.rhino,"Rhino");
        names.put(R.drawable.rooster,"Rooster");
        names.put(R.drawable.sheep,"Sheep");
        names.put(R.drawable.snake,"Snake");
        names.put(R.drawable.tiger,"Tiger");
        names.put(R.drawable.turtle,"Turtle");
        names.put(R.drawable.zebra,"Zebra");

        scramble(drawables);

        x = getResources().getDrawable(R.drawable.x);


    }

}
