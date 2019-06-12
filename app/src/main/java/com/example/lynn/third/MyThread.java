package com.example.lynn.third;

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

        boolean same = false;

        if (first.getTag().equals(second.getTag()))
            same = true;
        else
            same = false;

        images[0].post(new Runnable() {

            @Override
            public void run() {
                if (same)
            }
        });

    }
}
