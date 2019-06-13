package com.example.lynn.third;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

import static com.example.lynn.third.MainActivity.*;

public class JuliaSetView extends View {

    public JuliaSetView(Context context) {
        super(context);
    }

    public void onDraw(Canvas canvas) {
        if (bitmap != null)
           canvas.drawBitmap(bitmap,0,0,null);
    }

}
