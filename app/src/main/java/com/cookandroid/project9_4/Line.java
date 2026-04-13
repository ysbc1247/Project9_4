package com.cookandroid.project9_4;

import android.graphics.Canvas;
import android.graphics.Paint;

public class Line extends Shape {
    public Line(float startX, float startY, float endX, float endY) {
        super(startX, startY, endX, endY);
    }

    @Override
    public void draw(Canvas canvas, Paint paint) {
        canvas.drawLine(startX, startY, endX, endY, paint);
    }
}
