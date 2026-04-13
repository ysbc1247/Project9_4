package com.example.project9_4;

import android.graphics.Canvas;
import android.graphics.Paint;

public class Rect extends Shape {
    public Rect(float startX, float startY, float endX, float endY) {
        super(startX, startY, endX, endY);
    }

    @Override
    public void draw(Canvas canvas, Paint paint) {
        float left = Math.min(startX, endX);
        float top = Math.min(startY, endY);
        float right = Math.max(startX, endX);
        float bottom = Math.max(startY, endY);
        canvas.drawRect(left, top, right, bottom, paint);
    }
}
