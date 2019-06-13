package com.example.lynn.third;

import android.view.View;

import static com.example.lynn.third.MainActivity.*;

public class MyThread implements Runnable {
    private Thread thread;

    public MyThread() {
        thread = new Thread(this);

        thread.start();
    }

    private void pause(double seconds) {
        try {
            Thread.sleep((int)(seconds*1000));
        } catch (Exception e) {

        }
    }

    @Override
    public void run() {
        pause(3);

        final boolean same = (first.getTag().equals(second.getTag())) ? true : false;

        images[0].post(new Runnable() {

            @Override
            public void run() {
                if (same) {
                    first.setVisibility(View.INVISIBLE);
                    second.setVisibility(View.INVISIBLE);

                    score += 5;
                } else {
                    first.setImageDrawable(x);
                    second.setImageDrawable(x);

                    score -= 1000;
                }

                scoreView.show();

                first = null;

                ready = true;
            }
        });



    }
}
