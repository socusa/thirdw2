package com.example.lynn.third;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Map;

public class MainActivity extends AppCompatActivity {
    public static MyView myView;
    public static MyListener listener = new MyListener();
    public static ChangeColors changeColors;
    public static ImageView[] images;
    public static Drawable x;
    public static ImageView first;
    public static ImageView second;
    public static Map<Integer,String> names;
    public static boolean keepGoing;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(myView = new MyView(this));
    }
}
